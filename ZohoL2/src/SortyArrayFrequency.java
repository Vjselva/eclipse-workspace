import java.util.Scanner;

public class SortyArrayFrequency {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count ");
		int count = sc.nextInt();
		int array[] = new int[count];
		int frequency[] = new int[count];
		System.out.println("Enter the Array elements ");
		for (int i = 0; i < count; i++) {
			array[i] = sc.nextInt();
		}

		for (int i = 0; i < count - 1; i++) {
			for (int j = i + 1; j < count; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;

				}
			}
		}
		System.out.println("Original Array ");
		for(int i=0;i<count;i++)
		{
			System.out.println(array[i]);
		}

		for (int i = 0; i < count; i++) {
			int frequencyCount = 0;
			for (int j =i; j < count; j++) {
				if (array[i] == array[j]) {
					frequency[j] = 0;
					frequencyCount++;
				} else {
					frequency[i] = frequencyCount;
					i += frequencyCount - 1;
					frequencyCount = 0;
					break;
				}
				if(i==count-1)
				{
					frequency[i] = frequencyCount;
					i += frequencyCount - 1;
					frequencyCount = 0;
					break;
				}
			}
		}
		System.out.println("Frequency Array ");
		for(int i=0;i<count;i++)
		{
			System.out.println(frequency[i]);
		}

		for (int i = 0; i < count - 1; i++) {
			if (frequency[i] != 0) {
				for (int j = i + 1; j < count; j++) {
					if (frequency[i] < frequency[j]) {
						int temp = frequency[i];
						int temp1=array[i];
						frequency[i] = frequency[j];
						array[i]=array[j];
						frequency[j] = temp;
						array[j]=temp1;

					}
				}
			}
		}
		
		for(int i=0;i<count;i++)
		{
			if(frequency[i]!=0)
			{
				for(int j=0;j<frequency[i];j++)
				{
					System.out.print(array[i]);
				}
			}
		}
		
		

	}
}
