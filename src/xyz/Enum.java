package xyz;

public class Enum {
    public static void main(String[] args) {
        ShirtFactory shirtFactory = new ShirtFactory();
        System.out.println(shirtFactory.getShirt("red", Size.M));
    }
}
enum Size {
    S, M, L, XL
        }
class ShirtFactory{
    public Shirt getShirt(String color, Size size){
        return new Shirt(size, color);
    }
}

class Shirt{
    private Size size;
    private String color;

    public Shirt(Size size, String color) {
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
