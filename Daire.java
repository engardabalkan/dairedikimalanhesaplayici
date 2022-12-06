import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {

        double pi=3.14, r,alan,cevre,a,Dilimalani;
        Scanner input=new Scanner(System.in);
        System.out.println("Yarıçapı giriniz:");
        r=input.nextDouble();

        System.out.println("Açıyı giriniz:");
        a=input.nextDouble();

        alan=pi*r*r;
        System.out.println("Dairenin alanı:"+alan);

        cevre=2*pi*r;
        System.out.println("Dairenin cevresi:"+cevre);

        Dilimalani=(pi * (r*r) * a) / 360;
        System.out.println("Dilim alanı:"+Dilimalani);

    }



}
