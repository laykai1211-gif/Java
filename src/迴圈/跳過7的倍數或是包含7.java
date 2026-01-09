void main() {
    for (int i=1;i<=100;i++){
        if (i%10==7 || i/10%10==7 || i%7==0 ){
            System.out.println("跳過");
            continue;

        }
        System.out.println(i);
    }
}