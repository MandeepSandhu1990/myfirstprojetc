package abc;

public class MobileBase {
    private String modelName;
    private int price;

    public MobileBase() {
        System.out.println("Constructing MobileBase");
    }

    public MobileBase(String name, int rate) {
        modelName = name;
        price = rate;
    }

    public void setModelName(String name) {
        this.modelName = name;
    }

    public void setPrice(int rate) {
        this.price = rate;
    }
    public void calPrice(){
        price = price+5;
    }

    public String getModelName() {
        return modelName;
    }

    public int getPrice() {
        return price;
    }
}
