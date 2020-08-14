package allbaitapjava2.pretest9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class BookManager {

    TreeMap<String, Book> BookTreeMap = new TreeMap<String, Book>();
    Book b = new Book();

    public void addNewBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----Book's Information-----");
        do {
            System.out.println("Input Id [Bxxxx-Axx]: ");
            String bookID = scanner.nextLine();
            b.setBookID(bookID);
        } while (!Pattern.compile("^B[0-9]{4}-A[0-9]{2}$").matcher(b.getBookID()).matches());

        System.out.println("Input Category: ");
        String category = scanner.nextLine();
        b.setCategory(category);

        do {
            System.out.println("Input title: ");
            String title = scanner.nextLine();
            b.setTitle(title);
            if (b.getTitle().isEmpty()) {
                System.out.println("Title must not null!!!");
            } else {
                break;
            }
        } while (true);

        do {
            System.out.println("Input author: ");
            String author = scanner.nextLine();
            b.setAuthor(author);
            if (b.getAuthor().isEmpty()) {
                System.out.println("Author must not null!!!");
            } else {
                break;
            }
        } while (true);

        System.out.println("Input price: ");
        int price = Integer.parseInt(scanner.nextLine());
        b.setPrice(price);

        BookTreeMap.put(b.getBookID(), b);
    }

    public void display() {
        if (BookTreeMap.isEmpty()) {
            System.out.println("no data!!");
        } else {
            for (Map.Entry<String, Book> entry : BookTreeMap.entrySet()) {
                String key = entry.getKey();
                Book value = entry.getValue();
                System.out.println("Book ID: " + value.getBookID());
                System.out.println("Category: " + value.getCategory());
                System.out.println("Title: " + value.getTitle());
                System.out.println("Author: " + value.getAuthor());
                System.out.println("Price: " + value.getPrice());
            }
        }
    }

    public void save() {
        FileWriter fw = null;
        try {
            //gắn thêm true để ko bị ghi đè, chỉ ghi tiếp
            fw = new FileWriter("Book.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Map.Entry<String, Book> entry : BookTreeMap.entrySet()) {
                String key = entry.getKey();
                Book value = entry.getValue();
                bw.write("\r" + entry.toString());
            }

            bw.flush(); //làm sạch bộ nhớ đệm
            bw.close(); //đóng luồng
            fw.close(); //đóng luồng
        } catch (Exception e) {
        }

    }
    
     public void docfile() {
        Runtime r = Runtime.getRuntime();
        try {
            r.exec("notepad.exe Book.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
