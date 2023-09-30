
class A{
    int a;
    public int meth(){
        return 4;
    }
    public void meth2()
    {
        System.out.println("I Am a Method of class A ");
    }
}
class B extends A{
    public int meth3(){
        return 9;
    }
    public void meth2(){
        System.out.println("I Am a Method of class B ");
    }
}
public class method_overriding {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
//        System.out.println(b.meth2());
    }
}
