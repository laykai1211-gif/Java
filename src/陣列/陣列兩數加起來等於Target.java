void main() {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
    int target = 9;

    for (int i = 0; i < arr.length; i++) {
        for (int j = i; j < arr.length; j++) {
            if (arr[i] + arr[j] == target) {
                System.out.println(arr[i] + "+" + arr[j]+"="+ target);
            }
        }
    }
}
//    for (int i = 0; i < arr.length; i++) {
//        if (slow + arr[i] == target) {
//            System.out.println(slow + "+" + arr[i]);
//            slow++;
//            for (int j = i; j < arr.length; j++) {
//
//
//            }
//        }
//
//    }
//}







            //System.out.println(+slow+ "+" +fast+ "==" + target);
