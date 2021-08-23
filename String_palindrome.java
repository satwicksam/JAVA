import java.util.*;
class String_palindrome{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the string: ");
		String st= s.nextLine();
		char str[]= st.toCharArray();
		int n= str.length, count=0;
		for(int i=0; i<n/2; i++){
			if(str[i]==str[n-(i+1)])
				count++;
		}
		if(count==n/2)
			System.out.print("Palindrom String!");
		else
			System.out.print("Non Palindrom String!");
	}
}
