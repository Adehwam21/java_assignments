public class Employee {
    private String name;
    private double salary;
    private String position;
    private String email;
    private String phone;

    // SETTERS and GETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public static class Main {
        public static void main(String[] args) {
            Employee employee1 = new Employee();
            employee1.setName("Henry Twix");
            employee1.setSalary(50000.0);
            employee1.setPosition("Manager");
            employee1.setEmail("Hephix@company.com");
            employee1.setPhone("+23356888999");

            Employee employee2 = new Employee();
            employee2.setName("Fred Drew");
            employee2.setSalary(40000.0);
            employee2.setPosition("Assistant Manager");
            employee2.setEmail("freddydrew@company.com");
            employee2.setPhone("+23354667788");

            System.out.println("Employee 1:");
            System.out.println("Name: " + employee1.getName());
            System.out.println("Salary: " + employee1.getSalary());
            System.out.println("Position: " + employee1.getPosition());
            System.out.println("Email: " + employee1.getEmail());
            System.out.println("Phone: " + employee1.getPhone());

            System.out.println("Employee 2:");
            System.out.println("Name: " + employee2.getName());
            System.out.println("Salary: " + employee2.getSalary());
            System.out.println("Position: " + employee2.getPosition());
            System.out.println("Email: " + employee2.getEmail());
            System.out.println("Phone: " + employee2.getPhone());
        }
    }
}
