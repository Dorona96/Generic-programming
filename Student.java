package Q1;
/*
 * BY: Doron Sharaby
 * ID: 204862197
 * DATE: 15/5/2021
 * 
 * The Student class will contain a name, ID no. And score
 *Between 0 and 100. The comparison between students will be made according to the grade.
 * */
public class Student implements Comparable{
	private String name;
	private int ID;
	private int grade;


	public Student(String name, int ID, int grade) {
		this.name = name;
		this.ID = ID;
		this.grade = grade;
	}

	//set and get functions.

	public String getName() {	return name;	}
	public int getID() {	return ID;	}
	public int getGrade() {	return grade;	}
	public void setName(String name) {	this.name = name; }
	public void setID(int ID) {	this.ID= ID;	}
	public void setGrade(int grade) {	this.grade = grade; }



	// Student compare by Grade.

	@Override
	public int compareTo(Object o) {
		if(!(o instanceof Student))
			throw new ClassCastException();
		if (o==null)
			throw new NullPointerException();
		Student s = (Student)o; 
		return (this.getGrade()-s.getGrade());
	}

	@Override
	public boolean equals(Object o) {
		if(o instanceof Student) {
			if(((Student) o).getGrade()== this.grade && ((Student) o).getID()==this.ID &&
					((Student) o).getName()== this.name)
				return true;
		}
		return super.equals(o);
	}

	@Override
	public String toString() {
		return "name: "+name+", ID: "+ID+", grade: "+grade;
	}


}
