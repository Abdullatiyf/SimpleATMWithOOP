package atm.oop.com;

import java.util.Scanner;

public class SettingsOfAccount {


    public static void Setting(){
        System.out.println("""
                Choose from Down Below!!!
                                1)Change username
                                2)Change password
                """);
        Scanner scanner=new Scanner(System.in);
        int optionOfSettings=scanner.nextInt();
        if (optionOfSettings==1){
            System.out.println("Fist Enter your password to approve:");
            int approvePass= scanner.nextInt();
            if (approvePass==1999){
                System.out.println("Enter a new username!!!");
                String newUsername= scanner.nextLine();
              Menu.history=Menu.history+" \nYou have changed your old:" + Login.username + " to " + newUsername;
                newUsername=Login.username;
            }else
                System.out.println("Wrong password");
        }else {
            System.out.println("Fist Enter your password to approve it:");
            int approvePass1= scanner.nextInt();
            if (approvePass1==1999){
                System.out.println("Enter a new password!!!");
                int newPassword= scanner.nextInt();
            Menu.history=Menu.history +" \nYou have changed your old:" + Login.password + " to " + newPassword;
                newPassword=Login.password;


            }else
                System.out.println("Wrong password");
        }
    }
    public static void History(){
        System.out.println(Menu.history);
    }

}
