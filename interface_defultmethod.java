
interface cemera{
    void takesnap();
    void recordvideo();
    default void recording4K()
    {
        System.out.println("Recording 4K vedio.....");
    }
    /*
    default class is used when we want to add some extra method to an interface but we did not want to implment it to another class that is inherited or use in it.
     */
}
interface wifi{
    String[] getnet();
    void connectednet(String connected);
}
class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling"+phoneNumber);
    }
}

class mySmartPhone extends MyCellPhone implements wifi,cemera{
    @Override
    public void takesnap() {
        System.out.println("Taking Picture");
    }

    @Override
    public void recordvideo() {
        System.out.println("----Vedio Recording Start---");
    }

    @Override
    public String[] getnet() {
        System.out.println("Getting Connected To Network");
        String[] networklist = {"Nayan","Priyam","Hitesh","Apurvs"};
        return  networklist;
    }

//    @Override
//    public void recording4K() {             -->  we can redefine or overload method of interface class in extends class (child class),when wee declear
//    method of interface in extends class then this executed not which declear in interface  <---
//        System.out.println("Hello");
//    }

    @Override
    public void connectednet(String connected) {
        System.out.println("Connected" +connected);
    }
}

public class interface_defultmethod {
    public static void main(String[] args) {
   mySmartPhone ms = new mySmartPhone();
   String[] ar = ms.getnet();
   ms.recording4K();
        for (String item: ar) {
            System.out.println(item);
        }
    }
}
