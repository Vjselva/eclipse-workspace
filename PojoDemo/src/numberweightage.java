import java.util.Scanner;

public class numberweightage {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        int c[] = new int[n];
        int count,temp1,temp2;
        for (int i = 0; i < n; i++) {
            count = 0;
            arr[i] = sc.nextInt();
            if (Math.sqrt(arr[i]) * Math.sqrt(arr[i]) == arr[i]) {
                count += 5;
            }
            if (arr[i] % 4 == 0 && arr[i]%6 == 0) {
                count += 4;
            }
            if (arr[i] % 2 == 0) {
                count += 3;
            }
            c[i]=count;

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++)
                if(c[i] < c[j]) {
                    temp1 = c[i];
                    c[i] = c[j];
                    c[j] = temp1;
                    temp2=arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp2;

                }
            }
        for (int i = 0; i < n; i++) {
            {
                System.out.print("<"+arr[i]+","+c[i]+">");
            }
        }
    }
}
