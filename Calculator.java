import java.util.Scanner;
public class Calculator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char operator;
        double num1,num2,result;
        System.out.println("Choose an operation: +,-,*,/ ");
        operator =sc.next().charAt(0);
        System.out.println("Enter the first number");
        num1=sc.nextDouble();
        System.out.println("Enter the second element");
        num2=sc.nextDouble();
        switch(operator){
            case '+':
                result=num1+num2;
                System.out.println("Result=" +result);
                break;
            case '-':
                result=num1-num2;
                System.out.println("Result=" +result);
                break;
            case '*':
                result=num1-num2;
                System.out.println("Result=" +result);
                break;
            case '/':
                if(num2!=0){
                result=num1-num2;
                System.out.println("Result=" +result);
                }
                else{
                    System.out.println("Cannot divisible by Zero");
                }
                break;
            case '^':
                result=Math.pow(num1,num2);
                System.out.println("Reslut=" +result);
                break;
            case 'r':
                if( num2==0){
                    System.out.println("Is not allowed");
                }
               if(num1<0 && num1%2!=0){
                    System.out.println("Even root of negative number is also not a real");
                }
                if(num1<0 && num1%2==0){
                    System.out.println("Not a Number");
                }
                else{
                    result=Math.pow(num1,1.0/num2);
                    System.out.println("Result=" +result);
                }
                break;
            default:
                System.out.println("Invalid operator");

        }



    }
}