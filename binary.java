import java.util.Scanner;
public class binary {
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
        int idx=-1;
        int low=0;
        int high=n-1;
        int flag=0;
        while(low<=high){
           int mid=(low+high)/2;
           if(arr[mid]==x){
                //    System.out.print("element found at index:");
                //    System.out.print(mid);
                //    flag++;
                //    break;
                idx=mid;
                low=mid+1;//for(first occurance:high=mid-1)
                flag++;

           }
           else if(arr[mid]>x){
            high=mid-1;
           }
           else{
            low=mid+1;
           }

        }
        if(flag==0){
               System.out.print("element not found");
        }
        else{
            System.out.println("element at"+idx);
        }
    }
}
