
public class HeartRate {
	String ad;
	String soyad;
	int dogumyili;
	int yas;
	
	HeartRate(String ad, String soyad, int dogumyili){
		this.ad = ad;
		this.soyad = soyad;
		this.dogumyili = dogumyili;
		this.yas = 2024 - dogumyili;
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
	public int getDogumyili() {
		return dogumyili;
	}
	public void setDogumyili(int dogumyili) {
		this.dogumyili = dogumyili;
	}
	
	public int maxHeartrate(){
		return (220 - yas);	
	}
	
	public double targetHeartrate(){
		return ((220-yas) / 2.0) ;
	}
	
	public void show() {
		System.out.println("Bilgiler: ");
		System.out.println("Ad: " + ad );
		System.out.println("Soyad: "+ soyad);
		System.out.println("Yaş: " + yas);
		System.out.println("MHR Değeri:" + this.maxHeartrate());
		System.out.println("THR Değeri: " + this.targetHeartrate());
		
	}
	
	
	
	
}
