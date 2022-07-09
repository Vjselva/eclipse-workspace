
/*
Input : house no : 123@cbe
Output : ebc32 1o : nes@uoh
 */

public class ReverseStringwithPun {
	public static void main(String[] args) {
		String s="house no : 123@cbe";
		//String s="123-456 : 789@191";
		int size=((s.length()-1)/2)+1;
		//System.out.println(s.length());
		char array[]=new char[s.length()];
		for(int i=0;i<array.length;i++)
		{
			array[i]=s.charAt(i);
		}
		
		int last=s.length()-1;
		for(int i=0;i<=size;i++)
		{
			if((array[i]>=48 && array[i]<=57 || array[i]>=65 && array[i]<=90 || array[i]>=97 && array[i]<=122) &&
					(array[last]>=48 && array[last]<=57 || array[last]>=65 && array[last]<=90 || array[last]>=97 && array[last]<=122))
			{
				char temp=array[i];
				array[i]=array[last];
				array[last]=temp;
				last--;
			}
			else if(!(array[i]>=48 && array[i]<=57 || array[i]>=65 && array[i]<=90 || array[i]>=97 && array[i]<=122))
			{
				continue;
			}
			else if(!(array[last]>=48 && array[last]<=57 || array[last]>=65 && array[last]<=90 || array[last]>=97 && array[last]<=122))
			{
				last--;
				i--;
			}
			
		}
		String t="";
		for(int i=0;i<array.length;i++)
		{
			t+=array[i];
		}
		System.out.println("Input : "+s);
		System.out.println("Output : "+t);
		
	}

}
