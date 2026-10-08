package Class_Work.Lecture2;

public class overriding {
    String name;
    public overriding(String name){
        this.name=name;
    }
    public void display(){
        System.out.println("I am display method of parent class");
    }
    public void show(){
        System.out.println("I am show method of parent class");
    }
}
class Child extends overriding {
    int roll;

    Child(int roll, String name) {
        super(name);
        this.roll = roll;
    }

    public void display() {
        System.out.println("I am display method of child class");
    }

    public static void main(String[] args) {
        Child ch = new Child(21, "Suraj");
        overriding p = new overriding("Suraj");
        overriding p2 = new Child(21, "Suraj");
        //Child ch2 = new Parent("Suraj");
        ch.display();
        ch.show();
        p.show();
        p.display();
        p2.show();
        p2.display();
        //ch.super.display();
    }
}
