import java.util.Scanner;

public class lsbSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number;
		int status;
		System.out.println("Enter the number:");
		number=sc.nextInt();
		sc.close();
		status=number & 1;
		if(status==1)
			System.out.println("The lsb of "+number+" is set(1)");
		else
			System.out.println("The lsb of "+number+" is set(0)");
	}

}
