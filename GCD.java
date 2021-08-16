// Program to calculate GCD of two numbers:

import java.util.*;
class GCD{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int a= sc.nextInt();
		int b= sc.nextInt();
		while(a!=b){
			if(a>b)
				a=a-b;
			else
				b=b-a;
		}
		System.out.print("The GCD is: "+a);
	}
}
