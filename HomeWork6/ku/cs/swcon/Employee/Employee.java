package HomeWork6.ku.cs.swcon.Employee;

public abstract class Employee {
    protected String name;

    public Employee(String name){
        this.name = name;
    }

    public abstract double calculateSalary();

    public void printInfo(){
        System.out.println("Name:" + name);
        System.out.println("Salary: " + calculateSalary());
    }
}