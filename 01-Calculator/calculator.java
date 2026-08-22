import java.util.*;

public class calculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("\n=======Basic Calculator=======");

        System.out.println("\nEnter the first Number: ");
        float a=sc.nextFloat();

        System.out.println("\nEnter the operator(+,-,*,/,%):  ");
        String c=sc.next();

        System.out.println("\nEnter the second number: ");
        float b=sc.nextFloat();


        switch(c){
            case "+" -> System.out.println("\nRESULT= "+(a+b));
            case "-" -> System.out.println("\nRESULT= "+(a-b));
            case "*" -> System.out.println("\nRESULT= "+(a*b));
            case "/" -> {
             if(b==0){
                    System.out.println("\nNot Divisible by zero");    
                }
                else{
                    System.out.println("\nRESULT= "+(a/b));
                }
             }           
            case "%" -> System.out.println("\nRESULT= "+((a/b)*100));
       
        }

    }
    
}
