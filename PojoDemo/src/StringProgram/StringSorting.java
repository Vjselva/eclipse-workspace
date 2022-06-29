package StringProgram;

public class StringSorting {
	public static void main(String[] args) {
		
		String s="hereisyourpen";
		int c=s.length();
		char a[]=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			a[i]=s.charAt(i);
		}
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					char temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}
		System.out.println(a[s.length()-1]);
	}

}
