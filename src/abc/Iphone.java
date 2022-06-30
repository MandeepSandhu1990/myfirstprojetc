package abc;

public class Iphone extends MobileBase{
    public Iphone() {
        System.out.println("Constructing Iphone");
    }

    public Iphone(String name, int rate) {
        super(name, rate);
        System.out.println("Constructing Iphone with param");
    }

    public void calPrice(){
        System.out.println("set price of Iphone");
        setPrice(getPrice() + 200);
    }
}
