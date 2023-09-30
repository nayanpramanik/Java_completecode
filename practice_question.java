
class cirlce{
    public int redius;

    cirlce()
    {
        System.out.println("I am a non-para constructor");

    }
    cirlce(int a)
    {
        System.out.println("I am a para constructor");
        this.redius=a;
    }

    public double area()
    {
        return Math.PI*this.redius*this.redius;
    }
}

class cylinder2 extends cirlce{
    public int height;

    cylinder2(int a,int h) {
        super(a);
        System.out.println("I am a para constructor of cylinder");
        this.height=h;
    }


    public double volume()
    {
        return Math.PI*this.redius*this.redius;
    }
}
public class practice_question {
    public static void main(String[] args) {
//cirlce obj = new cirlce(4);
cylinder2 obj2 = new cylinder2(9, 6);
    }
}

