/*
Pattern 
w   w   w
  a a a 
w a t e r
  e e e
r   r   r

 */
public class WaterPattern {
	public static void main(String[] args) {
		String s="water";
		char array[][]=new char[s.length()][s.length()];
		int size=s.length()/2;
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<s.length();j++)
			{
				if(i==j || j+i==s.length()-1)
				{
					array[i][j]=s.charAt(i);
				}
				if(j==size)
				{
					array[i][j]=s.charAt(i);
					array[j][i]=s.charAt(i);
				}
			System.out.print(array[i][j]);	
			}
			System.out.println();
		}
		System.out.println("Pattern ");
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<s.length();j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}

}
