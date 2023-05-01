package karenAssignment4;

public class Student implements Comparable<Student> {
	private Integer studentID;
	private String name;
	private String courseName;
	private Integer grade;

	public Student(Integer studentID, String name, String courseName, Integer grade) {
		super();
		this.studentID = studentID;
		this.name = name;
		this.courseName = courseName;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return studentID + "," + name + "," + courseName + "," + grade;
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(Integer studentID) {
		this.studentID = studentID;
	}
	
//	@Override
//	
//	public String toString() {
//		return "Student [studentID=" + studentID + ", name=" + name + ", courseName=" + courseName + ", grade=" + grade
//				+ "]";
//	}


	@Override
	public int compareTo(Student that) {

		if (that == null) {
			return 1;
		

		}
		if (this.grade > that.grade) {
			return -1;

		} else if (this.grade < that.grade) {
			return 1;
			
		} else if (this.grade == that.grade) {
			return 0;
		}
		return this.grade;

	}
}
