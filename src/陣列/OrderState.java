package 陣列;

public enum OrderState {
    //    OrderState PAYMENT_PENDING = new OrderState("待支付");
    PAYMENT_PENDING("待支付狀態"),
    PROCESSING("處理中"),
    SHIPPED("已發貨"),
    OUT_FOR_DELIVERY("配送中"),
    DELIVERED("已送達"),
    CANCELLED("已取消");

    private String name;

    OrderState(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
