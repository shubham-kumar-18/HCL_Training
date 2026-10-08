package Class_Work.Lecture2;

public class demo {
    private demo(){
        System.out.println("This is a constructor");
    }
    int a;
    demo(int a )
    {
        this.a = a;
    }

    public static void main(String[] args)
    {
        demo s = new demo();
        demo i = new demo(3);
        System.out.println((i.a));
    }
}
