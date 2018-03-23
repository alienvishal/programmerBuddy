import java.util.Scanner;

public class msbSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int number,msb;
		System.out.println("Enter the number:");
		number=sc.nextInt();
		sc.close();
		int a=Integer.SIZE;
		System.out.println(" The size of integer is: "+a);
		//Before: 0000	0000	0000	0001
		//After: 1000	0000	0000	0000
		msb=1 << (a-1);
		if((number & msb)>0)
			System.out.println("The "+number+" is set 1");
		else
			System.out.println("The "+number+" is set 0");
	}

}
