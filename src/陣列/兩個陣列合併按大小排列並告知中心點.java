package 陣列;

public class 兩個陣列合併按大小排列並告知中心點 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4};
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;


        for (int m = 0; m < arr3.length; m++) {
            if (j == arr2.length) {
                arr3[m] = arr1[i];
                i++;
                continue;
            }
            if (i == arr1.length) {
                arr3[m] = arr2[j];
                j++;
                continue;
            }
            if (arr1[i] < arr2[j]) {
                arr3[m] = arr1[i];
                i++;
            } else {
                arr3[m] = arr2[j];
                j++;
            }
        }


//        while (i < arr1.length && j < arr2.length) {
//            if (arr1[i] < arr2[j]) {
//                arr3[k] = arr1[i];
//                i++;
//            } else {
//                arr3[k] = arr2[j];
//                j++;
//            }
//            k++;
//        }
//
//        while (j < arr2.length) {
//            arr3[k] = arr2[j];
//            j++;
//            k++;
//        }
//        while (i < arr1.length) {
//            arr3[k] = arr1[i];
//            i++;
//            k++;
//        }
        if (arr3.length%2==0) {
            //偶數情況
            int num1 = arr3[arr3.length/2];
            int num2 = arr3[arr3.length/2-1];
            System.out.println(num1+num2/2.0);
        }else{
            //奇數情況
            int num3 = arr3[arr3.length/2];
            System.out.println(num3/1.0);
        }
        for (int l = 0; l < arr3.length; l++) {
            System.out.println(arr3[l]);
        }
    }
}

