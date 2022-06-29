
public class halloweansales {
	public static void main(String[] args) {
		int p=20,d=3,m=6,s=80;
		 int sum=0;
		    int count=0;
		    sum=sum+p;
		    for(int i=0;sum<=s;i++)
		    {   
		    	p=p-d;
		        sum=sum+p;
		        count++;
		        if(p<=m)
		        {
		            p=m+d;
		        }
		        }
		    System.out.println(count);
	}

}
