
class animal{
    public void species()
    {
        System.out.println("Dog Species Is Labra Dog");
    }
    public void eat()
    {
        System.out.println("Dog Eat");
    }
    public void walk(){
        System.out.println("Walk on Four Leg");
    }
    public void bark()
    {
        System.out.println("Bark");
    }
}

class labra extends animal{
    public void Labra()
    {
        System.out.println("Nice And Family Friendly Dog");
    }
}
public class Example_inheritance {
    public static void main(String[] args) {
        labra lb = new labra();
        lb.eat();
        lb.bark();
        lb.species();
        lb.walk();
        lb.Labra();
    }
}
