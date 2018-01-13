package com.company.inputoutput;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        String fileName = "C:\\Users\\superadmin\\IdeaProjects\\Java_Fundamentals_The_Java_Language\\InputOutput\\src\\com\\company\\inputoutput\\file.txt";
        String outFileName = "C:\\Users\\superadmin\\IdeaProjects\\Java_Fundamentals_The_Java_Language\\InputOutput\\src\\com\\company\\inputoutput\\output.txt";

        readByByte(fileName);
        readByChar(fileName);
        writeByByte(fileName, outFileName);
    }

    //Writing one byte at a time
    private static void writeByByte(String fileName, String outFileName){

        System.out.println("Reading one byte at a time:\n");
        OutputStream output = null;
        InputStream input = null;

        try {

            output = new FileOutputStream(outFileName);
            input = new FileInputStream(fileName);
            int intValue;

            // -1 indicates that stream has ended
            while ((intValue = input.read()) >= 0) {

                byte byteValue = (byte) intValue;
                System.out.println(byteValue);
                output.write(byteValue);
            }
        }
        catch (FileNotFoundException e) {

            e.printStackTrace();
        }
        catch (IOException e) {

            e.printStackTrace();
        }
        finally{

            if(input != null){

                try {

                    input.close();
                }
                catch (IOException e) {

                    e.printStackTrace();
                }
            }

            if(output != null){

                try {

                    output.close();
                }
                catch (IOException e) {

                    e.printStackTrace();
                }
            }
        }
    }

    //Reading one byte at a time
    private static void readByByte(String fileName){

        System.out.println("Reading one byte at a time:\n");
        InputStream input = null;

        try {

            input = new FileInputStream(fileName);
            int intValue;

            // -1 indicates that stream has ended
            while ((intValue = input.read()) >= 0) {

                byte byteValue = (byte) intValue;
                System.out.println(byteValue);
            }
        }
        catch (FileNotFoundException e) {

            e.printStackTrace();
        }
        catch (IOException e) {

            e.printStackTrace();
        }
        finally{

            if(input != null){

                try {

                    input.close();
                }
                catch (IOException e) {

                    e.printStackTrace();
                }
            }
        }
    }

    //Reading one char at a time
    private static void readByChar(String fileName){

        System.out.println("Reading one char at a time:\n");
        Reader input = null;
        int intValue;

        try{

            input = new StringReader(fileName);

            // -1 indicates that stream has ended
            while ((intValue = input.read()) >= 0){

                char chrValue = (char) intValue;
                System.out.println(chrValue);
            }
        }
        catch (Exception e) {

            e.printStackTrace();
        }
        finally{

            if(input != null){

                try {

                    input.close();
                }
                catch (Exception e) {

                    e.printStackTrace();
                }
            }
        }
    }
}