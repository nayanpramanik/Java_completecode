
class base{
    int x;
//    base()
//    {
//        System.out.println("I Am A Constructor");
//    }
    public int getX()
    {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class derive extends base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class inheritance {
    public static void main(String[] args) {
        derive d = new derive();
        base b = new base();

        b.setX(4);
//        b.getX();
        System.out.println(b.getX());

    }
}
