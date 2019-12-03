package JavaBasic_Codes;

import java.util.Scanner;
public class Nested_If_ElseIF {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your First number:");
        int num1=input.nextInt();
        
         System.out.println("Enter your Second number:");
        int num2=input.nextInt();
        
        
        if(num1>num2){
            if(200>100){
                System.out.println("Our two number is true");
            }
            System.out.println("Num1 is greater than Num2");
            
            
        }
        
        else if(num1==num2){
            System.out.println("Num2 is equal to Num1");
        }
        
        else{
            System.out.println("Num2 is greater than Num150");
        }
    }
}
