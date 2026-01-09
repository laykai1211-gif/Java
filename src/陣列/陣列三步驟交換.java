import java.util.Random;
void main() {
    Random r = new Random();
    int[] arr = {1,2,3,4,5,6,7,8,9,10};
    for (int i = 0; i <arr.length; i++) {

        int randomIndex = r.nextInt(arr.length); //讓隨機數=陣列長度
        int temp = arr[i]; //把0放進盒子裡
        arr[i]=arr[randomIndex];// 把產生的隨機數字替換到0號盒子
        arr[randomIndex]=temp;// 把隨機數字放回盒子裡
        //如此操作,arr[i] 逐步修改成隨機數
    }
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
}