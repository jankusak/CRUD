package cz.crudSkillmea.db;

public class Contact {
        private final int id;
        private final String name;
        private final String email;
        private final String phone;

        public Contact(int id, String name, String email, String phone) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.phone = phone;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public String getPhone() {
            return phone;
        }

        @Override
        public String toString() {
            return "Contact{" + "id=" + id +
                    ", name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", phone='" + phone + '\'' +
                    '}';
        }
    }

