package atm.oop.com;

import java.util.Scanner;

public class Payments {

    public static void Payment(){
        System.out.println("""
                -------->Services<--------
                1)Mobile payments
                2)Electricity and Water payments
                 """);
        Scanner scanner= new Scanner(System.in);
        switch (scanner.nextInt()){

            case 1 -> {
                System.out.println("""
                        Enter your mobile number without country code (+998)
                        """);
                Scanner scan= new Scanner(System.in);
                int phoneNum=scanner.nextInt();
                System.out.println("Enter the Amount:");
                int amount= scan.nextInt();
                if (amount<=Menu.balance){
                Menu.balance-=amount;
                Menu.history=Menu.history+" \nYou've withdraw " + amount+" UZS to this "  + phoneNum + " number";
                }else {
                    System.out.println("Not enough money");
                }
            }
            case 2 -> {
                System.out.println("""
                        Enter the ID
                        """);
                int id= scanner.nextInt();
                System.out.println("Enter the amount");
                int amount = scanner.nextInt();
                if (amount<=Menu.balance){
                    Menu.balance-=amount;
                    Menu.history=Menu.history+"\n You've withdraw " + amount+" UZS to this "  + id + " ID number";
                }else
                    System.out.println("Not enough money");
            }
        }
    }
    public static void Invest(){
        System.out.println("""
                To which account you want to put money
                1)UZS
                2)USD
                3)UER
                """);
        Scanner scanner= new Scanner(System.in);
        int op= scanner.nextInt();
        System.out.println("Enter the amount");
        int amount=scanner.nextInt();
        if (op==1){
            Menu.balance+=amount;
            Menu.history=Menu.history+"\n You've added " + amount+" UZS to this "  + " UZS Balance";
        } else if (op==2){
            Menu.balanceusd+=(0.000087*amount);
            Menu.history=Menu.history+"\n You've added " + (0.000087*amount)+" USD to this "  + " USD Balance";
        }else {
            Menu.balanceeur +=(0.000079*amount);
            Menu.history=Menu.history+"\n You've added " + (0.000079*amount)+" UER to this "  + " EUR Balance";
        }
    }

}
