package com.coderscampus.assignment9.service;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.coderscampus.assignment9.Assignment9.Recipe;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

@Service
public class FileService {
	public List<Recipe> getAllRecipes() throws IOException, CsvException {
		List<Recipe> recipes = new ArrayList<>();
		Reader in = new FileReader("recipes.txt");
		com.opencsv.CSVParser parser = new CSVParserBuilder().withQuoteChar('"').build();
		CSVReader csvReader = new CSVReaderBuilder(in).withCSVParser(parser).withSkipLines(1).build();
		List<String[]> records = csvReader.readAll();
		for (String[] record : records) {
			Recipe recipe = new Recipe();

			recipe.setCookingMinutes(Integer.parseInt(record[0].trim()));
			recipe.setDairyFree(Boolean.parseBoolean(record[1].trim()));
			recipe.setGlutenFree(Boolean.parseBoolean(record[2].trim()));
			recipe.setInstructions(record[3].trim());
			recipe.setPreparationMinutes(Double.parseDouble(record[4].trim()));
			recipe.setPricePerServing(Double.parseDouble(record[5].trim()));
			recipe.setReadyInMinutes(Integer.parseInt(record[6].trim()));
			recipe.setServings(Integer.parseInt(record[7].trim()));
			recipe.setSpoonacularScore(Double.parseDouble(record[8].trim()));
			recipe.setTitle(record[9].trim());
			recipe.setVegan(Boolean.parseBoolean(record[10].trim()));
			recipe.setVegetarian(Boolean.parseBoolean(record[11].trim()));


				recipes.add(recipe);
			}
			csvReader.close();

			return recipes;
		}
	

	public List<Recipe> getGlutenFreeRecipes() throws IOException, CsvException {
		List<Recipe> allRecipes = getAllRecipes();
		List<Recipe> glutenFreeRecipes = new ArrayList<>();
		for (Recipe recipe : allRecipes) {
			if (recipe.getGlutenFree()) {
				glutenFreeRecipes.add(recipe);
			}
		}
		return glutenFreeRecipes;
	}

	public List<Recipe> getVeganRecipes() throws IOException, CsvException {
		List<Recipe> allRecipes = getAllRecipes();
		List<Recipe> veganRecipes = new ArrayList<>();
		for (Recipe recipe : allRecipes) {
			if (recipe.getVegan()) {
				veganRecipes.add(recipe);
			}
		}
		return veganRecipes;
	}

	public List<Recipe> getVeganAndGlutenFreeRecipes() throws IOException, CsvException {
	    List<Recipe> recipes = new ArrayList<>();
	    for (Recipe recipe : getAllRecipes()) {
	        if (recipe.getVegan() && recipe.getGlutenFree()) {
	            recipes.add(recipe);
	        }
	    }
	    return recipes;
	}

	public List<Recipe> getVegetarianRecipes() throws IOException, CsvException {
		List<Recipe> allRecipes = getAllRecipes();
		List<Recipe> vegetarianRecipes = new ArrayList<>();
		for (Recipe recipe : allRecipes) {
			if (recipe.getVegetarian()) {
				vegetarianRecipes.add(recipe);
			}
		}
		return vegetarianRecipes;
	}

}
