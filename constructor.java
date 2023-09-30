import java.sql.SQLOutput;

class myMainEmployee {
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public int getId() {
        return id;
    }

    public void setId(int m) {
        this.id = m;
    }

    public myMainEmployee() {
        id = 45;
        name = "Apurva";
    }
    public myMainEmployee(int i,String k) { //constructor overloading , we can overload our constructor as much as we can and we can create constructor overloder more then 2
        id = i;
        name = k;
    }
    //constructor name must be same as class name
    public myMainEmployee(int p ) {
        id = p;
    }
}
public class constructor {

    public static void main(String[] args) {
            myMainEmployee naam = new myMainEmployee();
//            naam.setId(62);
//            naam.setName("nayan");
        System.out.println(naam.getId());
        System.out.println(naam.getName());

    }
}
