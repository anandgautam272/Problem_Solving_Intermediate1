package problemSolving_Intermediate1.interroductionToArrays;
/****
 input : N=5
         arr = {1,2,3,4,5}
         k = 2;
 output : 4,5,1,2,3

 * *****/

import java.util.Scanner;

public class Rotate_An_Array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        for(int i : rotateAnArr(arr,k)){
            System.out.print(i+" ");
        }
    }
    public static int [] rotateAnArr(int [] arr,int k){
            int n = arr.length-1;
            k=k%n;
            reverseAnArr(arr,0,n);
            reverseAnArr(arr,0,k-1);
            reverseAnArr(arr,k,n);
            return arr;
    }
    public static int [] reverseAnArr(int [] arr,int start,int end){
        int i=start;
        int j=end;
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
