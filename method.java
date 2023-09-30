public class method {
   static int product(int x,int y)
    {
        int z;
        if(x>y)
        {

            z = x + y;
        }
        else
        {
            z = (x + y)*3;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = product( a,b);
        int d = product(9,6);
        System.out.println(c);
        System.out.println(d);
    }
}
