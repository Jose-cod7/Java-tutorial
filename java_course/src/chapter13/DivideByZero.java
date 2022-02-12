package chapter13;

public class DivideByZero {

    public static void main(String[] args){

        try{
            int c = 30/0;
        }catch(Exception e){
            System.out.println("Dividing by zero is not permitted");
            e.printStackTrace();
        }finally{
            System.out.println("Division is fun!");
        }
    }
}
