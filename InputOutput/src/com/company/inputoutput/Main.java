package com.company.inputoutput;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        String fileName = "C:\\Users\\superadmin\\IdeaProjects\\Java_Fundamentals_The_Java_Language" +
                            "\\InputOutput\\src\\com\\company\\inputoutput\\file.txt";

        String outFileName = "C:\\Users\\superadmin\\IdeaProjects\\Java_Fundamentals_The_Java_Language" +
                                "\\InputOutput\\src\\com\\company\\inputoutput\\output.txt";

        //readByByte(fileName);
        //readByChar(fileName);
        //writeByByte(fileName, outFileName);
        //writeByChar(fileName);
        //tryWithResources(fileName, outFileName);
        //buffReader(fileName);
        //usingNioFile(fileName);
        //usingNioAllLines(fileName);
    }

    //Read all lines using java.nio.file
    private static void usingNioAllLines(String fileName){

        try{

            List<String> lines = Files.readAllLines(
                    Paths.get(fileName));

            for (String ln : lines){

                System.out.println(ln);
            }
        }
        catch (IOException e) {

            //e.printStackTrace();
            System.out.println(e.toString());
        }
    }

    //Accessing files with the java.nio.file:
    private static void usingNioFile(String fileName){

        try (BufferedReader bfReader = Files.newBufferedReader(Paths.get(fileName))){

            String line;

            while((line = bfReader.readLine()) != null){

                 System.out.println(line);
             }
        }
        catch (IOException e) {

            //e.printStackTrace();
            System.out.println(e.toString());
        }
    }

    //Files and Buffered Streams: BufferedReader
    private static void buffReader(String fileName){

        try(BufferedReader bfReader = new BufferedReader(new FileReader(fileName))){

            StringBuilder str = new StringBuilder();
            int length;
            char[] buffer = new char[600];

            while ((length = bfReader.read(buffer)) >= 0){

                if(str.length() > 0){

                    str.delete(0, str.length() - 1);
                }

                str.append(buffer, 0, length);
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    //Chaining Streams demo
    private static void chainStreams(InputStream in) throws IOException{

        int lengt;
        char[] buffer = new char[10];

        try(InputStreamReader inReader = new InputStreamReader(in)){

            while ((lengt = inReader.read(buffer)) >= 0){

                for (int i = 0; i < buffer.length; i++){

                    if (i < lengt){

                        System.out.println(buffer[i]);
                    }
                }

                System.out.println();
            }
        }
    }

    //Demo: Try-with-resources:
    private static void tryWithResources(String fileName, String outFileName){

        int length;
        char[] buffer = new char[10];

        try(Reader reader = new FileReader(fileName);
            Writer writer = new FileWriter(outFileName)){

            while ((length = reader.read(buffer)) >= 0){

                for (int i = 0; i < buffer.length; i++){

                    if (i < length){

                        System.out.print((char) buffer[i]);
                    }
                }

                writer.write(buffer, 0, length);
                System.out.println();
            }
        } catch (IOException e) {

            e.printStackTrace();
        }

    }

    //Writing one char at a time
    private static void writeByChar(String fileName){

        System.out.println("Writing one char at a time:\n");
        Writer writer = null;
        Reader input = null;
        int intValue;

        try{

            writer = new StringWriter();
            input = new StringReader(fileName);

            // -1 indicates that stream has ended
            while ((intValue = input.read()) >= 0){

                char chrValue = (char) intValue;
                //System.out.println(chrValue);
                writer.write(chrValue);
            }

            System.out.println(writer.toString());
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

            if(writer != null){

                try {

                    writer.close();
                }
                catch (Exception e) {

                    e.printStackTrace();
                }
            }
        }
    }

    //Writing one byte at a time
    private static void writeByByte(String fileName, String outFileName){

        System.out.println("Writing one byte at a time:\n");
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
