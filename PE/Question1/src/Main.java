
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thang
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter designer:");
        String ten = sc.nextLine();
        System.out.print("Enter power:");
        int so = sc.nextInt();
        Engine e = new Engine(ten, so);
        System.out.println("1.Test getDesigner()");
        System.out.println("2.Test setPower()");
        System.out.print("Enter TC(1 or 2):");
        int choice = sc.nextInt();
        switch(choice){
            case 1:{
                System.out.println("OUTPUT:");
                System.out.println(e.getDesigner());
                break;
            }
            case 2:{
                System.out.println("Enter new power: ");
                int n = sc.nextInt();
                e.setPower(n);
                System.out.println("OUTPUT:");
                System.out.println(e.getPower());
            }
        }
    }
}
