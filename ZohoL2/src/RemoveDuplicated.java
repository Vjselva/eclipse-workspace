import java.util.Scanner;

public class RemoveDuplicated {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string ");
		String s1 = sc.next();
		char array[]=new char[s1.length()];
		for(int s=0;s<s1.length();s++)
		{
			array[s]=s1.charAt(s);
		}
		

		for (int i = 0; i < array.length;i++)
		{
			
			for (int j = i + 1; j < array.length; j++) 
			{
				if (array[i] == array[j]) 
				{
					for(int k=1;k<array.length;k++)
					{
					char t = (char) (array[j] + k);
					
					
						if(!contains(t,array,j))
						{
							array[j]=t;
							break;
						}
						else
						{
							continue;
						}
					}
					}
				}
			}
		for(int l=0;l<array.length;l++)
		{
		System.out.println(array[l]);
		}
	}
		
		static boolean contains(char t,char s[],j
				)
		{
			for (int k = 0; k < s.length; k++) 
			{
				if (t == s[k]) 
				{
					return true;
				}
			}
			return false;
	}
}
