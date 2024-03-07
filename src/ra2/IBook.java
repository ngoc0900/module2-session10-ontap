package ra2;

import java.util.Scanner;

public interface IBook {
    void inputData(Scanner scanner);    //nhập thông tin đối tượng

    void inputData(Scanner scanner, int index);

    void displayData();           //hiển thị thông tin đối tượng
}
