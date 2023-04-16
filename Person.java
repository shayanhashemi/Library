package university.step4;

public class Person {
        public String name;
        public String phoneNumber;
        public int personID;

        public void personInfo() {
            System.out.println("id: " + personID + " - name: " + name + " - phone: " + phoneNumber);
        }

        public Person(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.personID = personID;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public void setPersonID(int personID) {
            this.personID = personID;
        }

        public String getName() {
            return name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public int getPersonID() {
            return personID;
        }


}
