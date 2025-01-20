public class Question2{
    public static int show(int arr[][],int i,int j,int sum){
        if(i==arr.length){
            return sum;
        }
        if(j<arr[0].length){

        sum+=arr[i][j];
        }
        if(j==arr[0].length){
            return show(arr,i+1,0,sum);
        }
        else{
            return show(arr,i,j+1,sum);
        }
    }
    public static void main(String args[]){
        int arr[][]={{1,2,3},
                  {5,6,7},
                  {4,8,9}};
        int sum=0;
        System.out.println(show(arr,0,0,sum));
    }
}