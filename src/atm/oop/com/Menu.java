package atm.oop.com;
import java.util.Scanner;

public class Menu {
    static int balance=1000000;
    static int balanceusd=1000;
    static int balanceeur=1000;
    static String history="";

    public Menu(int balance, int balanceusd, int balanceeur,String history) {
        Menu.balance =balance;
        Menu.balanceusd= balanceusd;
        Menu.balanceeur=balanceeur;
        Menu.history=history;
    }
    public static void Balances(){
        System.out.println("""
                Choose Balance
                1=UZS Balance
                2=USD Balance
                3=EURO Balance
                """);
        Scanner scanner= new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1 ->
                System.out.println("You have:" + balance + "UZS");
            case 2 ->
                System.out.println("You have:" + (balanceusd) + "USD");
            case 3 ->
                System.out.println("You have:" + (balanceusd) + "EURO");
            default -> System.out.println("Error!!!!");
        }
    }
    public static void DisplayMenu(){
        boolean stop=true;
       while (stop){
           System.out.println("""
                ============
                Welcome Choose any command down below!!!
                If you want to exit from the loop type'0'
                
                1=Balance
                2=Payment
                3=Invest
                4=Setting
                5=History
                """);
        Scanner scanner= new Scanner(System.in);
        int option=scanner.nextInt();
        switch (option) {
            case 1 ->
                Balances();
            case 2 ->
                 Payments.Payment();
            case 3 ->
                    Payments.Invest();
            case 4 ->
                        SettingsOfAccount.Setting();
            case 5 ->
                    SettingsOfAccount.History();

        } if (option==0)
               stop=false;
    }
    }
}
