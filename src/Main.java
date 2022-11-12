import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int r , alfa;
        double pi=3.14, alan;

        Scanner input=new Scanner(System.in);

        System.out.print("Yarı çapı giriniz: ");
        r=input.nextInt();

        System.out.print("Açı ölçüsünü girin: ");
        alfa=input.nextInt();

        alan=(pi * (r*r) * alfa) / 360;

        System.out.println("Daire diliminin alanı :" + alan);
    }

}