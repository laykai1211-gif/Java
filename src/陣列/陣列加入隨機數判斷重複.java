import java.util.Random;
void main() {
Random random = new Random();
    int []arr = new int[10];
    for (int i = 0; i < arr.length; ) {
        int num = random.nextInt(100)+1;
    int count=0;
        for (int j = 0; j < arr.length ; j++) {
            if (num==arr[j]){ //arr[j] 陣列裡面的數字 跟隨機數比較 有沒有重複
                count++;
                break;
            }
        }
        if (count==0){
            arr[i]=num; //arr[i] 隨機數等於陣列裡的數字 第一次存到0 第二次存到1
            i++; //跳到下一格
        }
    }

    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
}


