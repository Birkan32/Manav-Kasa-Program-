import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
    double armutPerPrice =2.14 ,armut ,  elmaPerPrice =3.67 , domatesPerPrice = 1.11 , muzPerPrice =0.95 , patlicanPerPrice =5.00 ,elma ,domates, muz, patlican , toplamTutar , tutar1,tutar2,tutar3,tutar4,tutar5 ;
    Scanner input = new Scanner(System.in) ;
        System.out.print("Lütfen kg Cinsinden Giriniz");
        armut =input.nextDouble();
        tutar1=armutPerPrice*armut;

        System.out.print("Lütfen kg Cinsinden Giriniz");
        elma=input.nextDouble();
        tutar2=elmaPerPrice*elma;

        System.out.print("Lütfen kg Cinsinden Giriniz");
        domates =input.nextDouble();
        tutar3=domatesPerPrice*domates;

        System.out.print("Lütfen kg Cinsinden Giriniz");
        muz =input.nextDouble();
        tutar4=muzPerPrice*muz;


        System.out.print("Lütfen kg Cinsinden Giriniz");
        patlican =input.nextDouble();
        tutar5=patlicanPerPrice*patlican;


        toplamTutar = (tutar1+tutar2+tutar3+tutar4+tutar5);

        System.out.println("toplamTutar :" +toplamTutar);

    }
}
