public class method_overloading {
    static void change(int [] arr)
    {
        arr[0] = 32;
    }

    public static void main(String[] args) {
        int [] marks ={25,29,30,35};
        System.out.println(marks[0]);
        change(marks);
        System.out.println("The value of X after running change is: " +marks[0]);
        System.out.println(marks[0]);

    }
}
