import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.Properties;

class MarkComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Student student = (Student) o1;
		Student student1 = (Student) o2;
		return student.name.compareTo(student1.name);
	}

}

class Student {
	String name;
	int marks;

	public Student(String string, int i) {
		this.name = string;
		this.marks = i;

	}

}

public class ComparatorExample {

	protected static ArrayList<Student> arrayList = new ArrayList<>();

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student1 = new Student("Kanna", 800);
		Student student2 = new Student("selva", 750);
		Student student3 = new Student("Kalai", 790);

		arrayList.add(student1);
		arrayList.add(student2);
		arrayList.add(student3);

		// Collections.sort(arrayList,Collections.reverseOrder());

		Collections.sort(arrayList, new MarkComparator());
		Collections.reverse(arrayList);
		for (Student obj : arrayList) {
			System.out.println(obj.name);
		}
	
		
		ArrayList<int []> arrayList=new ArrayList<int[]>();
		//ArrayList<int > arrayList=new ArrayList<int[]>();
		
		Object object[]= {1,"hai",111111,true,1.001,"HEllo"};
		
		ArrayList<Integer> list[]=new ArrayList[5];	
		
		list[0]=new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		list[1]=new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		list[2]=new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		
		for(ArrayList<Integer> obj : list) {
			
			System.out.println(obj);
		}
		
		Properties properties=new Properties();
		properties.put("ui","sd");
		
		for(Entry<Object, Object> entry : properties.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
			
		
		
	}

}
