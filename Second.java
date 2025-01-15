public class Second{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int temp;
        int ans[]=new int[n];
        if(n%2==0){
        for(int i=0;i<arr.length;i++){
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            i++;
        }
        }
        else{
            for(int j=0;j<arr.length-1;j=j+2){
            temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}