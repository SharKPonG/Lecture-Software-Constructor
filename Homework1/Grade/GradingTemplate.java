package Homework1.Grade;

import java.util.Scanner;

public class GradingTemplate{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Total score: ");
        double scoreTotal = in.nextDouble();
        System.out.print("Exam Score(mid+final");
        double scoreExam = in.nextDouble();
        System.out.print("Project Status (true:false / false:unfinish): ");
        boolean projectStatus = in.nextBoolean();
        System.out.print("Absent:");
        int numAbsent = in.nextInt();
        System.out.println("Your grade: "+ getGrade(scoreTotal, scoreExam, projectStatus, numAbsent));
        
    }

    public static String getGrade(double  scoreTotal, double scoreExam, boolean projectStatus, int numAbsent) {
        

        if (numAbsent > 3){
            return "F";
        }

        if (scoreExam < 40){
            return "F";
        }


        if (!projectStatus){
            return "I";
        }

        if (scoreTotal >= 80){
            return "A";
        }else if (scoreTotal >= 75){
            return "B+";
        }else if (scoreTotal >= 70){
            return "B";
        }else if (scoreTotal >= 65){
            return "C+";
        }else if (scoreTotal >= 60){
            return "C";
        }else{
            return "F";
        }
    }
}

