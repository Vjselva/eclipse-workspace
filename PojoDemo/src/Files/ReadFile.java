package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
	public static void main(String[] args) throws IOException {
		
		File file=new File("F:\\newfile.txt");
		String s;
		if(file.exists())
		{
			Scanner sc=new Scanner(file);
			while(sc.hasNextLine())
			{
				s=sc.nextLine();
				String s2=s.replaceAll("is", "t");
				System.out.println(s2);
			}
		}
	}
}
