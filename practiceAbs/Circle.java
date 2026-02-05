package practiceAbs;

public class Circle extends Shape{
    int radius;

    public Circle(int radius, String name){
        super(name);
        this.radius=radius;
    }

    public void decribe(){
        System.out.println("Это "+ name + " радиус: " + radius);
    }
}
