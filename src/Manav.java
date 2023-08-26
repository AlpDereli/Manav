import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.println("Kaç kilo armut aldınız: ");
        float armut = take.nextFloat();
        System.out.println("Kaç kilo elma aldınız: ");
        float elma = take.nextFloat();
        System.out.println("Kaç kilo domates aldınız: ");
        float domates = take.nextFloat();
        System.out.println("Kaç kilo muz aldınız: ");
        float muz = take.nextFloat();
        System.out.println("Kaç kilo patlıcan aldınız: ");
        float patlıcan = take.nextFloat();
        float total = (armut * 2.14f) + (elma * 3.67f) + (domates * 1.11f) + (muz * 0.95f) + (patlıcan * 5.00f);
        System.out.println("Tutar: " + total);
    }
}
