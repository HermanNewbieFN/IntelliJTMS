import java.util.Scanner;
public class tasksTMS2 {
    public static void main(String[] args) {
        task1();
        }
        /**
         * Простая (2 балла)
         *
         * Путник двигался t1 часов со скоростью v1 км/час, затем t2 часов — со скоростью v2 км/час
         * и t3 часов — со скоростью v3 км/час.
         * Определить, за какое время он одолел первую половину пути?
         */

        public static void task1 () {
            Scanner in = new Scanner(System.in);

            System.out.println("Кол-во часов передвижения первый промежуток");
            int t1=in.nextInt();

            System.out.println("Кол-во часов  передвижения второй промежуток");
            int t2=in.nextInt();

            System.out.println("Кол-во часов  передвижения третий промежуток");
            int t3=in.nextInt();

            System.out.println("Скорость передвижения первый промежуток км/ч");
            int v1=in.nextInt();

            System.out.println("Скорость передвижения второй промежуток км/ч");
            int v2=in.nextInt();

            System.out.println("Скорость передвижения третий промежуток км/ч");
            int v3=in.nextInt();

            int Vf=v2/2;
            int firsthalf=v1 + Vf;
            System.out.println("Часов потрачено на первую половину пути " + firsthalf);
        }
}