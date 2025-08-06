package HomeWork6.ku.cs.swcon.UniversityCourseSystem;

public abstract class Course {
    private final String courseCode;
    private String title;
    public static int courseCount = 0;

    public Course(String courseString, String title,int COURSE_COUNT){
        this.courseCode = courseString;
        this.title = title;
        COURSE_COUNT++;
    }

    public abstract int getCreditHour();

    public void getInfo() {
        System.out.println( "Course Code: " + courseCode);
        System.out.println("Title: " + title);
         System.out.println("Credit: " + getCreditHour());
    }
}
