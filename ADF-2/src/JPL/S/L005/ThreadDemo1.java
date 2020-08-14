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
public class ThreadDemo1 extends Thread {

    @Override
    public void run() {
        System.out.println("My thread is in running state.");
    }
    
    public static void main(String[] args) {
        ThreadDemo1 threadDemo1 = new ThreadDemo1();
        threadDemo1.start();
    }
}
