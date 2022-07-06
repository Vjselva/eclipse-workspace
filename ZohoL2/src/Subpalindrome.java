
public class Subpalindrome {

	public static void main(String[] args) {
		
		String s="abeebdccc";
		String temp="";
		String palindrome="";
		int palindromelength=0;
		for(int i=0;i<s.length()-1;i++)
		{
			temp+=s.charAt(i);
			for(int j=i+1;j<s.length();j++)
			{
				temp+=s.charAt(j);
				//System.out.println(temp);
				if(Palindrome(temp))
				{ 
					//System.out.println("palindrome string"+temp);
					if(palindromelength<temp.length())
					{
						palindrome=temp;
						palindromelength=temp.length();
					}
				}
				continue;
			}
			temp="";
		}
		System.out.println(palindrome);
		
	}
	static boolean Palindrome(String b)
	{  
		boolean flag=true;
		int size=((b.length()-1)/2)+1;
		for(int i=0;i<size;i++)
		{
			if(b.charAt(i)==b.charAt(b.length()-1-i))
			{
				continue;
			}
			else
			{
				flag=false;
				break;
			}
		}
		return flag;
	}
}

