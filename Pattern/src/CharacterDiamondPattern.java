import java.util.Scanner;

public class CharacterDiamondPattern
{
	public static void main(String[] args) {

    int letter_number = 0;
    String[] diamond = new String[26]; // array of strings
    System.out.print("Enter a Character between A to Z : ");
    Scanner reader = new Scanner(System.in);
    char user_letter = reader.next().charAt(0);
    letter_number=(int)user_letter-'A';
    //    System.out.println(letter_number);
    char start_letter='A';
    for(int i=0;i<=letter_number;i++)
    {	diamond[i] = "";
    	for(int j=0;j<letter_number-i;j++)
    	{
    		diamond[i]+=" ";
    	}
    	diamond[i]+=start_letter;
    	//System.out.println(diamond[i]);
    	if(start_letter!='A')
    	{
    		for(int k=0;k<2*i-1;k++)
    		{
    			diamond[i]+=" ";
    		}
    		diamond[i]+=start_letter;
    		
    	}
    	System.out.println(diamond[i]);
    	start_letter++;
    }
    for(int i=letter_number-1;i>=0;i--)
    {
    	System.out.println(diamond[i]);
    }
 }
}