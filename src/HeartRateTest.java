import java.util.Scanner;
public class HeartRateTest {

	public static void main(String[] args) {
		Scanner input_s = new Scanner(System.in);
		Scanner input_d = new Scanner(System.in);
		
		String ad = new String();
		String soyad = new String();
		int dogumyili;
		
		System.out.println("Kullanıcının adını giriniz: ");
		ad = input_s.nextLine();
		System.out.println("Kullanıcının soyadını giriniz: ");
		soyad = input_s.nextLine();
		System.out.println("Kullanıcının doğum yılını giriniz: ");
		dogumyili = input_d.nextInt();
		
		HeartRate k1 = new HeartRate(ad,soyad,dogumyili);
		k1.show();
		
		
	}

}
