package ZohoQusetions;

public class SnakePattern {
	public static void main(String[] args) {
		int count=4;
		int k=0;
		int end=count;
		for(int i=1;i<=4;i++)
		{
			for(int g=i;g<count;g++)
			{
				System.out.print(" ");
			}
			
			while(i%2!=0)
			{
				for(int j=i*count-(count-1);j<=count*i;j++)
				{
					System.out.print(j);
					end=j;
				}
				break;
			}
			while(i%2==0)
			{
				k=i*count;
				for(int l=k;l>end;l--)
				{
					System.out.print(l);
				}
				break;
			}
			System.out.println();
		}
	}

}
