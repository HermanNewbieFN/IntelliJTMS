public class tasksTMS2 {
    public static void main(String[] args) {
    int[] mas={12,13,140};
    umnArgumentov(mas, 10);
    for (int i=0; i<mas.length; i++){
        System.out.println(mas[i]);
    }

    }

    public static void umnArgumentov(int[] array, int value){
        int i = 1;
        array[i]*=value;
        }


}
