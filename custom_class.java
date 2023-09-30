import java.sql.SQLOutput;

class Employee{
    int id;
    String name;
    int salary;

    public void printdetails(){
        System.out.println("This Is My Id:" + id);
        System.out.println("My Name:" + name);

    }
    public int getsalary()
    {
        return salary;
    }
}
public class custom_class {
    public static void main(String[] args) {
        System.out.println("This is our class");
        Employee nayan = new Employee();
        Employee raj = new Employee();
        //attributes of kumar
        raj.id = 16;
        raj.name = "Kumar";
        raj.salary = 34;

        //attributes of rahul
        nayan.id = 15;
        nayan.name = "rahul";
        nayan.salary = 30;
        //printing attributes
      //  System.out.println(nayan.id);
      //  System.out.println( nayan.name);
        nayan.printdetails();
       int salary =  nayan.getsalary();
        salary =  raj.getsalary();
        raj.printdetails();
        System.out.println(raj.salary);

        System.out.println(nayan.salary);


        
    }
}
