void main() {
    int[] arr1 = {1, 3, 5, 7, 9};
    int[] arr2 = {2, 4, 6};
    int[] arr3 = new int[arr1.length + arr2.length];
    int i = 0;
    int j = 0;
    int k = 0;

    while (i < arr1.length && j < arr2.length) {
        if (arr1[i] < arr2[j]) {
            arr3[k] = arr1[i];
            i++;
        } else {
            arr3[k] = arr2[j];
            j++;
        }
        k++;
    }
    while (j < arr2.length) {
        arr3[k] = arr2[j];
        j++;
        k++;
    }


    while (i < arr1.length) {
        arr3[k] = arr1[i];
        i++;
        k++;
    }

// 處理 arr2 中剩餘的元素


    for (int l = 0; l < arr3.length; l++) {
        System.out.println(arr3[l]);
    }
}


