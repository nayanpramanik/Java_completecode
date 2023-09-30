
class Employess02{
    private int id;
    private String name;
    public void setId( int i)
    {
        id = i;
    }
    public void setname( String n)
    {
        name = n;
    }
    public String getName()
    {
        return name;
    }
    public int getId()
    {
        return id;
    }

}
public class accesmodifiers {
    public static void main(String[] args) {
        Employess02 em = new Employess02();
//        em.name = "Nayan";
//        em.id = 02;
//        System.out.println(em.name);
        em.setname("Nayan Kumar Pramanik");
        System.out.println(em.getName());
        em.setId(251);
        System.out.println(em.getId());


    }
}
