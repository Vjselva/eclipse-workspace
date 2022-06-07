import java.util.ArrayList;
import java.util.List;

public class StringtoArray {
	public static void main(String[] args) {
		String s="hello";
		char ch[]=s.toCharArray();
		ArrayList<String> al=new ArrayList<String>();
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
	}

}
