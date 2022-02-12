package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String args[]) throws IOException {
        //createNewFile();
        //numbersExceptionHandling();
        //tryWithResources();
        //createNewFileRethrow();
        calculateSalary(42, 10.4);

    }

    public static void createNewFile(){
        File file = new File("resources/nonexistent.txt");
        try{
            file.createNewFile();
        }catch (Exception e){
            System.out.println("Directory does not exist.");
            e.printStackTrace();
        }
    }

    public static void createNewFileRethrow() throws IOException{
        File file = new File("resources/nonexistent.txt");
        file.createNewFile();
    }

    public static void calculateSalary(double hours, double rate){
        if(hours > 40) {
            throw new IllegalArgumentException("We do not allow overtime.");
        }
    }

    public static void numbersExceptionHandling() {
        File file = new File("resources/numbers.text");
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(file);
            while(fileReader.hasNext()){
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        }catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        } finally {
            fileReader.close();
        }
    }

    //You can pass and instantiating the scanner as a parameter in the try()
    // and delete the finally{}. As you pass scanner in the try, java closed for you. example below v

    public static void tryWithResources(){
        File file = new File("resources/numbers.txt");
        try(Scanner fileReader = new Scanner(file)){
            while(fileReader.hasNext()){
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        }catch(FileNotFoundException | InputMismatchException e){
            e.printStackTrace();
        }
    }
}
