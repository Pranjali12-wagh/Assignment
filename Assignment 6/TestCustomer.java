package Demo;
import java.util.Scanner;

public class TestCustomer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter customer number:");
		String cno = sc.next();
		System.out.println("enter customer name:");
		String cname = sc.next();
		System.out.println("enter category:");
		String cgry = sc.next();
		Customer c1 = new Customer(cno,cname,cgry);
		if((cno.startsWith("C")||cno.startsWith("c"))){
			System.out.println("valid name");
		}
		else {
			throw new CustnameExce("error in name");
		}
		if(cname.length()>=4) {
			System.out.println("valid length");
		}
		else {
			throw new CustnameExce("error in length");
		}
		if((cgry.equals("Gold")||cgry.equals("Platinum")||cgry.equals("Silver"))) {
			System.out.println("valid category");
		}
		else
		{
			throw new CategoryExce("error in length");
		}
		}
		catch(CustnameExce n)
		{
			System.out.println(n);
		}
		
		catch(CategoryExce p)
		{
			System.out.println(p);
		}	
	}

}