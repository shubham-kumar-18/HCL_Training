package Class_Work.Lecture2;
class parent1{
    public void m1()
    {
        System.out.println("This is parent");
    }

}
class child1 extends parent1{
    public void m1()
    {
        super.m1();
        System.out.println("THis is child");
    }

}
public class method {
    public static void main(String[] args) {
        child1 ch = new child1();
        ch.m1();
        parent1 c1 = new child1();
        c1.m1();
    }
}
