public class insertion{
    public static void main(String args[]){
        int arr[]={10,7,9,3,4};
        for(int i=1;i<arr.length;i++){// 7,9,3,4
            int current=arr[i];//7
            int j;
            for(j=i-1;j>=0;j-- ){//10
                if(arr[j]>current){
                    arr[j+1]=arr[j];//10,10,9,3,4
                }else{
                    break;
                }
            }
            arr[j+1]=current;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}