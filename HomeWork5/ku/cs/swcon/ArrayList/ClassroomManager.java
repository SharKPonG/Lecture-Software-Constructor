package HomeWork5.ku.cs.swcon.ArrayList;

import java.util.ArrayList;

class ClassroomManager {

    private ArrayList<String> students;

    public ClassroomManager(){
        students = new ArrayList<>();
    }
    // method
    public void addStudent(String name ){
        if (name != null && !name.isBlank()){
            students.add(name);
        }
    }

    public void removeStudent(String name){
        students.remove(name);
    }

    public void printStudents(){
        System.out.println("List of students:");
        for(int i = 0; i < students.size(); i++ ){
            System.out.printf("%d %s\n", i + 1, students.get(i));
        }
    } 
}


// //2. ระบบบันทึกรายชื่อนักเรียนด้วย ArrayList
// สถํานกํารณ์: โรงเรียนต้องการสร้างระบบจัดการรายชื่อนักเรียนในแต่ละห้องเรียน โดยสามารถเพิ่มชื่อ, ลบชื่อ
// และแสดงรายชื่อนักเรียนทั้งหมด
// ค ําชี้แจง:
// • ให้สร้างคลาส ClassroomManager ใน package ku.cs.swcon
// • ภายในคลาสให้ใช้ArrayList<String> เพื่อจัดเก็บชื่อ
// • สร้างเมธอดดังนี้:
// o void addStudent(String name)
// o void removeStudent(String name)
// o void printStudents()

// ตัวอย่ํางกํารใช้งําน:
// ClassroomManager room = new ClassroomManager();
// room.addStudent("Somchai");
// room.addStudent("Suda");
// room.removeStudent("Somchai");
// room.printStudents();
// ผลลัพธ์ที่ต้องกําร (Expected Output):
// List of students:
// 1. Suda

// หมํายเหตุ: - ให้แสดงเลขล าดับก ากับหน้าแต่ละชื่อ
// - addStudent(String name) ควรตรวจสอบว่าไม่ใช่ String ว่าง (" ") หรือพวก whitespace (" ",
// "\t", "\n") โดยอาจใช้ค าสั่ง if (name != null && !name.isBlank())           