package abstractpra;

public abstract class Animal {
    protected String name;
    public Animal(String name){
        this.name=name;
    }
    public abstract void speak();
    public abstract void eat();
}
