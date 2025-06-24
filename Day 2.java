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
        //Armstrong number
        int n = sc.nextInt();

        int c = 0; 
        int result = 0; 
        int temp = n; 

        while (temp != 0) {
            temp /= 10; 
            c++;
        }

        int org = n;

        while (org != 0) {
            int l = org % 10; 
            result += Math.pow(l, c); 
            org /= 10; 
        }

        if (result == n) {
            System.out.print("Armstrong Number");
        } else {
            System.out.print("Not an Armstrong Number");
        }
		// Rectangle Star pattern
         int n=sc.nextInt();
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    // star pattern
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
		
	}
}

// Array 
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		    
		}
		// for each
		for(int i:a){
		    System.out.println(i);
		}
        
    }
        
}
// Maximum element in the array
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		    
		}
		int max=a[0];
		for(int i=0;i<n;i++){
		    if(a[i]>max){
		        max=a[i];
		    }
		}
		System.out.print(max);
        
    }
        
}

//sum of the element
	        int sum=0;
		for(int i=0;i<n;i++){
		    sum+=a[i];
		}
		System.out.print(sum);

// count number of + and - elemnts in the array
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		    
		} 
        int pos_count=0;
        int neg_count=0;
        
        for( int i=0;i<n;i++){
            if(a[i]>0){
                pos_count++;
            }
            else{
                neg_count++;
            }
        }
        System.out.println("Positive count: "+pos_count);
        System.out.println("Negative count: "+neg_count);
    }
        
}
// Multidimensional array
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
		   a[i]=sc.nextInt();
		} 
		// reverse
		/*for(int i=0;i<n;i++){
		    System.out.print(a[n-i-1]+" ");
		}*/
		// swapp the array
		for(int i=0;i<n/2;i++){
		        int temp=a[i];
		        a[i]=a[n-1-i];
		        a[n-1-i]=temp;
		        
		}
		for(int i=0;i<n;i++){
		    System.out.print(a[i]+" ");
		}
		
        
    }  
}
