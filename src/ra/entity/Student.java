package ra.entity;

import ra.itf.IStudent;
import java.util.Scanner;
public class Student implements IStudent {
    private String studentCode;
    private String studentName;
    private int age;
    private float diemToan;
    private float diemLy;
    private float diemHoa;
    private float diemTB;
    private boolean status;



    public Student() {
    }

    public Student(String studentCode, String studentName, int age, float diemToan, float diemLy, float diemHoa, float diemTB, boolean status) {
        this.studentCode = studentCode;
        this.studentName = studentName;
        this.age = age;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
        this.diemTB = diemTB;
        this.status = status;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getStudentName() {
        return studentName;
    }


    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public float getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(float diemLy) {
        this.diemLy = diemLy;
    }

    public float getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(float diemHoa) {
        this.diemHoa = diemHoa;
    }

    public float getDiemTB() {
        diemTB = (diemToan+diemLy+diemHoa)/3;
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public boolean isStatus() {
        if (diemTB>=MARK_PASS){
            status = true;
        }else {
            status = false;
        }
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào mã sinh viên");
        studentCode = scanner.nextLine();
        System.out.println("Nhập vào tên sinh viên");
        studentName = scanner.nextLine();
        System.out.println("Nhập vào điểm Toán");
        diemToan = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập vào điểm Lý");
        diemLy = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập vào điểm Hoá");
        diemHoa = Float.parseFloat(scanner.nextLine());
    }

    @Override
    public void displayData() {
        System.out.println("Mã SV : " + studentCode);
        System.out.println("Họ và tên  : " + studentName);
        System.out.println("Điểm Toán: "+ diemToan+" điểm Lý: "+diemLy+" điểm Hoá: "+diemHoa);
        System.out.println("Điểm TB 3 môn: "+ diemTB + ", Xét đỗ/trượt: "+ (status ? "pass: đỗ" : "fail: trượt"));

    }


}
