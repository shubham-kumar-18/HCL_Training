package Class_Work.Lecture2;
class parent{
    int age=50;
    parent()
    {
        System.out.println("This is super");
    }
    void display()
    {
        System.out.println("parent class");
    }

}
class child extends parent{
    int age =25;
    child()
    {
        super();
        System.out.println("super is executed");

    }
    void show() {
        System.out.println(this.age);
        System.out.println(super.age);

        this.display();
        super.display();
    }

}

public class demo2 {
    public static void main(String[] args) {
        child c = new child();
        c.display();
        c.show();
    }

}
