package product;

import java.util.Scanner;

public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Invoice objI = new Invoice();
        Scanner sc = new Scanner(System.in);
        int opt;
        while(true){
            System.out.println("1. Add new Items");
            System.out.println("2. Search and Display Item");
            System.out.println("3. Display Invoice");
            System.out.println("4. Quit Program");
            System.out.println("");
            System.out.print("Enter an optiion: ");
            opt = sc.nextInt();
            switch(opt){
                case 1:
                    objI.addItem();
                    break;
                case 2:
                    objI.searchItem();
                    break;
                case 3:
                    objI.displayInvoice();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Pls choose 1-4");
            }
        }
    }
}
