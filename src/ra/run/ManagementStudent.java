package ra.run;

import ra.entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagementStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> list = new ArrayList<>();
        do {
            System.out.println("********************************MENU*************************** \n" +
                    "1.\tNhập thông tin n sinh viên \n" +
                    "2.\tTính điểm trung bình sinh viên \n" +
                    "3.\tXét điểm qua cho sinh viên \n" +
                    "4.\tHiển thị thông tin sinh viên \n" +
                    "5.\tThoát \n");
            System.out.println("Mời bạn chọn");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Mời bạn nhập số sinh viên ");
                    int n = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < n; i++) {
                        Student student = new Student();
                        student.inputData();
                        list.add(student);
                    }

                    break;
                case 2:
                    System.out.println("2.Tính điểm trung bình sinh viên ");
                    for (Student student : list) {
                        student.getDiemTB();
                        System.out.println("sinh vien "+student.getStudentName() +" co diem TB la: "+ student.getDiemTB());
                    }
                    break;
                case 3:
                    System.out.println("3.Tính điểm đỗ/ trượt cho sinh viên ");
                    for (Student student : list) {
                        student.isStatus();
                        if (student.isStatus()){
                            System.out.println("sinh vien "+ student.getStudentName()+ " đỗ");
                        } else {
                            System.out.println("sinh vien "+ student.getStudentName()+ " truot");
                        }
                    }
                    break;
                case 4:
                    System.out.println("4.Hiển thị thông tin sinh viên ");
                    System.out.println("Danh sách sinh viên ");
                    for (Student student : list) {
                        student.displayData();
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Mời chọn lại từ 1-5");

            }
        } while (true);

    }
}