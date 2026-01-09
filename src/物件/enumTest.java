package 物件;

import 陣列.OrderState;

public class enumTest {
    public static void main() {
        OrderState o1 = OrderState.PAYMENT_PENDING;
        OrderState o2 = OrderState.PROCESSING;
//        System.out.println(o1.getName());

        switch (o2){
            case PAYMENT_PENDING -> System.out.println("待支付狀態");
            case PROCESSING -> System.out.println("處理中");
            case SHIPPED -> System.out.println("已發貨");
            case OUT_FOR_DELIVERY -> System.out.println("配送中");
            case DELIVERED -> System.out.println("已送達");
            case CANCELLED -> System.out.println("已取消");


        }
    }
}
