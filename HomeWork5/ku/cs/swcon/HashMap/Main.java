package HomeWork5.ku.cs.swcon.HashMap;

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