package ra2.run;

import ra.entity.Student;
import ra2.imp.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class BookRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        do {
            System.out.println("********MENU******** \n" +
                    "1.\tNhập thông tin sách \n" +
                    "2.\tHiển thị thông tin sách \n" +
                    "3.\tCập nhật thông tin sách theo mã sách \n" +
                    "4.\tXóa sách theo mã sách \n" +
                    "5.\tSắp xếp sách theo giá bán tăng dần \n" +
                    "6.\tThống kê sách theo khoảng giá (a-b nhập từ bàn phím)\n" +
                    "7.\tTìm kiếm sách theo tên tác giả \n" +
                    "8.\tThoát \n");
            System.out.println("Mời bạn chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Mời nhập số sách");
                    int bookNumber = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < bookNumber; i++) {
                        Book book = new Book();
                        book.inputData(scanner,i+1);
                        books.add(book);
                    }
                    break;
                case 2:
                    System.out.println("Hiển thị thông tin sách");
                    for (Book book : books){
                        book.displayData();

                    }
                    break;
                case 3:
                    System.out.println("Cập nhật thông tin sách theo mã sách");
                    System.out.println("mời bạn nhập ID book ");
                    String id = scanner.nextLine();
                    Book book = getBookByID(books,id);
                        if (book != null){
                            book.displayData();
                            System.out.println("bạn có muốn sửa lại thông tin k? (c/k)" );
                            String choice1 = scanner.nextLine();
                            if (choice1.equalsIgnoreCase("c")){
                                book.editData(scanner);
                                System.out.println("đã edit xong");
                                break;
                            } else {
                                System.out.println("huỷ sửa thông tin");
                            }
                        } else {
                            System.out.println("Không tồn tại cuốn sách có ID "+ id);
                        }
                    break;
                case 4:
                    System.out.println("Xóa sách theo mã sách");
                    System.out.println("mời bạn nhập ID book ");
                    String id1 = scanner.nextLine();
                    Book book1 = getBookByID(books,id1);
                    if (book1 != null){
                        book1.displayData();
                        System.out.println("bạn có muốn xoá thông tin k? (c/k)" );
                        String choice1 = scanner.nextLine();
                        if (choice1.equalsIgnoreCase("c")){
                            books.remove(book1);
                            System.out.println("đã xóa xong");
                            break;
                        } else {
                            System.out.println("huỷ xoá thông tin");
                        }
                    } else {
                        System.out.println("Không tồn tại cuốn sách có ID "+ id1);
                    }
                    break;

                case 5:
                    System.out.println("Sắp xếp sách theo giá bán tăng dần");
                    break;
                case 6:
                    System.out.println("Thống kê sách theo khoảng giá (a-b nhập từ bàn phím)");
                    break;
                case 7:
                    System.out.println("Tìm kiếm sách theo tên tác giả");
                    System.out.println("Mời nhập tên tác giả");
                    String authorName = scanner.nextLine().toLowerCase();
                    Book book3 = getBookByAuthor(books, authorName);
                    if (book3 != null) {
                        book3.displayData();
                        getBookByAuthor(books, authorName);
                        break;
                    } else {
                        System.out.println("Không tồn tại tác giả mà bạn muốn tìm");
                    }
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Mời chọn lại từ 1-8");

            }
        }while (true);
    }
    // check case 3: xem trong list books có tông tại id vừa nhập vào k nếu có nó trả về book trong list k thì trả về null
    private static Book getBookByID(List<Book> books,String id){
        for (Book book : books){
            if (book.getBookId().equalsIgnoreCase(id)){
                return book;
            }
        }
        return null;
    }

    private static Book getBookByAuthor(List<Book> books, String authorName) {
        for (Book book : books) {
            if (book.getAuthor().toLowerCase().contains(authorName)) {
                return book;
            }
        }
        return null;
    }
}
