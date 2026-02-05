package practiceAbs;

public class Rectangle extends Shape{
    int radi;
    public Rectangle(int radi, String name){
        super(name);
        this.radi=radi;
    }
    @Override
    public void decribe() {
        System.out.println("Это "+name +" radi "+ radi);
    }
}
