public class varargs {
    static int sum(int a, int b)
    {
        return a + b;
    }
    static int sum(int a, int b,int c)
    {
        return a + b + c;
    }
    static int sum(int a, int b,int c, int d)
    {
        return a + b + c + d;
    }
    //to avoid such writing.....use varargs
    static int sum( int ...arr)
    {
        // it is packed as a array
        int result = 0;
        for(int a:arr)
        {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("the sum of number is:" +sum(4,5,6,7,8,9,10));
    }
}
