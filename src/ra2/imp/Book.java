package ra2.imp;

import ra2.IBook;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Book implements IBook {
    private String bookId;
    private String bookName;
    private int importPrice;   // giá nhập
    private int exportPrice;  // giá bán
    private String author;   // tác giả
    private String descriptions;    // mô tả

    public Book() {
    }

    public Book(String bookId, String bookName, int importPrice, int exportPrice, String author, String descriptions) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.author = author;
        this.descriptions = descriptions;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(int importPrice) {
        this.importPrice = importPrice;
    }

    public int getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(int exportPrice) {
        this.exportPrice = exportPrice;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    @Override
    public void inputData(Scanner scanner) {

    }

    @Override
    public void inputData(Scanner scanner, int index) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Sách thứ "+ index);
        System.out.println("Nhập vào ID book");
        do {
            bookId = scanner1.nextLine();
            Pattern pattern = Pattern.compile("([A-Z 0-9]{3})");
            Matcher matcher = pattern.matcher(bookId);
            boolean check = matcher.matches();
            if (check) {
//                System.out.println("ID hợp lệ");
                break;
            } else {
                System.out.println("ID không hợp lệ, mời nhập lại");
            }
        } while (true);


        System.out.println("Mời nhập tên sách");
        do {
            bookName = scanner1.nextLine();
            Pattern pattern1 = Pattern.compile("([a-z A-Z 0-9 \\s ]{1,})");
            Matcher matcher1 = pattern1.matcher(bookName);
            boolean check1 = matcher1.matches();
            if (check1) {
//                System.out.println("Tên sách hợp lệ");
                break;
            } else {
                System.out.println("Tên sách không hợp lệ, mời nhập lại");
            }
        } while (true);


        System.out.println("Mời nhập giá nhập vào");
        importPrice = Integer.parseInt(scanner1.nextLine());


        System.out.println("Mời nhập giá bán ra");
        do {
            exportPrice = Integer.parseInt(scanner1.nextLine());
            if (exportPrice > importPrice) {
                System.out.println("OK giá bán lớn hơn giá nhập sẽ có lãi");
                break;
            } else {
                System.out.println("Giá bán nhỏ hơn giá nhập, sẽ bị lỗ đó ");
            }
        } while (true);


        System.out.println("Mời nhập tên tác giả");
        do {
            author = scanner1.nextLine();
            Pattern pattern2 = Pattern.compile("([a-z A-Z 0-9 \\s ]{1,})");
            Matcher matcher2 = pattern2.matcher(author);
            boolean check1 = matcher2.matches();
            if (check1) {
//                System.out.println("Tên tác giả hợp lệ");
                break;
            } else {
                System.out.println("Tên tác giả không hợp lệ, mời nhập lại");
            }
        } while (true);


        System.out.println("Mời nhập mô tả sách");
        do {
            descriptions = scanner1.nextLine();
            Pattern pattern2 = Pattern.compile("([a-z A-Z \\s]{3,})");
            Matcher matcher2 = pattern2.matcher(author);
            boolean check1 = matcher2.matches();
            if (check1) {
//                System.out.println("Mô tả hợp lệ");
                break;
            } else {
                System.out.println("Mô tả không hợp lệ, mời nhập lại");
            }
        } while (true);

    }

    public Book editData(Scanner scanner){
        System.out.println("Mời nhập tên sách");
        do {
            bookName = scanner.nextLine();
            Pattern pattern1 = Pattern.compile("([a-z A-Z \\s]{1,})");
            Matcher matcher1 = pattern1.matcher(bookName);
            boolean check1 = matcher1.matches();
            if (check1) {
//                System.out.println("Tên sách hợp lệ");
                break;
            } else {
                System.out.println("Tên sách không hợp lệ, mời nhập lại");
            }
        } while (true);


        System.out.println("Mời nhập giá nhập vào");
        importPrice = Integer.parseInt(scanner.nextLine());

        System.out.println("Mời nhập giá bán ra");
        do {
            exportPrice = Integer.parseInt(scanner.nextLine());
            if (exportPrice > importPrice) {
                System.out.println("OK giá bán lớn hơn giá nhập sẽ có lãi");
                break;
            } else {
                System.out.println("Giá bán nhỏ hơn giá nhập, sẽ bị lỗ đó ");
            }
        } while (true);


        System.out.println("Mời nhập tên tác giả");
        do {
            author = scanner.nextLine();
            Pattern pattern2 = Pattern.compile("([a-z A-Z \\s]{3,})");
            Matcher matcher2 = pattern2.matcher(author);
            boolean check1 = matcher2.matches();
            if (check1) {
//                System.out.println("Tên tác giả hợp lệ");
                break;
            } else {
                System.out.println("Tên tác giả không hợp lệ, mời nhập lại");
            }
        } while (true);

        System.out.println("Mời nhập mô tả sách");
        do {
            descriptions = scanner.nextLine();
            Pattern pattern2 = Pattern.compile("([a-z A-Z \\s]{3,})");
            Matcher matcher2 = pattern2.matcher(author);
            boolean check1 = matcher2.matches();
            if (check1) {
//                System.out.println("Mô tả hợp lệ");
                break;
            } else {
                System.out.println("Mô tả không hợp lệ, mời nhập lại");
            }
        } while (true);
        return this;
    }

    @Override
    public void displayData() {
        System.out.printf("ID book: %s, Tên sách: %s, Tên tác giả: %s, Mô tả sách: %s, Giá nhập: %d, Giá bán: %d \n",bookId,bookName,author,descriptions,importPrice,exportPrice);
    }
}
