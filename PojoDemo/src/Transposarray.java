import java.util.Scanner;

public class Transposarray
{
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter array Row: ");
      int row=sc.nextInt();
      System.out.println("Enter array coloum: ");
      int col=sc.nextInt();
      System.out.println("enter array values: ");
      
      int array[][]=new int[row][col];
      int TransposeArray[][]=new int[col][row];
      for(int i=0;i<row;i++)
      {
          for(int j=0;j<col;j++)
          {
              array[i][j]=sc.nextInt();
              TransposeArray[j][i]=array[i][j];
          }
      }
      System.out.println("Transpose array");
      for(int i=0;i<col;i++)
      {
          for(int j=0;j<row;j++)
          {

             System.out.print(TransposeArray[i][j]);
          }
          System.out.println();
      }
  }
}
