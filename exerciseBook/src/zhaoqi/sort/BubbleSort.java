package zhaoqi.sort;

/**
 *  bubble sort
 *  rehabilitation training for zhang
 */
public class BubbleSort {

    //优化
    public static int[] bubbleSort_1(int[] arr){
        for(int i=0;i<arr.length;i++){
            boolean flag = true;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if(flag == true){
                return arr;
            }
        }
        return arr;
    }

    public static int[] bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {1,8,9,7,5,6,2,3};
        //int[] newArr = bubbleSort(arr);
        int[] newArr = bubbleSort_1(arr);
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }
    }
}
