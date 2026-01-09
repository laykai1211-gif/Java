
void main() {
//max不能賦值0 如果陣列是負數 那就會顯示0
    int[] arr = {33, 5, 22, 44, 55};
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
        if (max<arr[i]){
            max=arr[i];
        }

    }
    System.out.println(max);
}