public class method_usingobj {
    int product(int x,int y) //if we did not write static then it means it is not be useable without object.
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
        method_usingobj obj = new method_usingobj();
        int a = 5;
        int b = 7;
        int c = obj.product( a,b);
        int d = obj.product(9,6);
        System.out.println(c);
        System.out.println(d);
    }

}
