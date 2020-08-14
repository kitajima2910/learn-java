/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stud;
import java.util.Scanner;

/**
 *
 * @author DTP
 */
public class Student {
    int id;
    String name, batch, strId, strMath, strPhys, strChem;
    float mathematic_mark, physic_mark, chemystry_mark;
    Scanner sc;
    public Student() {
        //id
        while(true){
            try {
                sc = new Scanner(System.in);
                System.out.print("Enter a Student ID: ");
                strId = sc.nextLine();
                if (strId.isEmpty()){
                    throw new Exception("Cannot be blank !!!");
                }
                id = Integer.parseInt(strId);
                if (id <= 0){
                    throw new Exception("ID must be greater than Zero");
                }
                break;
            }
            catch(NumberFormatException e){
                System.out.println("ID must be number !!!");
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
                sc = new Scanner(System.in);
            }
        }
        //name
        while(true){
            try {
                sc = new Scanner(System.in);
                System.out.print("Enter a Student Name: ");
                name = sc.nextLine();
                if (name.isEmpty()){
                    throw new Exception("Cannot be blank !!!");
                }
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                sc = new Scanner(System.in);
            }
        }
        //batch
        while(true){
            try {
                sc = new Scanner(System.in);
                System.out.print("Enter a Batch: ");
                batch = sc.nextLine();
                if (batch.isEmpty()){
                    throw new Exception("Cannot be blank !!!");
                }
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                sc = new Scanner(System.in);
            }
        }
        //math
        while(true){
            try {
                sc = new Scanner(System.in);
                System.out.print("Enter a Math Mark: ");
                strMath = sc.nextLine();
                if (strMath.isEmpty()){
                    throw new Exception("Cannot be blank !!!");
                }
                mathematic_mark = Float.parseFloat(strMath);
                if (mathematic_mark < 0 || mathematic_mark > 100){
                    throw new Exception("Mark must be greater than Zero");
                }
                break;
            }
            catch(NumberFormatException e){
                System.out.println("Mark must be number !!!");
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
                sc = new Scanner(System.in);
            }
        }
        //physic
        while(true){
            try {
                sc = new Scanner(System.in);
                System.out.print("Enter a Physic Mark: ");
                strPhys = sc.nextLine();
                if (strPhys.isEmpty()){
                    throw new Exception("Cannot be blank !!!");
                }
                physic_mark = Float.parseFloat(strPhys);
                if (physic_mark < 0 || physic_mark > 100){
                    throw new Exception("Mark must be greater than Zero");
                }
                break;
            }
            catch(NumberFormatException e){
                System.out.println("Mark must be number !!!");
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
                sc = new Scanner(System.in);
            }
        }
        //chemy
        while(true){
            try {
                sc = new Scanner(System.in);
                System.out.print("Enter a Chemystry Mark: ");
                strChem = sc.nextLine();
                if (strMath.isEmpty()){
                    throw new Exception("Cannot be blank !!!");
                }
                chemystry_mark = Float.parseFloat(strChem);
                if (chemystry_mark < 0 || chemystry_mark > 100){
                    throw new Exception("Mark must be greater than Zero");
                }
                break;
            }
            catch(NumberFormatException e){
                System.out.println("Mark must be number !!!");
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
                sc = new Scanner(System.in);
            }
        }
        //
    }
    
    public float average(){
        return (mathematic_mark+physic_mark+chemystry_mark)/3;
    }
    
    public void print(){
        System.out.println("------------Students details---------------");
        System.out.println("ID: " +id);
        System.out.println("Name: " +name);
        System.out.println("Math Mark: " +mathematic_mark);
        System.out.println("Physic Mark: " +physic_mark);
        System.out.println("Chemy Mark: " +chemystry_mark);
        System.out.println("Average: " +average());
        System.out.println("");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
