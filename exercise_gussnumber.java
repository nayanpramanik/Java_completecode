import java.util.Random;
import java.util.Scanner;
//import java.util.random.RandomGenerator;

class game {
    public int number;
    public int Takeuser;
    public int NoOfGauss = 0;

    public void setNoOfGauss(int NoOfGauss) {
        this.NoOfGauss = NoOfGauss;
    }

    public int getNoOfGauss() {
        return NoOfGauss;
    }

    game() {
        Random rand = new Random(100);
        this.number = rand.nextInt();
    }

    void takeuserInput(){
        System.out.println("Guss The Number:");
        Scanner sc = new Scanner(System.in);
        Takeuser = sc.nextInt();
    }

    boolean iscorrect() {
        NoOfGauss++;
        if (Takeuser == number) {
            System.out.format("Yes you gasse correct number is %d in %d attemped",number,NoOfGauss);
            return true;
        }
        else if (Takeuser<number) {
            System.out.println("TOO LOW..");
        }
        else if (Takeuser>number) {
            System.out.println("TOO HIGH..");
        }
        return false;
    }
}
public class exercise_gussnumber {
    public static void main(String[] args) {
    game g = new game();
    boolean b = false;
    while(!b){
        g.takeuserInput();
      b = g.iscorrect();
    }
    }
}
