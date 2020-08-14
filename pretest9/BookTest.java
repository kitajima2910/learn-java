package allbaitapjava2.pretest9;

import java.util.Scanner;

public class BookTest {

    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        BookManager b = new BookManager();
        do {
            System.out.println("~~~~~~~~~~~~~~~~~~~~**.**~~~~~~~~~~~~~~~~~~~~");
            System.out.println("|                    MENU                   |");
            System.out.println("~~~~~~~~~~~~~~~~~~~~**.**~~~~~~~~~~~~~~~~~~~~");
            System.out.println("|   1. Create a new Book                    |");
            System.out.println("|   2. Show all                             |");
            System.out.println("|   3. Save File                            |");
            System.out.println("|   4. Exit                                 |");
            System.out.println("~~~~~~~~~~~~~~~~~~~~**.**~~~~~~~~~~~~~~~~~~~~");
            System.out.println("your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    b.addNewBook();
                    break;
                case 2:
                    b.display();
                    break;
                case 3:
                    b.save();
                    break;
                case 4:
                    b.docfile();
                    break;
                default:
                    System.out.println("Không có lựa chọn này!!!");
            }
        } while (choice != 7);
    }
}
