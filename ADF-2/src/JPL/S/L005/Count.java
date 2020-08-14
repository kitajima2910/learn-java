/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPL.S.L005;

/**
 *
 * @author Lan-T
 */
public class Count extends Thread {

    public Count() {
        super("my extending thread");
        System.out.println("my thread created " + this);
        start();
    }

    @Override
    public void run() {
        try {
            for(int i = 0; i < 10; i++) {
                System.out.println("Printing the count " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("my thread interrupted");
        }
        System.out.println("My thread run is over");
    }
    
//    public static void main(String[] args) {
//        Count c = new Count();
//        c.start();
//    }
    
}
