import java.util.Arrays;
import java.util.Scanner;
public class DizidekiElemanlariBuyuktenKucugeSiralama {
    public static void main(String[] args) {

        Scanner imp = new Scanner(System.in);

        System.out.print("Dizinin boyutunu giriniz : ");
        int boyut = imp.nextInt();

        int[] list = new int[boyut];

        System.out.println("Dizinin elemanlarını giriniz");

        for (int i = 0; i < boyut; i++){
            System.out.print((i + 1) + ". Eleman : " );
           list[i] = imp.nextInt();
        }
        Arrays.sort(list);
        System.out.println("Dizinin küçükten büyüğe sıralanmış hali :  ");

        for (int eleman : list) {
            System.out.print(eleman + " ");
        }
    }
}
