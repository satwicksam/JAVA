import java.util.*;
class Coordinate_of_point{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter x,y axis value: ");
		int x= sc.nextInt();
		int y= sc.nextInt();
		if (x>0 && y>0)
			System.out.println("This point is belong in 1'st coordinate.");
		else if (x<0 && y>0)
			System.out.println("This point is belong in 2'nd coordinate.");
		else if (x>0 && y<0)
			System.out.println("This point is belong in 3'rd coordinate.");
		else if (x<0 && y<0)
			System.out.println("This point is belong in 4'th coordinate.");
		else if (x==0 && y==0)
			System.out.println("This is the middle point.");
		else
			System.out.println("Please enter a right value.");
	}
}
