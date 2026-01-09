public class 變量進位和次方 {
    public static void main(String[] args) {
    int x = 10;
    int y = 3;

//        System.out.println(Math.pow(x,y)); //x的y次方
        System.out.println(Math.round(3.452165)); //小數點第一位數四捨五入
//        System.out.println(Math.ceil(3.3)); //無條件進位
//        System.out.println(Math.floor(3.7));//無條件捨去
        System.out.println(Math.round(3.452165*10)/10.0); //小數點第二位數四捨五入
        System.out.println(Math.round(3.452165*100)/100.0); //小數點第三位數四捨五入
    }
}
