public class binarysearch{
    public static boolean show(int arr[],int n,int lo,int hi){
        int mid=lo+(hi-lo)/2;
        if(lo>hi){
            return false;
        }
        if(arr[mid]==n){
            return true;
        }
        if(arr[mid]>n){
            return show(arr,n,lo,mid-1);
        }
        if(arr[mid]<n){
            return show(arr,n,mid+1,hi);
        }
        return false;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int n=arr.length-1;
        System.out.println(show(arr,7,0,n));
    }
}