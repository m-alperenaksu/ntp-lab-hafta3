import java.util.Scanner;
public class StudentTest {

	public static void main(String[] args) {
		Scanner input_s = new Scanner(System.in);
		Scanner input_d = new Scanner(System.in);
		
		String ad = new String();
		String soyad = new String();
		int ortalama;
		
		
		
		System.out.println("İlk kullanıcının adını giriniz: ");
		ad = input_s.nextLine();
		System.out.println("İlk kullanıcının soyadını giriniz: ");
		soyad = input_s.nextLine();
		System.out.println("İlk kullanıcının ders ortalamasını giriniz: ");
		ortalama = input_d.nextInt();
		while (ortalama < 0 || ortalama > 100) {
			System.out.println("Geçerli bir not giriniz: ");
			ortalama = input_d.nextInt();
		}
		
		Student o1 = new Student(ad,soyad, ortalama);
		
		System.out.println("İkinci kullanıcının adını giriniz: ");
		ad = input_s.nextLine();
		System.out.println("İkinci kullanıcının soyadını giriniz: ");
		soyad = input_s.nextLine();
		System.out.println("İkinci kullanıcının ders ortalamasını giriniz: ");
		ortalama = input_d.nextInt();
		while (ortalama < 0 && ortalama > 100) {
			System.out.println("Geçerli bir not giriniz: ");
		}
		
		Student o2 = new Student(ad, soyad, ortalama);
		
		o1.show();
		o2.show();

	}

}
