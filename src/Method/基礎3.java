package Method;

public class 基礎3 {
public static void main(String[]args){

    int [] arr1 = {1,2,3,4,5};

printarr(arr1);
}


    public static  void printarr(int[]arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){ //當i到陣列最大一個數-1 只print數字
                System.out.print(arr[i]);
            }else {System.out.print(arr[i]+",");}
        }
        System.out.print("]");
    }
}

