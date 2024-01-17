
public class Instructors extends User {
	String instructorsCode;

	public String getEgitmenKodu() {
		return instructorsCode;
	}
	
	public void logIn(String message) {
		System.out.println("Eğitmen Girişi Yapıldı " +message);
	}

	

}
