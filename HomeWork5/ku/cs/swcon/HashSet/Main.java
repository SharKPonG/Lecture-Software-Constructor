package HomeWork5.ku.cs.swcon.HashSet;

    public class Main{
        public static void main(String[] args) {
            RegistrationChecker checker = new RegistrationChecker();
            System.out.println(checker.register("Noon")); // true
            System.out.println(checker.register("Noon")); // true
            System.out.println(checker.register("Noon")); // false
            checker.printAllRegistrants();
        }
    }