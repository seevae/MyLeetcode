package zhaoqi.sort;

//选择排序  --> 每次都从数列中选择出一个最小的数字从头排列
public class SelectSort {

    public static int[] selectSort(int[] arr){

        //错误写法
//        for(int i=0;i<arr.length;i++) {
//            int min = arr[i];
//            for (int j = i + 1; j < arr.length - 1; j++) {
//                if (arr[j] < min) {
//                    min = arr[j];
//                }
//            }
//            int temp = arr[i];
//            arr[i] = min;
//            min = temp;
//        }

        for(int i=0;i<arr.length;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            if(arr[min] != arr[i]){
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,3,5,6,9,7,1,8};
        int[] newArr = selectSort(arr);
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }
    }
}
