import java.util.Random;
import java.util.Scanner;
public class PasswordGenerator {
	String generator(int l,String str)
	{
		Random r=new Random();
           char[] c=new char[l];
           for(int i=0;i<l;i++)
           {
        	   c[i]=str.charAt(r.nextInt(l));
           }
           return String.valueOf(c);
	}

	public static void main(String[] args) {
		int length;
		String s,password;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the length of the password :");
		length=scan.nextInt();
		System.out.println("Enter the character set :");
		s=scan.next();
		PasswordGenerator p=new PasswordGenerator();
		System.out.println("Generated password :"+p.generator(length,s));
	}

}
