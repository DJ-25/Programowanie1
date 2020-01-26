package sda.prog1;

public class English extends Person {
        private String nationality;
        private boolean hasGuardian;
        private String taxNumber;
        {
            this.nationality = "English";
            this.hasGuardian = false;
        }
        public English(String firstName, String lastName
                , String taxNumber) {
            super(firstName, lastName);
            this.taxNumber = taxNumber;
        }
        public English(String firstName, String lastName
                , String sex, int age, String taxNumber) {
            super(firstName, lastName, sex, age);
            this.taxNumber = taxNumber;
        }
        @Override
        public String getIdentity() {
            return taxNumber;
        }
        @Override
        public boolean canDriveCar() {
            return ((getAge() > 16) || getAge() > 14 && hasGuardian)
                    ? true : false;
        }
        @Override
        public boolean canRace() {
            return getAge() > 12;
        }
    }

