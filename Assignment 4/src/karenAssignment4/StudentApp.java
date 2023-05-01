package karenAssignment4;

import java.io.BufferedReader;

//import main.service.FileService;

public class StudentApp {

	public static void main(String[] args) {
		
		FileService fileService = new FileService();
		Student[] students = fileService.getStudentsFromFile();
		
		StudentService studentService = new StudentService();
		studentService.work(students);
		
			
		}

}

