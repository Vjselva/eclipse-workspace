package Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
  public static void main(String[] args) throws IOException {
	
	  File file=new File("F:\\newfile.txt");
	  if(file.createNewFile())
	  {
		  System.out.println("File created");
	  }
	  else
	  {
		  System.out.println("File already exist");
	  }
	  FileWriter fw=new FileWriter(file);
	  fw.write("This is my sample file");
	  fw.write("please refer the link zoho.com");
	  fw.close();
	  
	  
}
}
