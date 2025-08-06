package HomeWork6.ku.cs.swcon.Employee;

public class FullTimeEmployee extends Employee{
    private String position;
    private int experienceYears;
    FullTimeEmployee(String name,String position, int experienceYears){
        super(name);
        this.position = position;
        this.experienceYears = experienceYears;
    }
    

    @Override
    public double calculateSalary() {
        double baseSalary;
        switch (position) {
            case "Manager":
                baseSalary = 50000;
                break;
            case "Developer":
                baseSalary = 35000;
                break;
            case "Tester":
                baseSalary = 30000;
            default:
                baseSalary = 25000;
                break;
        }
        return baseSalary + (baseSalary * 0.03 *experienceYears);
        
    }


    @Override
    public void printInfo() {
        System.out.println("Name:" + name);
        System.out.println("Salary: " + position);
        super.printInfo();

    }
}