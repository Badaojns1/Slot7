
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
        System.out.print("Enter label: ");
        String label = sc.nextLine();
        System.out.print("Enter type: ");
        int type = sc.nextInt();
        System.out.print("Enter step: ");
        int step = sc.nextInt();
        System.out.println("1. Test toString()");
        System.out.println("2. Test setData()");
        System.out.println("3. Test getValue()");
        System.out.print("Enter TC(1,2,3): ");
        
        int choice = sc.nextInt();
        
        Robot robot = new Robot(label, type);
        SpecRobot specRobot = new SpecRobot(step, label, type);
        
        System.out.println("OUTPUT:");
        switch(choice){
            case 1:{
                System.out.println(robot.toString());
                System.out.println(specRobot.toString());
                break;
            }
            case 2:{
                specRobot.setData();
                break;
            }
            case 3:{
                System.out.println(specRobot.getValue());
            }
        }
    }
}
