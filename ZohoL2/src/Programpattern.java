
/*
 7
P     P
 R   R 
  O O  
   G   
  R R  
 A   A 
M     M

 */
public class Programpattern {
	public static void main(String[] args) {
		String s1="PROGRAM";
		System.out.println(s1.length());
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s1.length();j++)
			{
				if(i==j || i+j==s1.length()-1)
				{
					System.out.print(s1.charAt(i));
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
