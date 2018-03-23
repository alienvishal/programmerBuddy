import java.util.Scanner;

public class occourance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,sum,carry,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 number:-");
		a=sc.nextInt();
		b=sc.nextInt();
		sum=a^b;
		carry=(a&b)<<1;
		c=sum+carry;
		System.out.println("SUM IS:- "+c);
	}

}
