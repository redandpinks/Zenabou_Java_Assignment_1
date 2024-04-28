package chaper3;

/*please make this code easy to understand 
Create a class called Employee that includes three 
instance variables—a first name (type String), a last name (type String) and a monthly salary (double). 
Provide a constructor that initializes the three instance variables. 
Provide a set and a get method for each instance variable. 
If the monthly salary is not positive, do not set its value.
 Write a test app named EmployeeTest that demonstrates class Employee’s capabilities. 
 Create two Employee objects and display each object’s yearly salary. 
 Then give each Employee a 10% raise and display each Employee’s yearly salary again.
 */

 public class Employeeclass {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employeeclass(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        setMonthlySalary(monthlySalary);
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public double getMonthlySalary() { return monthlySalary; }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = Math.max(0, monthlySalary);
    }

    public double getYearlySalary() { return monthlySalary * 12; }

    public void raiseSalary(double percentage) {
        monthlySalary *= (1 + percentage / 100);
    }

    public static void main(String[] args) {
        Employeeclass employee1 = new Employeeclass("Jack", "Jones", 5000);
        Employeeclass employee2 = new Employeeclass("Rose", "Mary", 6000);

        displayYearlySalary(employee1, 1);
        displayYearlySalary(employee2, 2);

        raiseAndDisplay(employee1, 10);
        raiseAndDisplay(employee2, 10);
    }

    private static void displayYearlySalary(Employeeclass employee, int employeeNumber) {
        System.out.println("Employee " + employeeNumber + " Yearly Salary: " + employee.getYearlySalary());
    }

    private static void raiseAndDisplay(Employeeclass employee, double percentage) {
        employee.raiseSalary(percentage);
        System.out.println("After " + percentage + "% Raise:");
        displayYearlySalary(employee, 1);
    }
}
