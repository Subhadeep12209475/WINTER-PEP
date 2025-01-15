public class Rotation{
    public static void main(String args[]){
        int arr[]={ 1,2,3,4,5,6};//3,4,5,1,2
        int ans[]=new int[arr.length-1];
        int j=0;
        int k=2;
        for(int i=k;i<arr.length;i++){
            ans[j++]=arr[i];
        }
        for(int i=0;i<=k-1;i++){
            ans[j++]=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}