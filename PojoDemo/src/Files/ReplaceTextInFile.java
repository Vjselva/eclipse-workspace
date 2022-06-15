package Files;

import java.util.Scanner;

public class ReplaceTextInFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		import java.io.BufferedReader;
		import java.io.File;
		import java.io.FileReader;
		import java.io.FileWriter;
		import java.io.IOException;
		 
		public class TextFileModificationProgram
		{   
		    static void modifyFile(String filePath, String oldString, String newString)
		    {
		        File fileToBeModified = new File(filePath);
		         
		        String oldContent = "";
		         
		        BufferedReader reader = null;
		         
		        FileWriter writer = null;
		         
		        try
		        {
		            reader = new BufferedReader(new FileReader(fileToBeModified));
		             
		            //Reading all the lines of input text file into oldContent
		             
		            String line = reader.readLine();
		             
		            while (line != null) 
		            {
		                oldContent = oldContent + line + System.lineSeparator();
		                 
		                line = reader.readLine();
		            }
		             
		            //Replacing oldString with newString in the oldContent
		             
		            String newContent = oldContent.replaceAll(oldString, newString);
		             
		            //Rewriting the input text file with newContent
		             
		            writer = new FileWriter(fileToBeModified);
		             
		            writer.write(newContent);
		        }
		        catch (IOException e)
		        {
		            e.printStackTrace();
		        }
		        finally
		        {
		            try
		            {
		                //Closing the resources
		                 
		                reader.close();
		                 
		                writer.close();
		            } 
		            catch (IOException e) 
		            {
		                e.printStackTrace();
		            }
		        }
		    }
		     
		    public static void main(String[] args)
		    {
		    	String str1,str2;
		    	System.out.println("Enter String :");
		    	Scanner s=new Scanner(System.in);
		    	str1=s.nextLine()
		    			System.out.println("Enter String 2:");
		    	str2=s.next
		        modifyFile("C:/StudentFile.txt", "85", "95");
		         
		        System.out.println("done");
		    }
		}
	}

}
