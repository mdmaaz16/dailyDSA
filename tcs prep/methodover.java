// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class student{
    int a=6;
    void happy(){
        System.out.println("Student class:"+a);
    }
}
class student1 extends student{
    int a=7;
    int b=86;
    void happy(){
        System.out.println("Student 1 class:"+b);
    }
    void hello(){
        System.out.print("Hi");
    }   
}
public class methodover {
    public static void main(String[] ar){
        student s;
        s = new student();
        s.happy();
        s=new student1();
        s.happy();
        // s.hello();
    }
}
