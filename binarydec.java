import java.util.Scanner;
public class binarydec {
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
        int low=n-1;
        int high=0;
        while(high<=low){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                System.out.println("element found at idx:"+mid);
                break;
            }
            else if(arr[mid]<x){
                low=mid-1;
            }
            else{
                high=mid+1;
            }
        }
    }
}
