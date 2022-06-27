import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListwithinList {

	public static void main(String[] args) {
		
		List<List<Integer>> lists = Arrays.asList(Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(6, 7, 8));
		ArrayList<Integer> row=new ArrayList<Integer>();
		ArrayList<Integer> col=new ArrayList<Integer>();
		int size=lists.get(0).size();
		for(int i=0;i<size;i++)
		{
			col.add(0);
		}
		
		for(int i=0;i<lists.size();i++)
		{
			List<Integer> al=new ArrayList(lists.get(i));
			int sum=0;
			for(int j=0;j<al.size();j++)
			{
				sum+=al.get(j);
				col.set(j,(col.get(j)+al.get(j)));
				
			}
			row.add(sum);
			
			}
		
		System.out.println(row);
		System.out.println(col);
		
	}
//		for(int i=0;i<lists.size();i++)
//		}
	
	}

//for(int k=0;i<lists.size();k++)
//{   
//	
//	List<Integer> vl=new ArrayList(lists.get(k));
//	for(int j=0;j<al.size();j++)
//	{
//		sum+=al.get(j);
//	}
//	row.add(sum);
