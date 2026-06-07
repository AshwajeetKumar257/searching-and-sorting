import java.util.Scanner;

public class mountainarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of an array:");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int lo=n-1;
        int hi=0;
        int flag=0;
        while(hi<=lo){
            int mid=(lo+hi)/2;
            if(mid!=0&&mid!=n-1&&arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]){
                System.out.println(arr[mid]);
                flag++;
                break;
            }
            else if(mid!=0&&mid!=n-1&&arr[mid]<arr[mid-1]){
                lo=mid-1;
            }
            else{
                hi=mid+1;
            }
        }
        if(flag==0){
            System.out.println("peak not found");
        }
    }
}
