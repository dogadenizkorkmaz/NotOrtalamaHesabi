import java.util.Scanner;

public class NotOrtalamaHesabı {
    public static void main(String[] args) {
        //ders isimleri tanımla
        int mat, fizik, kimya, turkce, tarih, muzik;
        //Scanner sınıfı tanımla
        Scanner inp = new Scanner(System.in);
        //kullanıcıdan değerleri al
        System.out.println("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.println("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.println("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.println("Türkçe Notunuz : ");
        turkce = inp.nextInt();

        System.out.println("Tarih Notunuz : ");
        tarih = inp.nextInt();

        System.out.println("Müzik Notunuz : ");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız : " + sonuc);

        double a = sonuc, b = 60;
        boolean x = a > b;
        boolean y = a < b;
        boolean kaldi = !x && y;
        String kalanortalama = kaldi ? "Sınıfta Kaldı" : "Sınıfı Geçti";
        System.out.println(kalanortalama);
    }
}
