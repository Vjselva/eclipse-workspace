import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Buffer {
	public static void main(String args[]) throws Exception
	
	{
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		System.out.println(s);
		System.out.println(s.hashCode());
	}

}
