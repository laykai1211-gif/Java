package 大練4;

public class electronic extends product{
    String logo;
    int model;

    public electronic(String name, int price, String logo, int model) {
        super(name, price);
        this.logo = logo;
        this.model = model;
    }

    public electronic() {
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public electronic(String logo, int model) {
        this.logo = logo;
        this.model = model;
    }

    public void logo() {
        System.out.println("品牌");
    }


    public void model() {
        System.out.println("型號");
    }
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("品牌:"+logo+"型號:"+model);
    }
}
