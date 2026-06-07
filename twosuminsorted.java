package sorting;
import java.lang.reflect.Array;
import java.util.Scanner;
import lecture6.sortarraybuitin;
public class twosuminsorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter target element:");
        int x=sc.nextInt();
        System.out.print("enter the size of an array:");
        int n=sc.nextInt();
        int []arr=new int[n];
         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //sort function
            Arrays.sort(arr);
            

        int i=0;
        int j=n-1;
        int flag=0;
        while(i<j){
            if(arr[i]+arr[j]==x){
                System.out.print("1st num at idx= "+i+" and "+"2nd num at idx= "+j);
                 flag++;
                break;
            }
            else if(arr[i]+arr[j]>x){
                j--;
            }
            else{
                i++;
            }
           
        }
        if(flag==0){
        System.out.println("not found two sum");
        }
    }
}
