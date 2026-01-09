package 迴圈;

public class 接雨水練習 {
    static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] leftmax = new int[arr.length];
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (temp > arr[i]) {
                leftmax[i] = temp;
            } else {
                leftmax[i] = arr[i];
                temp = arr[i];
            }
//            System.out.print(leftmax[i]+" ");
        }
        int[] rightmax = new int[arr.length];
        temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i >=0; i--) {
            if (temp > arr[i]) {
                rightmax[i] = temp;
            }else {
                rightmax[i]=arr[i];
                temp=arr[i];
            }
//            System.out.print(rightmax[i]+" ");
        }
        int []result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (leftmax[i]>rightmax[i]){
               result[i]=rightmax[i];
            }else {
                result[i]=leftmax[i];
            }
//            System.out.print(result[i]+" ");
        }
        while (true){
        int sum=0;
            for (int i = 0; i <result.length ; i++) {
                sum+=result[i];
            }
            for (int i = 0; i < arr.length ; i++) {
                sum-=arr[i];
            }
            System.out.println(sum);
            break;
        }
    }
//        int sum=0;
//        for (int i = 0; i < result.length ; i++) {
//            sum+=result[i];
//        }
//        for (int i = 0; i < arr.length ; i++) {
//            sum-=arr[i];
//        }
//        System.out.println(sum);
//    }

}
