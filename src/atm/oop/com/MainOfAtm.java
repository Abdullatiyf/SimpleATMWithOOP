package atm.oop.com;

import java.util.Objects;

public class MainOfAtm {
    public static void main(String[] args) {

        if (Objects.equals(Login.User(), "abdulateef") && Login.Pass()==1999){
            Menu.DisplayMenu();
        } else {
            System.out.println("Error");
        }
    }
}
