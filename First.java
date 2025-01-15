import java.util.*;
public class First{
    public static void main(String args[]){
        int n=6;
        int arr[]=new int[n];// 1,2,3,4,5,6
        int ans[]=new int [n];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 != 0){
                ans[k++]=arr[i];
            }
        }
        for(int j=arr.length-1;j>=0;j--){
            if(arr[j] %2 == 0){
                ans[k++]= arr[j];
            }
        }
        for(int i=0;i<ans.length;i++){
            System.out.println(arr[i]);
        }
    }
}