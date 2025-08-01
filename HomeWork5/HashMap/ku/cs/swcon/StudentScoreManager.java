package HomeWork5.HashMap.ku.cs.swcon;

import java.util.HashMap;

public class StudentScoreManager {

    private HashMap<String, Double> studentScores;

    public StudentScoreManager(){
        studentScores = new HashMap<>();     
    }
    public void addOrUpdateScore(String studentId, double score){
        studentScores.put(studentId, score);
    }
    public Double getScore(String studentId){
        return studentScores.get(studentId);
    }
    public void printAllScore(){
        System.out.println("Student Score: ");
        for(String id : studentScores.keySet()){
            System.out.println(id + ":" + studentScores.get(id));
        }
    }
    public class Main {
        public static void main(String[] args) {
            StudentScoreManager manager = new StudentScoreManager();
            manager.addOrUpdateScore("671040", 80);
            manager.addOrUpdateScore("671040", 80);
            manager.addOrUpdateScore("671040", 80);
            System.out.println(manager.getScore("671040"));
            manager.printAllScore();
        }
    }
}
