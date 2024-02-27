package LABO_P;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Zad_4 {
    public static void main(String[] args){

        String email = "karka.kleciak@interia.pl";
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println("Adres e-mail jest poprawny.");
        } else {
            System.out.println("Adres e-mail jest niepoprawny.");
        }
    }
}
