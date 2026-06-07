package sorting;

import java.util.Scanner;

public class selection{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        // for(int i=0;i<n-1;i++){
        //     int min=Integer.MAX_VALUE;
        //     int minidx=-1;
        //     for(int j=i;j<n;j++){
        //         if(min>arr[j]){
        //             min=arr[j];
        //             minidx=j;
        //         }
        //     }
        //     int temp=arr[i];
        //     arr[i]=arr[minidx];
        //     arr[minidx]=temp;
        // }
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        // }
                  //apprach 2/////////
        for(int i=0;i<n-1;i++){
            int max=Integer.MIN_VALUE;
             int maxidx=-1;
            for(int j=0;j<n-i;j++){
                if(max<arr[j]){
                    max=arr[j];
                    maxidx=j;
                }
            }
            int temp=arr[n-i-1];
            arr[n-i-1]=arr[maxidx];
            arr[maxidx]=temp;
        }
        for(int i=0;i<n;i++){
           System.out.print(arr[i]+" ");
         }
    }
}
