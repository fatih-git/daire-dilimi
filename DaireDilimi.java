import java.util.Scanner;

/**
 * @author fatih-gir
 */

public class DaireDilimi {

    public static void main(String[] args) {

        int r, a, alan;
        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen dairenin yarıçapını giriniz:");
        r=input.nextInt();

        System.out.print("Lütfen daire diliminin açısını giriniz:");
        a=input.nextInt();

        alan= (int) ((3.14*(r*r)*a)/360);

        System.out.println("Daire diliminin alanı:"+alan);

    }

}
