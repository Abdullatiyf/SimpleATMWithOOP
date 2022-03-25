package atm.oop.com;

import java.util.Scanner;

public class Login {
        static String username="abdulateef";
        static int password=1999;

        public Login(){
            Login.username=username;
            Login.password=password;
        }
    public static String User(){

        System.out.println("""
               ~~~~~~~~~~~~~~~~~~~
                =Enter Username 
               ~~~~~~~~~~~~~~~~~~~
                """);
        Scanner scanner=new Scanner(System.in);

      return scanner.nextLine();
    }
    public static Integer Pass(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("""
                ~~~~~~~~~~~~~~~~~~~
                =Enter password 
                ~~~~~~~~~~~~~~~~~~~
                """);
        return scanner.nextInt();
    }


}
