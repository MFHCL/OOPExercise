package Training;

public class Employee {
    String firstName;
    String lastName;
    double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        setMonthlySalary(monthlySalary);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {

        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if(monthlySalary > 0)
        this.monthlySalary = monthlySalary;
    }


}

class EmployeeTest{
    public static void main(String[] args) {
        Employee michael = new Employee("Michael", "Fraley", 500.00);
        Employee creigh = new Employee("Creigh", "Battle", 500.00);

        System.out.println(michael.getMonthlySalary()*12);
        System.out.println(creigh.getMonthlySalary()*12);


        michael.setMonthlySalary(michael.getMonthlySalary()* 1.10);
        creigh.setMonthlySalary(creigh.getMonthlySalary()* 1.10);

        System.out.println("With a 10% raise");
        System.out.println(michael.getMonthlySalary()*12);
        System.out.println("With a 10% raise");
        System.out.println(creigh.getMonthlySalary()*12);


    }
}