package cz.crudSkillmea.db;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class HikariCPDataSource {

    private static final HikariConfig config = new HikariConfig();
    private static final HikariDataSource ds;

    private static final Logger logger = LoggerFactory.getLogger(HikariCPDataSource.class);


    static {
        final Properties prop = new Properties();
        try {
            prop.load(HikariCPDataSource.class.getResourceAsStream("/application.properties"));
        } catch (Exception e) {
            logger.error("Error while loading application.properties file!", e);
        }

        config.setJdbcUrl("jdbc:mysql://localhost:3306/" + prop.getProperty("db.name"));
        config.setUsername(prop.getProperty("db.username"));
        config.setPassword(prop.getProperty("db.password"));
        ds = new HikariDataSource(config);
    }

    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    private HikariCPDataSource() {

    }
}

