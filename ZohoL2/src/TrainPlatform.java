import java.util.Scanner;

public class TrainPlatform {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		double dis[]=new double[count];
		double arriv[]=new double[count];
		int array[]=new int[count];
		int cnt=1;
		for(int i=0;i<count;i++)
		{
			System.out.print("dispacter time ");
			dis[i]=sc.nextDouble();
			System.out.print("Arriving Time ");
			arriv[i]=sc.nextDouble();
			if(i!=0)
			{
				for(int j=i-1;j>=0;j--)
				{
						if((dis[i]>=dis[j] && dis[i]<=arriv[j]) && (arriv[i]>=dis[j] && arriv[i]<=arriv[j]))
						{
						 cnt++;
						}
						else
						{
							break;
						}
						
					}
			}
			
		}
		
		System.out.println(cnt);
		
	}

}
