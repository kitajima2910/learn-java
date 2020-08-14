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
public class ThreadDemo3 {
    public static void main(String[] args) {
        Count1 c = new Count1();
        try {
            while(c.myThread.isAlive()) {
                System.out.println("Main thread will be alive till the child thread is live");
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread's run is over");
    }
}
