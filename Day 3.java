//Strings
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a="Apple";
		String b=new String("Ball");
		System.out.println(a);
		System.out.println(b);
	}
}
//User defined:
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String c=sc.next();
		System.out.println(c);
	}
}
//concat and retatte the string
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        String s3 = s1.concat(s1); 
        boolean res = s3.contains(s2); 
        System.out.println(res); 
    }
}

//sunstring
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String c=sc.nextLine();
		System.out.println(c.substring(1,3));
		
	}
}
// char array
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String c=sc.nextLine();
		char []a=c.toCharArray();
		for(int i=0;i<c.length();i++){
		    System.out.println(a[i]);
		}
		
	}
}
// reverse a string
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String c=sc.nextLine();
		int n=c.length();
		char []a=c.toCharArray();
		for(int i=n-1;i>=0;i--){
		    System.out.print(a[i]+" ");
		}
		
	}
}
//constant or variable
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String c=sc.nextLine();
		int n=c.length();
		char []a=c.toCharArray();
		for(int i=0;i<n;i++){
		    if(a[i]>='a'&& a[i]<='z'){
		        System.out.println("alphabets: "+a[i]+" ");
		    }
		    else if(a[i]>='0' && a[i]<='9'){
		        System.out.println("constants: "+a[i]+" ");
		    }
		}
		
	}
}
// uppercase
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String c=sc.nextLine();
		int n=c.length();
		char []a=c.toCharArray();
		for(int i=0;i<n;i++){
		    if(a[i]>='a'&& a[i]<='z'){
		        char ch=(char)(((int)a[i]-32));
		        System.out.println(ch);
		    }
		    
		}
		
	}
}
//lowercase
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String c=sc.nextLine();
		int n=c.length();
		char []a=c.toCharArray();
		for(int i=0;i<n;i++){
		    if(a[i]>='A'&& a[i]<='Z'){
		        char ch=(char)(((int)a[i]+32));
		        System.out.println(ch);
		    }
		    
		}
		
	}
}
// count alphabetics and constants
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String c=sc.nextLine();
		int n=c.length();
		char []a=c.toCharArray();
		int alp_c=0;
		int con_c=0;
		for(int i=0;i<n;i++){
		    if(a[i]>='a'&& a[i]<='z'){
		        alp_c++;
		    }
		    else if(a[i]>='0' && a[i]<='9'){
		        con_c++;
		    }
		}	
		System.out.println("alphabetic count :"+alp_c);
		System.out.println("Constant count :"+con_c);
	}
}
//palindrome
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();
        int n = c.length();
        char[] a = c.toCharArray();
        int flag = 0;
        for (int i = 0; i < n / 2; i++) {
            for (int j = n - 1 -i; j == n- 1 -i; j--) {
                if (a[i] != a[j]) {
                    flag = 1;
                    break;
                }
                
            }
        }
        if (flag == 0) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}

//or
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();
        int n = c.length();
        char[] a = c.toCharArray();
        int flag = 0;
        for (int i = 0; i < n / 2; i++) {
            
                if (a[i] != a[n-1-i]) {
                    flag = 1;
                    break;

                
            }
        }
        if (flag == 0) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
// count vowel and constant
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String c=sc.nextLine();
		int n=c.length();
		char []a=c.toCharArray();
		int vow_c=0;
		int con_c=0;
		for(int i=0;i<n;i++){
		   if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'){
		       vow_c++;
		   }
		   else{
		       con_c++;
		   }
		}
		System.out.println("Vowel count "+vow_c);
		System.out.println("Constant count "+con_c);
		
	}
}
