import java.util.Scanner;

public class floor {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of an array:");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
           System.out.print("enter the element to be search");
        int x=sc.nextInt();
        int low =0;
        int high=n-1;
        int idx;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                idx=mid+1;
            }
            else if(arr[mid]>x){
                high=mid-1;
            }
            else if(arr[mid+1]>x){
                System.out.println(mid+1);
            }
            else if(arr[mid]!=x){
                System.out.println("-1");
                break;
            }
            else{
                while(arr[mid+1]<x){
                    idx=mid+1;
                }
               
        }
       
    }
     
    }
}
