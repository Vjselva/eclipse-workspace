package ZohoQusetions;

public class Xpetrol {
	public static void main(String[] args) {
		int initial=2;
		int distance[]= {1, 5, 3};
		int capacity[]= {6, 4, 2};
		 for(int i=0;i<distance.length;i++)
		 {
			 if(initial-distance[i]>=0)
			 {
				initial=capacity[i]+(initial-distance[i]);
			 }
			 else
			 {
				 System.out.println("out of petrol");
			 }
		 }
		 if(initial >=0)
		 {
		 System.out.println("Remaining petrol in car is "+initial+" litters");
		 }
		 
			
	}

}
