package ZohoQusetions;

import java.util.ArrayList;

public class NumberOfGroups {
	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> outer=new ArrayList<ArrayList<Integer>>();
		int array[]= {3, 9, 7, 4, 6, 8};
		int x=3;
		for(int i=0;i<array.length;i++)
		{	
				for(int j=i+1;j<array.length-1;j++)
				{
					ArrayList<Integer> inner=new ArrayList<Integer>();
					if((array[i]+array[j])%x==0)
					{
						inner.add(array[i]);
						inner.add(array[j]);
						outer.add(inner);
					  for(int k=j+1;k<array.length-1;k++)
					  {		ArrayList<Integer> inner1=new ArrayList<Integer>();
						  if((array[i]+array[j]+array[k])%x==0)
						  {
							  inner1.add(array[i]);
							  inner1.add(array[j]);
							  inner1.add(array[k]);
							  outer.add(inner1);
						  }
					  }
					}
					
				}
				
		}
		System.out.println(outer);
		
			
		}
		
	}


