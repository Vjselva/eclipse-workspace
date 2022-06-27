import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;

class Two{
	int arr[] = new int[5];
	 public Two(int[] arr2) {
		// TODO Auto-generated constructor stub
		 this.arr=arr2;
	}

	
}

class One{
	protected HashMap<String, Two> hashMap=new HashMap<String, Two>();
	public One(HashMap<String, Two> hashMap2) {
		// TODO Auto-generated constructor stub
		hashMap=hashMap2;
	}


}


public class MultipleCollection {
	protected  HashMap<String, Two> hashMap=new HashMap<>();
	protected static ArrayList<One> arrayList=new ArrayList<One>();
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5};
		
		Two two=new Two(arr);
		
		HashMap<String, Two> hashMap=new HashMap< >();
		hashMap.put("TWO", two);
		One one=new One(hashMap);
		for(One one1:arrayList) {
			for(Entry<String, Two> entry : one1.hashMap.entrySet()) {
				for(int i :entry.getValue().arr) {
					System.out.println(i);
				}
				
			}
		}
	
		
		
	}

}
