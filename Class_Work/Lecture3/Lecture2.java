package Class_Work.Lecture3;
abstract class A{
    abstract void m1();
    abstract int m2();
}
class B extends A{
    @Override
    void m1(){
        System.out.println("Hello");
    }
    int m2(){
        return 10;
    }

}

public class Lecture2 {
    public static void main(String[] args) {
        B b = new B();
        b.m1();
        System.out.println(b.m2());
    }
}
