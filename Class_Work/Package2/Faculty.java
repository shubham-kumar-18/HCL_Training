package Class_Work.Package2;
import Class_Work.Package1.Student;
public class Faculty extends Student{
    public Faculty(int a){
        super(a);
    }
    public static void main(String[] args)
    {
        Faculty s = new Faculty(5);
        s.display();
    }
}
