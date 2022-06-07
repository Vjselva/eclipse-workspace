import java.util.Arrays;
import java.util.List;

public class ListWithList {

	public static void main(String[] args) {
		List<List<Integer>> lists = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6),
				Arrays.asList(6, 7, 8));
//		for (int i = 0; i < lists.size(); i++) {
//		System.out.println("list " + i + 1);
//			
//			{
//				for (int j = 0; i < lists.get(i).size(); j++) {
//					System.out.println(lists.get(i).get(j));
//				}
//			}
//		}
		
		
		
		for(List outerlist : lists)
		{
			
		}
		System.out.println(lists.get(0).get(0));
	}
}
