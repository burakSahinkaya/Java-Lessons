package day13;

public class Day13Arrays03 {
    public static void main(String[] args) {

        //[0, 2, 3, 0, 12, 0] put the zeros to the end
        int arr[] = {0, 2, 3, 0, 12, 0};
        int newArr[]= new int[arr.length];

        int idx = 0;

        for(int i =0; i< arr.length;i++){
            if(arr[i]!=0){
                newArr[idx]=arr[1];
                idx++;
            }
        }
    }
}
