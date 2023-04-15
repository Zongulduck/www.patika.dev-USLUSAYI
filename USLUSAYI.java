import java.util.Scanner;
public class USLUSAYI {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int say1,say2,sonuc=1;
        System.out.println("sayıyı giriniz");
        say1= inp.nextInt();
        System.out.println("üs giriniz");
        say2=inp.nextInt();

        if(say2==0){
            System.out.println("Sonuç: 1");
        }
        else {
            for(int i=1;i<= say2;i++) {
                sonuc *= say1;
            }
            System.out.println("Sonuç: " + sonuc);
        }
    }

}
