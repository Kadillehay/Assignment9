package karenAssignment4;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import javax.print.attribute.standard.OutputDeviceAssigned;

public class StudentService {
	public void work(Student[] students) {

		Student[] compSci = new Student[34];
		Student[] statStudent = new Student[33];
		Student[] apMath = new Student[33];

		int scienceAdd = 0;
		int statAdd = 0;
		int mathAdd = 0;

		for (Student student : students) {
			if (student.getCourseName().contains("COMPSCI")) {

				compSci[scienceAdd] = student;
				scienceAdd++;
			}

			if (student.getCourseName().contains("STAT")) {

				statStudent[statAdd] = student;
				statAdd++;

			}
			if (student.getCourseName().contains("APMTH")) {
				apMath[mathAdd] = student;
				mathAdd++;

			}
		}

		if (statStudent != null) {
			Arrays.sort(statStudent);
		}
		if (apMath != null) {
			Arrays.sort(apMath);
		}
		if (compSci != null) {
			Arrays.sort(compSci);

		}
		for (Student q : compSci) {
			System.out.println(q);
		}
		for (Student r : statStudent) {
			System.out.println(r);
		}
		for (Student s : apMath) {
			System.out.println(s);
		}

		try (FileWriter fw = new FileWriter("course1.csv")) {
			fw.write("Student ID,Student name,course,grade");
			fw.write(System.lineSeparator());
			
			
			for (Student sCs : compSci) {
				if (sCs != null) {
					fw.write(sCs.toString());
					fw.write(System.lineSeparator());
				}
			}

		} catch (IOException e) {
			System.out.println("there was an error");
			e.printStackTrace();
		}
		try (FileWriter fw = new FileWriter("course2.csv")) {
			fw.write("Student ID,Student name,course,grade");
			fw.write(System.lineSeparator());
			
			for (Student sSs : statStudent) {
				if (sSs != null) {
					fw.write(sSs.toString());
					fw.write(System.lineSeparator());

				}
			}
		} catch (IOException e) {
			System.out.println("there was an error");
			e.printStackTrace();
		}
		try (FileWriter fw = new FileWriter("course3.csv")) {
			fw.write("Student ID,Student name,course,grade");
			fw.write(System.lineSeparator());
			
			for (Student saPm : apMath) {
				if (saPm != null) {
					fw.write(saPm.toString());
					fw.write(System.lineSeparator());
				}
			}
		} catch (IOException e) {
			System.out.println("there was an error");
			e.printStackTrace();

		}

	}
}
