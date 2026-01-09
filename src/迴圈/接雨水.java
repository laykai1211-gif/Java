package 迴圈;

public class 接雨水 {
    public static void main(String[] args) {
        // 原始地形高度陣列
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        // 1. 建立「左側最大值」陣列：記錄每個位置左邊（含自己）出現過最高的牆
        int[] leftmax = new int[arr.length];
        int temp = arr[0]; // 暫存目前的最高牆
        for (int i = 0; i < arr.length; i++) {
            if (temp > arr[i]) {
                leftmax[i] = temp; // 如果左邊牆比較高，這格的水位上限暫定為 temp
            } else {
                leftmax[i] = arr[i]; // 如果這格比左邊都高，更新最高牆
                temp = arr[i];
            }
        }
        //temp會不斷更新最大值，過程中 會把temp跟arr[i]中較大的值給leftmax
//        for (int i = 0; i < leftmax.length ; i++) {
//            System.out.print(leftmax[i]+" ,");
//        }
        //leftmax 0.1.1.2.2.2.2.3.3.3.3.3
        //temp0.1.1.2

        // 2. 建立「右側最大值」陣列：記錄每個位置右邊（含自己）出現過最高的牆
//        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] rightmax = new int[arr.length];
        temp = arr[arr.length - 1]; // 從最右邊開始往回找
        for (int i = arr.length - 1; i >= 0; i--) {
            if (temp > arr[i]) {
                rightmax[i] = temp;
            } else {
                rightmax[i] = arr[i];
                temp = arr[i];
            }
        }
//                for (int i = 0; i < rightmax.length ; i++) {
//                    if (i < rightmax.length - 1) {
//                        System.out.print(rightmax[i]+" , ");
//                    } else {
//                        System.out.print(rightmax[i]);
//                    }
//                }
        //rightmax 3 , 3 , 3 , 3 , 3 , 3 , 3 , 3 , 2 , 2 , 2 , 1
        //temp1.2.

        // 3. 決定水位高度：水桶效應（短板理論）
        // 每一格能盛水的總高度，取決於「左牆」與「右牆」之中比較矮的那一個
        int[] result = new int[arr.length];
        for (int i = 0; i < rightmax.length; i++) {
            if (leftmax[i] < rightmax[i]) {
                result[i] = leftmax[i]; // 左牆矮，以左牆為準
            } else {
                result[i] = rightmax[i]; // 右牆矮，以右牆為準
            }
        }
        //result=裝了水之後的陣列
        //result 0 , 1 , 1 , 2 , 2 , 2 , 2 , 3 , 2 , 2 , 2 , 1

//        for (int i = 0; i < result.length ; i++) {
//                    if (i < result.length - 1) {
//                        System.out.print(result[i]+" , ");
//                    } else {
//                        System.out.print(result[i]);
//                    }
//                }

        // 4. 計算總面積並扣除地形
        int sum = 0;
        // 先加總「包含地形+水」的總高度
        for (int i = 0; i < result.length; i++) {
            sum += result[i];
        }
        //把result的數字存到sum
//sum = 20

        // 減去「原始地形」的高度，剩下的面積就是「純雨水」
        for (int i = 0; i < arr.length; i++) {
            sum = sum - arr[i];
        }
//sum在減掉原本陣列的高度 20-14格=6
        System.out.println("總接雨水量：" + sum);
    }
}