
public class Student {
	private String ad;
	private String soyad;
	private int ortalama;
	
	Student(String ad, String soyad, int ortalama){
		this.ad = ad;
		this.soyad = soyad;
		this.ortalama = ortalama;
	}
	
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public int getOrtalama() {
		return ortalama;
	}
	public void setOrtalama(int ortalama) {
		this.ortalama = ortalama;
	}
	
	public String getHarfNotu() {
		if(ortalama >= 90) return "AA";
		else if(ortalama >= 85 ) return "BA";
		else if(ortalama >= 80) return "BB";
		else if(ortalama >= 75) return "CB";
		else if(ortalama >= 65) return "CC";
		else if(ortalama >= 60) return "DC";
		else if(ortalama >= 55) return "DD";
		else if(ortalama >= 50) return "FD";
		else return "FF";
	}
	
	public void show() {
		System.out.println("\nÖğrenci Bilgileri: ");
		System.out.println("Ad: " + ad);
		System.out.println("Soyad: "+ soyad);
		System.out.println("Ders ortalaması: " + ortalama);
		System.out.println("Harf Notu: " + this.getHarfNotu() );
	}
	
	
}
