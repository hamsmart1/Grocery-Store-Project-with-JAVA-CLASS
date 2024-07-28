
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hamsmart
 */
import java.util.Scanner;
public class GroceryStoreProject_Final {
        public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
       String T="";
       int product = 0;
       int qty = 0;
       int p = 0;
       double sum=0.0;
       String tf = "";
        System.out.println("T : "
                +"\n"
                +"1.Drink"
                +"\n"
                +"2.Snack"
                +"\n"
                +"3.Householditem "
                +"\n"+"4.Dryfood ");
        System.out.println("-----------------------------");
        System.out.print("Select T : ");
       T = input.nextLine();T=T.toUpperCase();
        
    switch(T){
        case "DRINK":
            System.out.print("Do you need to buy drink? Y/N : ");
            tf=input.nextLine();tf=tf.toUpperCase();
             while(tf.equals("Y")){
                System.out.println("Select product?"
                        +"\n"
                        +"1 : Pepsi 10 BATH"
                        +"\n"+"2 : Mineral Water 26 BATH"
                        +"\n"+"3 : Milk 30 BATH"
                        +"\n"+"4 : Sprite 25 BATH");
                System.out.println("-----------------------------");
                System.out.print("input product number : ");
                product = input.nextInt();
                if(product==1){
                    p=10+1;
                }else if(product==2){
                    p=26+2;
                }else if(product==3){
                    p=30+2;
                }else if(product==4){
                    p=25+2;
                }else{
                    System.out.println("no menu");
                }
                System.out.print("input qty : ");
                qty = input.nextInt();sum+=(qty*p);
                System.out.print("Do you need more ? Y/N : ");
                
                tf=input.next();tf=tf.toUpperCase();
                }
                if(tf.equals("N")){
                    System.out.print("Are you member ? Y/N : ");
                    String member ="";
                    member = input.next();
                    member = member.toUpperCase();
                    if(member.equals("Y")){
                        if(sum>=100){
                            sum=sum*0.05;
                            System.out.println("You are member");
                            System.out.println("Total discount5%+vat7% : "+sum+" Bath!");
                        }else if(sum>=200){
                            sum=sum*0.1; 
                            System.out.println("You are member");
                            System.out.println("Total discount10%+vat7% : "+sum+" Bath!");
                        }else{
                            System.out.println("You are member");
                            System.out.println("Total+vat7% : "+sum+" no discount");
                        }
                    }else{
                        System.out.println("You are not member");
                        System.out.println("Total+vat7% : "+sum+" no discount");
                        }
                    }
                
                break;
        case "SNACK":
                    System.out.print("Do you need to buy Snack? Y/N : ");
                    tf = input.nextLine();
                    tf = tf.toUpperCase();
                    while (tf.equals("Y")) {
                        System.out.println("Select product ?"
                                + "\n"
                                + "1 : Changnoi 10 BATH"
                                + "\n" + "2 : Taro 20 BATH"
                                + "\n" + "3 : Lays 20 BATH"
                                + "\n" + "4 : ChokiChoKi 5 BATH");
                        System.out.println("-----------------------------");
                        System.out.print("Input product number : ");
                        product = input.nextInt();
                        if (product == 1) {
                            p = 10+1;
                        } else if (product == 2) {
                            p = 20+1;
                        } else if (product == 3) {
                            p = 20+1;
                        } else if  (product == 4){
                            p = 5;
                        } else {
                            System.out.println("no product");
                        }
                        System.out.print("input qty : ");
                        qty = input.nextInt();sum += (qty*p);
                        System.out.print("Do you need more ? Y/N : ");
                        tf = input.next();
                        tf = tf.toUpperCase();
                    }
                    if (tf.equals("N")) {
                        System.out.print("Are you member ? Y/N : ");
                        String member = "";
                        member = input.next();
                        member = member.toUpperCase();
                        if (member.equals("Y")) {
                            if (sum >= 50) {
                                sum = sum * 0.05;
                                System.out.println("You are member");
                                System.out.println("Total discount5%+vat7% : " + sum + " Bath!");
                            } else if (sum >= 100) {
                                sum = sum * 0.1;
                                System.out.println("You are member");
                                System.out.println("Total discount10%+vat7% : " + sum + " Bath!");
                            } else {
                                System.out.println("You are member");
                                System.out.println("Total+vat7% : "+sum+" no discount");
                            }
                        } else {
                            System.out.println("You are not member");
                            System.out.println("Total+vat7% : "+sum+" no discount");
                        }
                    }

                    break;
        case "HOUSEHOLDITEM":
                    System.out.print("Do you need to buy household items? Y/N : ");
                    tf = input.nextLine();
                    tf = tf.toUpperCase();
                    while (tf.equals("Y")) {
                        System.out.println("Select product?"
                                + "\n" +
                                "1 : Soap 20 BATH"
                                + "\n" + "2 : Protex 109 BATH"
                                + "\n" + "3 : Omo 40 BATH"
                                + "\n" + "4 : Sunlight 40 BATH");
                        System.out.println("-----------------------------");
                        System.out.print("input product number : ");
                        product = input.nextInt();
                        if (product == 1) {
                            p = 20+1;
                        } else if (product == 2) {
                            p = 109+8;
                        } else if (product == 3) {
                            p = 40+3;
                        } else if  (product == 4){
                            p = 40+3;
                        } else {
                            System.out.println("no product");
                        }
                        System.out.print("input qty : ");
                        qty = input.nextInt();sum += (qty * p);
                        System.out.print("Do you need more ? Y/N : ");
                        tf = input.next();
                        tf = tf.toUpperCase();
                    }
                    if (tf.equals("N")) {
                        System.out.print("Are you member ? Y/N : ");
                        String member = "";
                        member = input.next();
                        member = member.toUpperCase();
                        if (member.equals("Y")) {
                            if (sum >= 100) {
                                sum = sum * 0.05;
                                System.out.println("You are member");
                                System.out.println("Total discount5%+vat7% : " + sum + " Bath!");
                            } else if (sum >= 200) {
                                sum = sum * 0.1;
                                System.out.println("You are member");
                                System.out.println("Total discount10%+vat7% : " + sum + " Bath!");
                            } else {
                                System.out.println("You are member");
                                System.out.println("Total+vat7% : "+sum+" no discount");
                            }
                        } else {
                            System.out.println("You are not member");
                            System.out.println("Total+vat7% : "+sum+" no discount");
                        }
                    }

                    break;
        case "DRYFOOD":
                    System.out.print("Do you need to buy dry food? Y/N : ");
                    tf = input.nextLine();
                    tf = tf.toUpperCase();
                    while (tf.equals("Y")) {
                        System.out.println("Select product?"
                                + "\n"
                                + "1 : MAMA OK 15 BATH"
                                + "\n"
                                + "2 : YUMYUM JUMBO 7 BATH"
                                + "\n" + "3 : WAIWAI 7 BATH"
                                + "\n" + "4 : Nissin 10 BATH");
                        System.out.println("-----------------------------");
                        System.out.print("input product number : ");
                        product = input.nextInt();
                        if (product == 1) {
                            p = 15+1;
                        } else if (product == 2) {
                            p = 7+1;
                        } else if (product == 3) {
                            p = 7+1;
                        } else if  (product == 4){
                            p = 10+1;
                        } else {
                            System.out.println("no product");
                        }
                        System.out.print("input qty : ");
                        qty = input.nextInt();sum += (qty * p);
                        System.out.print("Do you need more ? Y/N : ");
                        tf = input.next();
                        tf = tf.toUpperCase();
                    }
                    if (tf.equals("N")) {
                        System.out.print("Are you member ? Y/N : ");
                        String member = "";
                        member = input.next();
                        member = member.toUpperCase();
                        if (member.equals("Y")) {
                            if (sum >= 100) {
                                sum = sum * 0.05;
                                System.out.println("You are member");
                                System.out.println("Total discount5%+vat7% : " + sum + " Bath!");
                            } else if (sum >= 200) {
                                sum = sum * 0.1;
                                System.out.println("You are member");
                                System.out.println("Total discount10%+vat7% : " + sum + " Bath!");
                            } else {
                                System.out.println("You are member");
                                System.out.println("Total+vat7% : "+sum+" no discount");
                            }
                        } else {
                            System.out.println("You are not member");
                            System.out.println("Total+vat7% : "+sum+" no discount");
                        }
                    }

                    break;
        
    }
}
    }
