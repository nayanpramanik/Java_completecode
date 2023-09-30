
class ekclass{
    int a;
    ekclass(int v){
        a = v;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }
}

class doclass extends ekclass{
    doclass(int c){
        super(c);
        System.out.println("I AM A CONSTRUCTOR");
    }
}
public class this_superkey {
    public static void main(String[] args) {
        ekclass en = new ekclass(65);
        doclass d = new doclass(6);
        System.out.println(en.getA());
    }
}

// super keyword is used to