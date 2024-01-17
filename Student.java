
public class Student extends User {
	

	String studentLevel;

	public String getStudentLevel() {
		return studentLevel;
	}

	public void setStudentLevel(String studentLevel) {
		this.studentLevel = studentLevel;
	}

	public void logIn(String message) {
		System.out.println(" Öğrenci Girişi Yapıldı: " + message);
	}
		
	}


