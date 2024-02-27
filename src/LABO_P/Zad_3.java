package LABO_P;

import java.util.Spliterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zad_3 {
    public static void main(String[] args){

        Pattern compiledPattern = Pattern.compile("Karka");
        Matcher matcher = compiledPattern.matcher("Karka tworzą wyrażenia");

        System.out.println(matcher.find());
        System.out.println(matcher.matches());

       /* Pattern compiledPattern = Pattern.compile("Karka");
        Matcher matcher = compiledPattern.matcher("Karka");

        System.out.println(matcher.find());
        System.out.println(matcher.matches());*/
    }
}
