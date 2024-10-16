
public class Account {
	private String name;
	private String surname;
	private int bakiye;
	
	Account(String name, String surname, int bakiye){
		this.name = name;
		this.surname = surname;
		if(bakiye < 0) 
			System.out.println("Bakiye sifir olamaz.");
		else 
			this.bakiye = bakiye;
			
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public int getBakiye() {
		return bakiye;
	}
	
	public void depositMoney(int para) {
		bakiye = bakiye + para;
		
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
}


