package problemSolving_Intermediate1.interroductionToArrays;

import java.util.Collections;
import java.util.Scanner;

/**
 input : int arr[] = {1,2,3,4,5,6}
 output : int arr[] = {6,5,4,3,2,1}
 * */
public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        for(int i : reverseAnArr(arr)){
            System.out.print(i+" ");
        }
    }
    public static int [] reverseAnArr(int [] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }

}

