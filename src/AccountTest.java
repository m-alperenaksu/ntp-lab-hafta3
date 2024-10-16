import java.util.Scanner;
public class AccountTest {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		Account k1 = new Account("Ahmet", "Mehmet",400);
		Account k2 = new Account("Hasan","Hüseyin",1000);
		
		System.out.println("Kullanıcılar ");
		System.out.println("1. Kullanıcı : " + k1.getName() + " " + k1.getSurname());
		System.out.println("Bakiye = " + k1.getBakiye());
		
		System.out.println("1. Kullanıcı : " + k2.getName() + " " + k2.getSurname());
		System.out.println("Bakiye = " + k2.getBakiye());
		
		System.out.println("1. kullanıcıya yüklemek istediğiniz para: ");
		int money = i.nextInt();
		k1.depositMoney(money);
		
		System.out.println("Kullanıcılar ");
		System.out.println("1. Kullanıcı : " + k1.getName() + " " + k1.getSurname());
		System.out.println("Bakiye = " + k1.getBakiye());
		
		System.out.println("1. Kullanıcı : " + k2.getName() + " " + k2.getSurname());
		System.out.println("Bakiye = " + k2.getBakiye());
		
	}

}
