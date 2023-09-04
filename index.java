//package lab1.example.first;
import java.util.Scanner;

public class index {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("x= ");
        float x = in.nextFloat();

        System.out.print("y= ");
        float y = in.nextFloat();

        double p = ((2*(x*x)+(x*y))/((x*y)*(x*y)))+(((3*x*y)-(y*y*y))/((x*x)+(2*(y*y))));
        System.out.println("p=" + p);

        in.close();
    }
}