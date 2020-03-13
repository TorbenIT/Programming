package university.people;

public class Student {

	private int alter;
	private String nachname;
	public Student next;
	public Student prev;
	
	public Student(int alter, String nachname) {
		this.alter = alter;
		this.nachname = nachname;
	}
	
	public int getAlter() {
		return alter;
	}
	public String getNachname() {
		return nachname;
	}
	
	public void setAlter(int alter) {
		this.alter = alter;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	
	public Student getNext() {
		return next;
	}
	public Student getPrev() {
		return prev;
	}
	public void setNext(Student next) {
		this.next = next;
	}
	public void setPrev(Student prev) {
		this.prev = prev;
	}
}
