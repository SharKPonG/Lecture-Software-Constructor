package HomeWork5.HashSet.ku.cs.swcon;

import java.util.HashSet;

public class RegistrationChecker {
    private HashSet<String> registrants;

    public RegistrationChecker(){
        registrants = new HashSet<>();
    }

    public boolean register(String name){
        return registrants.add(name);
    }

    public void printAllRegistrants(){
        System.out.println("Registered: ");
        for(String name : registrants){
            System.out.println(name);
        }
    }


    public class main{
        public static void main(String[] args) {
            RegistrationChecker checker = new RegistrationChecker();
            System.out.println(checker.register("Noon")); // true
            System.out.println(checker.register("Noon")); // true
            System.out.println(checker.register("Noon")); // false
            checker.printAllRegistrants();
        }
    }
}
