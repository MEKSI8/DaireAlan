import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Daire yarıçapını ve merkez açısının ölçüsünü giriniz:");
        int yaricap= input.nextInt();
        float merkezAci =input.nextFloat();

        float PI=3.14f;

        float alan=PI*yaricap*yaricap*merkezAci/360;

        System.out.println("Alan eşittir:"+alan);



    }
}