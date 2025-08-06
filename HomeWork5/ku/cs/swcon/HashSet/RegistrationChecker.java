package HomeWork5.ku.cs.swcon.HashSet;

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
}
