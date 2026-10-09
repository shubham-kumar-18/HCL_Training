package Class_Work.Lecture3;
interface A1{
    abstract void show();
    abstract void game();
}
interface B1{
    void display();
}
class C implements A1,B1 {
    @Override
    public void display() {
        System.out.println("Display function");
    }

    @Override
    public void show() {
        System.out.println("show Function");
    }

    @Override
    public void game() {

    }
}
public class multipleinheritance {
    public static void main(String[] args) {
        C c = new C();
        c.display();
        c.show();
    }
}
