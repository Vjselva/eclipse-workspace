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
				if (Character.toString(array[i]).equalsIgnoreCase(Character.toString(array[j]))) 
				{
					for(int k=1;k<=array.length;k++)
					{
						int temp=0;
						char t = 0 ;
							if(array[j]<=122 && array[j]>=97)
							{	 temp =array[j] + k;
								 t = temp>122?(char)(((temp-97)%26)+96):(char)temp;
							}
							else if(array[j]<=90 && array[j]>=65)
							{	 temp =array[j] + k;
								 t = temp>90?(char)(((temp-65)%26)+65):(char)temp;
							}
							else if(array[j]>=48 && array[j]<=57)
							{	temp =array[j] + k;
								 t=temp>57?(char)(((temp-48)%10)+48):(char)temp;
							}
					
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

		
		static boolean contains(char t,char s[],int j)
		{
			for (int k = 0; k < j; k++) 
			{
				if (Character.toString(t).equalsIgnoreCase(Character.toString(s[k]))) 
				{
					return true;
				}
			}
			return false;
	}
}
