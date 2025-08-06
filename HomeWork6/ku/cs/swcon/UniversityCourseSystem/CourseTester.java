package HomeWork6.ku.cs.swcon.UniversityCourseSystem;

public class CourseTester {
public static void main(String[] args) {
    Course c1 = new GeneralCourse("GE101", "English Communication", 0);
    Course c2 = new GeneralCourse("GE102", "Thai Civilization", 0);
    Course c3 = new LabCourse("CS103L", "Programming Lab", 0);

    System.out.println();
    System.out.println();
    System.out.println();

    System.out.println("จำนวนวิชาทั้งหมดที่เปิดสอน: " + Course.courseCount);
    }
}