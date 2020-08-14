/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient;

import java.util.Scanner;

public class PatientTest {

    public static void main(String[] args) {
        PatientManager objPM = new PatientManager();
        Scanner sc = new Scanner(System.in);
        int opt;
        String ID = null;
        while (true) {
            System.out.println("1. New Patient");
            System.out.println("2. Display Patient");
            System.out.println("3. Save list of parent");
            System.out.println("4. Exit");
            System.out.println("");
            System.out.print("Enter an option[1-4]: ");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    objPM.addNew();
                    break;
                case 2:
                    sc = new Scanner(System.in);
                    System.out.print("Enter a ID to display: ");
                    ID = sc.nextLine();
                    objPM.display(ID);
                    break;
                case 3:
                    objPM.save();
                    break;
                case 4:
                    objPM.openFile();
                    return;

            }
        }
    }

}
