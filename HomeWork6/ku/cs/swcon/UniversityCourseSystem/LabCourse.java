package HomeWork6.ku.cs.swcon.UniversityCourseSystem;


public class LabCourse extends Course{
    public LabCourse(String courseString, String title,int COURSE_COUNT){
        super(courseString,title,COURSE_COUNT);
    }

    @Override
    public int getCreditHour() {
        return 1;
    }

    @Override
    public void getInfo() {
        super.getInfo();
    }
}