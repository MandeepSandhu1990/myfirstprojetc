package abc;

public class TestPoly {
    public static void main(String[] args) {
        MobileBase a = new MobileBase("Simple Mobile", 500);
        MobileBase b = new MobileBase("Iphone",800);
        MobileBase c = new MobileBase("Samsung",600);
        a.calPrice();
        b.calPrice();
        c.calPrice();
        System.out.println("Price of Simple Mobile: " + a.getPrice());
        System.out.println("Price of Iphone: " + b.getPrice());
        System.out.println("Price of Samsung: " + c.getPrice());
    }
}
