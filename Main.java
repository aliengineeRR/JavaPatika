import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int Matematik, Fizik, Turkçe, Tarih, Kimya, Biyoloji;

    Scanner inp = new Scanner(System.in);

    System.out.print("Matematik Notunuz: ");
    Matematik = inp.nextInt();

    System.out.print("Fizik Notunuz: ");
    Fizik = inp.nextInt();

    System.out.print("Turkçe Notunuz: ");
    Turkçe = inp.nextInt();

    System.out.print("Tarih Notunuz: ");
    Tarih = inp.nextInt();

    System.out.print("Kimya Notunuz: ");
    Kimya = inp.nextInt();

    System.out.print("Biyoloji Notunuz: ");
    Biyoloji = inp.nextInt();

    int toplam = (Matematik+ Fizik+ Turkçe+ Tarih+ Kimya+ Biyoloji);
    double ort = toplam/6;

    String sonuc = ort >= 50 ? " Sınıfı Geçti" : " Sınıfta Kaldı.";
    System.out.println(ort + sonuc);

    }
}
