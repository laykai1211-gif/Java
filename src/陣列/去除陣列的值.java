void main() {
    int[] arr = {3, 2, 2, 3};
//    int [] arr = {0,1,2,2,3,0,4,2};
    int fast = 0;
    int slow = 0;
    int val = 3;

    //把要的數加進陣列裡，在print出來 slow++是讓slow跳到陣列下一個數
    while (fast < arr.length) {
        //fast 不等於3 ,就讓fast賦值到slow 最後print出來
        //等於3的話就fast++跳過
        //不論等不等於3 都要fast++
        if (arr[fast] != val) {
            arr[slow] = arr[fast];
            slow++;
        }
        fast++;
    }
        for (int i = 0; i < slow; i++) {
            System.out.print(arr[i] + " ");
        }
        }

//    int arr[] = {2,3,8,4,6,5,1,9,2,6,5,4,3,2,1,7,9,5};
//    int fast=0;
//    int slow =0;
//    int val=3;
//    while (fast< arr.length){
//        if (arr[fast]!=val){
//            arr[slow]=arr[fast];
//            slow++;
//        }
//        fast++;
//    }
//    for (int i = 0; i < slow; i++) {
//        System.out.print(arr[i]+" ");
//    }
//    }
