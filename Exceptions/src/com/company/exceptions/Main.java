package com.company.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String fileName = "C:\\Users\\superadmin\\IdeaProjects\\Java_Fundamentals_The_Java_Language\\" +
                            "Exceptions\\src\\com\\company\\exceptions\\text.txt";
        BufferedReader bf = null;
        int total = 0;
        try{

            bf = new BufferedReader(
                    new FileReader(fileName));

            String line = null;
            while ((line = bf.readLine()) != null){

                total += Integer.parseInt(line);
            }
        }
        catch (NumberFormatException e){

            System.out.println("Wrong format => " + e.getMessage());
        }
        catch (FileNotFoundException e){

            System.out.println(e.getMessage());
        }
        catch (IOException e){

            System.out.println(e.getMessage());
        }
        finally {

            System.out.println("Total: " + total);

            try{

                if(bf != null){

                    bf.close();
                }
            }
            catch (Exception e){

                System.out.println(e.getMessage());
            }
        }
    }
}
