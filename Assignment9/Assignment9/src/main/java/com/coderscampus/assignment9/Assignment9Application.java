package com.coderscampus.assignment9;


import java.io.IOException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.opencsv.exceptions.CsvException;

@SpringBootApplication
public class Assignment9Application {

	public static void main(String[] args) throws IOException, CsvException {
		SpringApplication.run(Assignment9Application.class, args);


	}
}
