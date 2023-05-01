package karenAssignment4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileService {
	String fileName = "studentmasterlist.csv";
	String line;

	public Student[] getStudentsFromFile() {

		BufferedReader fileReader = null;
		Student[] students = new Student[100];
		int counter = 0;

		try {

			String line = null;
			fileReader = new BufferedReader(new FileReader("studentmasterlist.csv"));

			fileReader.readLine();
			while ((line = fileReader.readLine()) != null) {
				String[] lineData = line.split(",");

				int studentID = Integer.parseInt(lineData[0]);
				String name = lineData[1];
				String courseName = lineData[2];
				int grade = Integer.parseInt(lineData[3]);

				Student student = new Student(studentID, name, courseName, grade);
				students[counter] = student;
				counter ++;

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}

//		FullList [] students = null;

		return students;
	}

	{

	}
}
