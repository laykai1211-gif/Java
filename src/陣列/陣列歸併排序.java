package 陣列;

public class 陣列歸併排序 { // 類別名稱要跟檔名一樣
    public static void main(String[] args) {
    int[] arr = {1, 3, 5, 7, 9};
    int target = 8;
    int left = 0;
    int right = arr.length - 1;

    // 用來記錄是否找到目標的旗標（可選，幫助理解流程）


    while (left <= right) {
        int mid = left + (right - left) / 2;
        //0+ 4-0/2
        if (arr[mid] == target) {
            System.out.println(mid); // 情況 1：剛好找到目標，印出索引
            break;
        } else if (arr[mid] < target) {
            // 情況 2：中間的值太小，目標在右半部
            left = mid + 1;
        } else {
            // 情況 3：中間的值太大，目標在左半部
            right = mid - 1;
        }
    }

    // 如果迴圈結束還沒找到，此時 left 的位置就是應插入的位置
    System.out.println(left);
}
}