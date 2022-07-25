package leetcode;

public class rough {
	public static void main(String[] args) {
		
		double sqrt=Math.sqrt(24);   
		System.out.println(sqrt);
		System.out.println(Math.floor(sqrt));
		if(sqrt - Math.floor(sqrt)==0)
		{
			System.out.println("square");
		}
		else
		{
			System.out.println("not square");
		}
		System.out.println(Math.sqrt(16));
		System.out.println(Math.floor(Math.sqrt(12)));
		System.out.println(Math.ceil(Math.sqrt(12)));
		
		int len=5;
		String str="12345";
		 for (int i = 0; i < len; i++)
		    {
		        int j=len-i-1;
		        for (int k = 0; k < len; k++)
		        {
		            if (k == i || k == j)
		                System.out.print(str.charAt(k));
		            else
		                System.out.print(" ");
		        }
		        System.out.println("");
		    }
	}

}
