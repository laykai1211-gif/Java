void main() {
    //表符 \t 長度可變的大空格 打印表格類數據 上下對齊
    //讓前面的字補齊1~4個空格，補成4的倍數
        for (int i = 1; i <=9; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(+j+"*"+i+ "="+i*j+ "\t");
            }
            System.out.println();

        }
}