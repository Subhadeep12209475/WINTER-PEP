public class Selection{
    public static void main(String args[]){
        int arr[]={3,2,5,1,9};
        for(int i=0;i<arr.length-1;i++){
            int key=arr[i];
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<key){
                    key=arr[j];
                    min=j;
                }
            }
            int tem=arr[i];
            arr[i]=arr[min];
            arr[min]=tem;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}