package HomeWork6.ku.cs.swcon.UniversityCourseSystem;

public class GeneralCourse extends Course {
    public GeneralCourse(String courseString, String title,int COURSE_COUNT){
        super(courseString, title, COURSE_COUNT);
    }

    @Override
    public int getCreditHour() {
        return 3;
    }

    @Override
    public void getInfo() {
        super.getInfo();
    }
}
