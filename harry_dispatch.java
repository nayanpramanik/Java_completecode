
class phone{
    public void calling()
    {
        System.out.println("Calling Priyam.....");
    }
    public void ShowTime()
    {
        System.out.println("**Timing Is 9 PM**");
    }
}

class SmartPhone extends phone{
    public void music()
    {
        System.out.println("Playing Music....");
    }
    public void calling()
    {
        System.out.println("Calling Apurva...");
    }
    public void ShowTime()
    {
        System.out.println("**Timing Is 11 PM");
    }

}
public class harry_dispatch {
    public static void main(String[] args) {
        phone obj = new SmartPhone(); //allowed as refrence is of super class and object is of sub class
        SmartPhone obj1 = new SmartPhone();

        //SmartPhone obj2 = new phone(); // not allowed as refference can be ussed of only super class not sub class

        // object is of sub class but refrence is of supper class here super class is phone and sub class is smartphone
        //object is crreted during run time not on complining time

        // this is a type of runtime polymorphism because object of sub class that is reffrenece of super class can be use for both class

        obj.calling(); // here the output comes from Smartphone not phone because smartphone is treated as sub class and phone is treated as superclass so the object is of sub class then output will be of sub class
        obj.ShowTime();
        obj1.music();
    }
}
