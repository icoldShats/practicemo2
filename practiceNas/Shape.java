package practiceNas;

public class Shape {
    String color;

    public Shape(String color){
        this.color=color;
    }

    public void describe(){
        System.out.println("Это фигура, цвет:" + color);
    };
}
