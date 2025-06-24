import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Multiplication Table
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++){
		    System.out.print(i+"*"+n+" = "+i*n);
		    System.out.println();
		}
		
		//sum of the square number
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++){
		    sum+=(i*i);
		}
		System.out.println("Sum of the Square :"+sum);
		
		//Factorial of the number
		int numb=sc.nextInt();
		int prod=1;
		for(int i=1;i<=numb;i++){
		    prod*=i;
		}
		System.out.print("Factorial of the "+numb+" is: "+prod);
		
		
		//Fibonocii Series
		int n=sc.nextInt();
		int a = 0;
        int b = 1;
        System.out.println(a);
        
            System.out.println(b);
            for (int i = 2; i < n; i++) {
                int temp = a + b;
                a = b;
                b = temp;
                System.out.println(b);
            }

    
	}
}
