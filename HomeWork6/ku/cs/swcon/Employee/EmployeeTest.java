package HomeWork6.ku.cs.swcon.Employee;

    public class EmployeeTest {
        public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("Alice", "Manager", 5);
        Employee emp2 = new PartTimeEmployee("Bob", 200.0, 20);
        Employee emp3 = new FullTimeEmployee("Charlie", "Developer", 3);

        Employee[] employees = {emp1, emp2, emp3};

        for (Employee e : employees) {
                e.printInfo();
            }
        }
    }