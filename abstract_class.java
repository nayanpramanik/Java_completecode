
abstract class base2{
    base2()
    {
        System.out.println("I am A base2 class constructor!!!!!");
    }
    abstract public void neha();
    abstract public void nayan();
}

class drived extends base2{
    public void neha()
    {
        System.out.println("Hello i am neha");
    }

    @Override
    public void nayan() {
        System.out.println("Hii i am nayan");
    }
}
class drived2 extends base2{
    @Override
    public void neha() {
        System.out.println("how are you");
    }

    @Override
    public void nayan() {
        System.out.println("i am fine");
    }
}
abstract class dirved3 extends base2{
     void drived3(){
        System.out.println("this is also a abbstract class.....");
    }
}
public class abstract_class {

    public static void main(String[] args) {
       // base2 b = new base2(); // we canot create object of an abstract class because physically the code of an abstract class is not present
        // basically only class which contained all the method of an abstract class can be a concrite class and can make object of such class

        drived d1 = new drived();
        d1.neha();
        d1.nayan();
        // this class object can be create because it contained all the methode of an abstract class an this is a perfect concrite class.

       // dirved3 d3 = new dirved3(); in this class also we cannot create a object because all the method of an abstraact class is not present so this class become an abstract class

        // using an abstract class many other class can be form by using method that is decleared in that class but we cannot creatr object of that class


    }
}
