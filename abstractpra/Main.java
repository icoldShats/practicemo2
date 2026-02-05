package abstractpra;

public class Main {
    public static void main(String[]args){
        Animal a1 = new Dog("Бобик");
        Animal a2 = new Cat("Мурка");

        a1.speak();
        a2.speak();

    }
}
