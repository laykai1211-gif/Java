void main() {
    int []arr= {1,1,1,1,2,2,2,2,3,3,3,3,3,4};
    int fast = 1;
    int slow = 0;
    //slow在後 fast在前 一樣的fast就繼續往前，直到不同的數字
    //就讓slow++，再讓fast賦值給slow 然後fast++繼續往前
    //最後讓slow
    while (fast< arr.length) {
        if (arr[slow] != arr[fast]) {
            slow++;
            arr[slow] = arr[fast];
        }
        fast++;
    }
    for (int i = 0; i <=slow; i++) {
        System.out.print(arr[i] + " ");
    }

}