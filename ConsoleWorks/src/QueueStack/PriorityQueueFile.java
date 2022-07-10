package QueueStack;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

class FileSystem {
	static String folderName;
	Queue<Filecontent> filePriorityQueue = new PriorityQueue<>(idComparator);

	void start() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n--- ORDER A FILE AS PER PRIORITY ---");
		System.out.print("\nCreate Folder Name ");
		folderName = sc.next();
		File folder = new File("F://" + folderName);
		boolean flag = folder.mkdir();
		if (flag) {
			System.out.println("\n--- Folder created ---");
		}
		System.out.print("\nHow many files you want created ");
		int count = sc.nextInt();
		for (int i = 1; i <= count; i++) {
			System.out.print("\nFile " + i + " Name ");
			String fname = sc.next();
			File f1 = new File("F://" + folderName + "/" + fname + "txt");
			boolean flag1 = false;
			try {
				flag1 = f1.createNewFile();

				if (flag1) {
					System.out.print("File " + i + " Content ");
					sc.nextLine();
					String fileContent = sc.nextLine();
					FileWriter fw = new FileWriter(f1);
					fw.write(fileContent);
					fw.close();
				} else {
					System.out.println("$-- File already Exist/ File not creates --$");
				}
			} catch (IOException e) {
				System.out.println("$-- Unable to write into file --$");
			}

		}
		addDataToQueue(filePriorityQueue);
		pollDataFromQueue(filePriorityQueue);
	}

	public static Comparator<Filecontent> idComparator = new Comparator<Filecontent>() {

		@Override
		public int compare(Filecontent c1, Filecontent c2) {
			if (c1.getCount() > c2.getCount())
				return 1;
			else if(c1.getCount()<c2.getCount())
				return -1;
			return 0;
		}
	};

	void addDataToQueue(Queue<Filecontent> filePriorityQueue) throws IOException {

		File folder = new File("F://" + folderName);
		File filesList[] = folder.listFiles();
		for (File file : filesList) {
			FileReader fr = new FileReader(file);
			int count = 0;
			String temp = "";
			int i = 0;
			while ((i = fr.read()) != -1) {
				count++;
				temp += (char) i;
			}
			filePriorityQueue.add(new Filecontent(count, temp));

		}
	}

	private static void pollDataFromQueue(Queue<Filecontent> filePriorityQueue) {

		while (true) {
			Filecontent f = filePriorityQueue.poll();
			if (f == null)
				break;
			System.out.println("\n FILE DATA COUNT -- " + f.getCount() + " -- " + f.getFilecontent());
		}
	}
}

public class PriorityQueueFile {

	public static void main(String[] args) throws IOException {
		new FileSystem().start();

	}

}