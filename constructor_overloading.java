class Arearectangle{
    private int len;
    private int bre;

    public int getLen() {
        return len;
    }
    public int getBre()
    {
        return bre;
    }

    public void setBre(int bre) {
        this.bre = bre;
    }
    public void setLen(int len){
        this.len=len;
    }
    public Arearectangle(int n,int m){
        len=n;
        bre=m;
    }
}


public class constructor_overloading {
    public static void main(String[] args) {
        Arearectangle nm = new Arearectangle(5,6);
//        nm.setBre(5);
//        nm.setLen(10);
        System.out.println(nm.getBre());
        System.out.println(nm.getLen());
    }
}
