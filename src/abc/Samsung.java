package abc;

public class Samsung extends MobileBase{
    public Samsung() {
        System.out.println("Constructing Samsung");
    }

    public Samsung(String name, int rate) {
        super(name, rate);
        System.out.println("Constructing parameters with param");
    }
    public void calPrice(){
        setPrice(getPrice() + 500);
    }
}
