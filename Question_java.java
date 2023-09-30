/*class Employee01{

    int salary;
    String name;
    public int getSalaray()
    {
        return salary;
    }
    public String getname()
    {
        return name;
    }
    public void setname( String n){
        name = n;
    }*/


/*
class cellphone{
    public void ringing()
    {
        System.out.println("Ringing......");
    }
    public void vibrate()
    {
        System.out.println("Vibrating.....");

    }
    public void cellFriend()
    {
        System.out.println("Calling Apurva...");
    }
}

 */

import java.util.Scanner;
class rectangle{
    public int area(int bth,int len)
    {
        return len*bth;
    }
    public int parimeter(int len,int bth)
    {
        return 2*(len+bth);
    }
}
public class Question_java {
    public static void main(String[] args) {
        //Problem 1
        /*
        Employee01 nam = new Employee01();
        nam.setname("Nayan Kumar Pramanik");
        //nam.getname();
        System.out.println(nam.getname());
        nam.salary=150000;
        System.out.println(nam.salary);
        */

        // Problem 2
       /*
        cellphone redmi = new cellphone();
        redmi.ringing();
        redmi.vibrate();
        redmi.cellFriend();
        */

        //Problem 3

        Scanner sc = new Scanner(System.in);
        rectangle rec = new rectangle();
        System.out.println("Enter the Length: ");
        int leng = sc.nextInt();
        System.out.println("Enter the Breadth:");
        int beth = sc.nextInt();
        System.out.println("Please Select \n 1.Area \n 2.Parameter");
        int choice = sc.nextInt();
        if(choice == 1)
        {
           int A= rec.area(leng,beth);
            System.out.println("Area of rectangle:" + A);
        }
        else if( choice == 2)
        {
           int B= rec.parimeter(leng,beth);
            System.out.println("Perimeter Of rectangle:" +B);
        }
        else{
            System.out.println("Gand mara BC");
        }

    }

}
