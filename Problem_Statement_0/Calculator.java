package Problem_Statement_0;
import java.util.*;
public class Calculator {
    //Addition Function
    public static void Addition(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number:");
        double a= sc.nextDouble();
        System.out.print("Enter the Second Number:");
        double b= sc.nextDouble();
        System.out.println("Result:"+(a+b));
        sc.close();
    }
    //Subtraction Function
    public static void Subtraction(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number:");
        double a= sc.nextDouble();
        System.out.print("Enter the Second Number:");
        double b= sc.nextDouble();
        System.out.println("Result:"+(a-b));
        sc.close();
    }
    //Mulitiplication Function
    public static void Multiplication(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number:");
        double a= sc.nextDouble();
        System.out.print("Enter the Second Number:");
        double b= sc.nextDouble();
        System.out.println("Result:"+(a*b));
        sc.close();
    }
    //Division Function
    public static void Division(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number:");
        double a= sc.nextDouble();
        System.out.print("Enter the Second Number:");
        double b= sc.nextDouble();
        System.out.println("Result:"+(a/b));
        sc.close();
    }
    //Power Function
    public static void Power(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        double a= sc.nextDouble();
        System.out.print("Enter the Power:");
        int b= sc.nextInt();
        double temp=a;
        //Corner Case Handling
        if(a==1||b==0){
            System.out.println("Result:"+1);
        }
        //loop for power
        for(int i=1;i<b;i++){
            a*=temp;
        }
        System.out.println("Result:"+a);
        sc.close();
    }
    //SquareRoot Function
    public static void SquareRoot(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int a= sc.nextInt();
        int ans=0;
        for(int i=1;i<a;i++){
            if(a==i*i){
                ans=i;
                break;
            }
        }
        System.out.println("Result:"+ans);
        sc.close();
    }
    //NaturalLogarithm Function
    public static void NaturalLogarithm(){
        Scanner sc= new Scanner(System.in);

        sc.close();
    }
    //Exponential Function
    public static void Exponential(){
        Scanner sc= new Scanner(System.in);

        sc.close();
    }
    //Trignometric Function
    public static void Trignometric(){
        Scanner sc= new Scanner(System.in);

        sc.close();
    }
    //Factorial Function
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to do?");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Power");
        System.out.println("6.Square Root");
        System.out.println("7.Natural Logarithm");
        System.out.println("8.Exponential");
        System.out.println("9.Trignometric Functions");
        System.out.println("Press the number accordingly:");
        //taking user choice
        int a= sc.nextInt();
        //using switch to avoid a lot of if else statements
        switch (a){
            case 1:Addition();
                     break;
            case 2:Subtraction();
                     break;
            case 3:Multiplication();
                     break;
            case 4:Division();
                     break;
            case 5:Power();
                     break;
            case 6:SquareRoot();
                     break;
            case 7:NaturalLogarithm();
                     break;
            case 8:Exponential();
                     break;
            case 9:Trignometric();
                     break;
            default:System.out.println("Invalid number");
        }
        sc.close();
    }
}
