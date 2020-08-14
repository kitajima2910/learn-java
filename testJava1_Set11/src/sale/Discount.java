/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sale;

/**
 *
 * @author DTP
 */
public interface Discount {
    public static final float DISCOUNT_PERCENT = 0.1f;
    void displayDetails();
    double computeDiscount();
}
