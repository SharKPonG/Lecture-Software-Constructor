package HomeWork5.ku.cs.swcon.ArrayList;

    public class Main{
        public static void main(String[] args) {
            // object
            ClassroomManager room = new ClassroomManager();

            // polymorphism
            room.addStudent("Noon");
            room.addStudent("Noon");
            room.removeStudent("Noon");
            room.printStudents();
        }
    }
       