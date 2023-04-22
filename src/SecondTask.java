import java.sql.Time;
import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        radCalc();
    }

    public static void radCalc() {
        int gradus;
        int min;
        int sec;
        System.out.println("введите градус угла");
        Scanner in = new Scanner(System.in);
        gradus = in.nextInt();
        System.out.println("введите минуты");
        min = in.nextInt();
        System.out.println("введите секунды");
        sec = in.nextInt();
        double mingr;
        mingr = min / 60;
        double secgr;
        secgr = sec / 3600;
        double allgrad;
        allgrad = gradus + mingr + secgr;
        double radianangle;
        final double PI = 3.14159265358979323846;
        radianangle = (allgrad * PI) / 180;
        System.out.println(radianangle);

    }
}