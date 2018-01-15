package com.company.stringformatting;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {

        try{
            //sampleStringJoiner();
            //sampleStringJoinerSuffix();
            //sampleStringJoinerEmpty();
            //simpleStringFormat();
            //sampleFormatFlags();
            //sampleArgIndx();
            //doWrite(13, 14, 15, 16, 14.75);
            //sampleRegEx();

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    //Using Regular Expression in order to match strings (pattern matching)
    private static void sampleRegEx(){

        String s1 = "apple, apple and orange please";
        //Simple replacement
        String s2 = s1.replace("ple", "ricot");
        System.out.println(s2);

        //Replacement at the end of the word only
        //Does not work for some reason
        String s3 = s1.replace("ple\\b", "ricot");
        System.out.println(s3);

        //Split into separate words
        String[] words = s1.split("\\b");
        for (String s : words){
            //Print WORDS only
            if(s.matches("\\w+"))
                System.out.println(s);
        }
    }

    // Using Formatter class,
    // writes content to any type that implements Appendable Interface,
    // like StringBuilder or StreamWriter
    private static void doWrite(int david, int dawson, int dillonb, int gordon, double avgDiff) throws IOException{

        BufferedWriter bfWriter = Files.newBufferedWriter(Paths.get("myFile.txt"));

        try (Formatter f = new Formatter(bfWriter)){
            f.format("My sons are %d, %d, %d, and %d years old.\n", david, dawson, dillonb, gordon);
            f.format("The average age is %.1f years.\n", avgDiff);
        }

    }

    //Argument Index sample:
    private static void sampleArgIndx(){

        //No index:
        System.out.println(String.format("%d %d %d", 100, 200, 300));

        //Using index:
        System.out.println(String.format("%3$d %1$d %2$d", 100, 200, 300));

        //Display value from previous index (%<04d):
        System.out.println(String.format("%2$d %<04d %1$d", 100, 200, 300));
    }

    //Working with Format Flags
    private static void sampleFormatFlags(){

        //Decimal
        System.out.println(String.format("%d", 32));

        //Octal
        System.out.println(String.format("%o", 32));
        //Octal with leading zeroes
        System.out.println(String.format("%#o", 32));

        //Hexadecimal
        System.out.println(String.format("%x", 32));
        System.out.println(String.format("%X", 32));
        //Hexadecimal with leading zeroes
        System.out.println(String.format("%#x", 32));

        //Alignment:
        //No width:
        System.out.println(String.format("W: %d, X: %d", 32, 235));
        System.out.println(String.format("Y: %d, Z: %d", 481, 12));

        //Width 4 chars:
        System.out.println(String.format("W: %4d, X: %4d", 32, 235));
        System.out.println(String.format("Y: %4d, Z: %4d", 481, 12));

        //Width 4 chars + leading zeroes, justification to right:
        System.out.println(String.format("W: %04d, X: %04d", 32, 235));
        System.out.println(String.format("Y: %04d, Z: %04d", 481, 12));

        //Width 4 chars, justification to left:
        System.out.println(String.format("W: %-4d, X: %-4d", 32, 235));
        System.out.println(String.format("Y: %-4d, Z: %-4d", 481, 12));

        //Group separator:
        System.out.println(String.format("W: %d", 35356765));
        System.out.println(String.format("W: %,d", 35356765));
        System.out.println(String.format("W: %,.2f", 35356765.3242));

        //Working with positive and negative values:
        System.out.println(String.format("W: %d", 123));
        System.out.println(String.format("W: %d", -234));

        //Adding space as a space holder
        System.out.println(String.format("W: % d", 123));
        System.out.println(String.format("W: % d", -234));

        //Using + sign
        System.out.println(String.format("W: %+d", 123));
        System.out.println(String.format("W: %+d", -234));
    }

    //String with basic Format specifier (% + conversion):
    private static void simpleStringFormat(){

        int a = 21, b = 65, c = 45;
        System.out.println(String.format("a: %d, b: %d, c: %d", a, b, c)); //Integers

        double d = 3.567867d;
        System.out.println(String.format("d: %.2f", d)); //Floating point

        String name = "John Doe";
        System.out.println(String.format("My name is %s", name)); //String
    }

    //Work with StringJoiner and empty value:
    private static void sampleStringJoinerEmpty(){

        StringJoiner sj = new StringJoiner(", ");
        sj.setEmptyValue("EMPTY");
        System.out.println(sj);

        sj.add("some value");
        System.out.println(sj);
    }

    //Work with StringJoiner:
    private static void sampleStringJoiner(){

        String[] values = new String[]{"A", "B", "C", "D"};
        StringJoiner strJoiner = new StringJoiner(", ");

        System.out.println(strJoiner);

        //Same as: strJoiner.add("A").add("B").add("C")...
        for(String str : values){

            strJoiner.add(str);
        }

        System.out.println(strJoiner);
    }

    //Work with StringJoiner and prefix/suffix:
    private static void sampleStringJoinerSuffix(){

        String[] values = new String[]{"A", "B", "C", "D"};
        StringJoiner strJoiner = new StringJoiner("], [", "[", "]");

        System.out.println(strJoiner);

        //Same as: strJoiner.add("A").add("B").add("C")...
        for(String str : values){

            strJoiner.add(str);
        }

        System.out.println(strJoiner);
    }

}
