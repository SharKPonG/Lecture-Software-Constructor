package HomeWork6.ku.cs.swcon.Employee;

public class PartTimeEmployee extends Employee{
    private double hourlyRate;
    private int hoursWorked;
    PartTimeEmployee(String name, double hourlyRate, int hoursWorked){
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }
}