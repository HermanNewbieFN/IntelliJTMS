import java.util.Scanner;

public class tasksTMS {
    public static void main(String[] args) {
        radCalc();
        task2();
        hoursCalc();
        task4();
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
    public static void task2(){
        double sazh;
        double arsh;
        double versh;
        Scanner in=new Scanner(System.in);
        System.out.println("введите кол-ва Саженя");
        sazh=in.nextInt();
        System.out.println("введите кол-ва Аршина");
        arsh=in.nextInt();
        System.out.println("введите кол-ва Вершков");
        versh=in.nextInt();
        double result;
        result= (sazh * 48 * 4.445 + arsh * 16 * 4.445 + versh * 4.446)/100;
        System.out.println(result);
    }
    public static void hoursCalc(){
        int hours;
        int minutes;
        int seconds;
        Scanner in=new Scanner(System.in);
        System.out.println("введите сколько часов");
        hours=in.nextInt();
        System.out.println("введите сколько минут");
        minutes=in.nextInt();
        System.out.println("введите сколько секунд");
        seconds=in.nextInt();
        int result;
        result= (hours * 3600) + (minutes * 60) + (seconds);
        System.out.println(result);
    }
    public static void task4() {
        int h1;
        int m1;
        int h2;
        int m2;
        int waym;
        Scanner in = new Scanner(System.in);
        System.out.println("введите время отправления поезда - час");
        h1 = in.nextInt();
        System.out.println("введите время отправления поезда - минута");
        m1 = in.nextInt();
        System.out.println("введите время прибытия поезда - час");
        h2 = in.nextInt();
        System.out.println("введите время прибытия поезда - минута");
        m2 = in.nextInt();
        waym = ((h2 * 60) + m2) - ((h1 * 60) + m1);
        System.out.println("Поезд был в дороге " + waym);
    }
    }



