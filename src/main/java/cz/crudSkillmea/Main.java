package cz.crudSkillmea;

import cz.crudSkillmea.db.DBContactService;
import cz.crudSkillmea.db.HikariCPDataSource;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        DBContactService service = new DBContactService();
        service.readAll().forEach(System.out::println);
    }
}