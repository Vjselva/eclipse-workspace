
public class Palindrome {
	public static void main(String[] args) {
		
		String s="abbabba";
		boolean flag=true;
		int size=((s.length()-1)/2)+1;
		for(int i=0;i<size;i++)
		{
			if(s.charAt(i)==s.charAt(s.length()-1-i))
			{
				continue;
			}
			else
			{
				flag=false;
				break;
			}
		}
		String result=flag==true?"palindrome":"not palindrome";
		System.out.println(result);
	}

}
