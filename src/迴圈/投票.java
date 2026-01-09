package 迴圈;
import java.util.Random;
public class 投票 {
    public static void main(String[]args){
        //先定義陣列 0放棄票 1~5候選人
        int arr[] = new int [6];
        Random random=new Random();
        for (int i = 0; i <1000 ; i++) {
                        //包頭不包尾 0~5
        int vote = random.nextInt(0,6);
        arr[vote]++;

        }
        for (int i = 1; i < arr.length ; i++) {
            System.out.println("第"+i+"個候選人得票數是"+arr[i]+"得票率是"+arr[i]*100.0/1000.0+"%");
        }
        System.out.println("棄票數"+arr[0]+ " 棄票率 "+arr[0]*100.0/1000.0+"%");
        int max = arr[1];
        //從第3個開始跟第2個比 選出最大的
        for (int i = 2; i < arr.length ; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i]==max){
        System.out.println("最多票的是"+i+"得了"+max+"張票");
            }
        }
    }

}
