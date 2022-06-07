
public class TwoArraySort {   // two sorted arrays, merge them such that the elements are not repeated
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 5, 6, 7, 9, 10, 13};
        int[] arr2 = {2, 3, 4, 5, 6, 7, 8, 9, 11, 15,15,15,15,15,15,15,15,151,15};
        int[] resultArr = new int[arr1.length + arr2.length];
        int temp1 = 0;    // pointers for each array
        int temp2 = 0;
        int resultTemp = 0;
        int count = 0;

        while (temp1 < arr1.length && temp2 < arr2.length) {   // merging the array with no duplicates
            if (arr1[temp1] < arr2[temp2]) {
                resultArr[resultTemp++] = arr1[temp1++];
            } else if (arr1[temp1] == arr2[temp2]) {
                resultArr[resultTemp++] = arr1[temp1++];
                temp2++;
            } else if (arr1[temp1] > arr2[temp2]) {
                resultArr[resultTemp++] = arr2[temp2++];
            }
            count++;
        }

        if(temp1< arr1.length){        // adding the last value because of the variation in array size
            for(int i = temp1; i< arr1.length;i++){
                resultArr[resultTemp++] = arr1[temp1++];
                count++;
            }
        }else{
            for(int i = temp2; i< arr2.length;i++){
                resultArr[resultTemp++] = arr2[temp2++];
                count++;		
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.print(resultArr[i] + " ");
        }
    }
}
