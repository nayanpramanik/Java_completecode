interface bicycle{
    void speedup(int increase);
    void breakdwn(int drecrease);
}

interface riding{
    void ride();
}
class cycle implements bicycle,riding{
   public void speedup(int increase)
    {
        System.out.println("Speed increase......");
    }
    public void breakdwn(int drecrease)
    {
        System.out.println("Speed Decrease......");
    }

    @Override
    public void ride() {
        System.out.println("I am riding bicycle.....");
    }
}

public class interface_java {
    public static void main(String[] args) {
        cycle c = new cycle();
        c.speedup(5);
        c.breakdwn(9);
        c.ride();

    }
}

/*
why multiple inheritange is not allowed in java?
=> multiple inheritance face problem when these exist method with same signature in both the super class.
due to such problem java does not support multiple inheritance directive but similar concept can be achive using interface,
a class can implment multiple interface and extend a class at the same time.

--interface in java is a bit like a class but with a signification  difference
--An interface can only have method signatures field(constant) and default methods.
--the class implementing an interface needs to an declare the methods(not fields).
--you can create a refernce of interface bt not the object.
--interface method are public by default.
 */
