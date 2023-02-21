public class Person {
    private String firstName, lastName, phoneNumber, gender ;
    private int age;


    // no args constructor
    public Person(){}

    // set methods
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName= lastName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setGender(String gender) {
        this.gender= gender;
    }

    // get methods
    public String getFullName() {
        return firstName+" "+lastName;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static class Driver {
        // creating Person objects
        public static void main(String[] books) {

            Person person1 = new Person();
            Person person2 = new Person();
            Person person3 = new Person();

            // setting person1 properties
            person1.setFirstName("Aaron");
            person1.setLastName("Kudadjie");
            person1.setAge(20);
            person1.setGender("Male");
            person1.setPhoneNumber("+233443366335");

            // setting person2 properties
            person2.setFirstName("Makaila");
            person2.setLastName("Creppy");
            person2.setAge(35);
            person2.setGender("Female");
            person2.setPhoneNumber("+23345396605");

            // setting person3 properties
            person3.setFirstName("Denis");
            person3.setLastName("Green");
            person3.setAge(45);
            person3.setGender("Female");
            person3.setPhoneNumber("+23385446605");

            // display person1 details
            System.out.println("Person 1");
            System.out.println("Full name: "+person1.getFullName());
            System.out.println("Age: "+person1.getAge());
            System.out.println("Gender: "+person1.getGender());
            System.out.println("Phone Number: "+person1.getPhoneNumber()+"\n");

            // display person2 details
            System.out.println("Person 2");
            System.out.println("Full name: "+person2.getFullName());
            System.out.println("Age: "+person2.getAge());
            System.out.println("Gender: "+person2.getGender());
            System.out.println("Phone Number: "+person2.getPhoneNumber()+"\n");

            // display person3 details
            System.out.println("Person 3");
            System.out.println("Full name: "+person3.getFullName());
            System.out.println("Age: "+person3.getAge());
            System.out.println("Gender: "+person3.getGender());
            System.out.println("Phone Number: "+person3.getPhoneNumber()+"\n");

        }
    }
}
