package 陣列; // 如果你有分封包的話

public class 二維陣列 { // 1. 必須有類別名稱

    public static void main(String[] args) { // 2. main 方法的標準寫法

        // 二維陣列練習
        int[][] nums = new int[2][2];
        nums[0][0] = 10;
        nums[0][1] = 20;
        nums[1][0] = 30;
        nums[1][1] = 40;

        System.out.println(nums[0][1]); // 預期輸出 20
    }
}