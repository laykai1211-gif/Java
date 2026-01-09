package Method;

public class 基礎1 {
    public static void main(String[]args){
//定義函數 反覆使用的獨立功能
//函式不調用 不執行
//不能用a函式定義b函式
//函式會優先調用型態,引數一樣的,沒有就會隱式轉換
//return 1.結束方法 2.將結果返回給調用者 3.方法返回值是void 可以省略return
//如果不省略return後面不能寫具體數據,僅表示結束函式
double len = 5.3;
double wid = 7.4;
double len1= 3.8;
double wid1= 5.1;
        System.out.println(getArea(len1,wid1));
System.out.println(getArea(len,wid));

    }
public static  double getArea(double len,double wid){
return len*wid;
}




}
