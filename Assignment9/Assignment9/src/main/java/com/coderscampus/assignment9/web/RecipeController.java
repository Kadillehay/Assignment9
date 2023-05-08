package com.coderscampus.assignment9.web;

import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.coderscampus.assignment9.Assignment9.Recipe;
import com.coderscampus.assignment9.service.FileService;
import com.opencsv.exceptions.CsvException;

@RestController
@RequestMapping
public class RecipeController {

	@Autowired
	private FileService fileService;

	@GetMapping("/gluten-free")
	public List<Recipe> getGlutenFreeRecipes() throws IOException, CsvException {
		return fileService.getGlutenFreeRecipes();

	}

	@GetMapping("/vegan")
	public List<Recipe> getVeganRecipes() throws IOException, CsvException {
		return fileService.getVeganRecipes();
	}

	@GetMapping("/vegan-and-gluten-free")
	public List<Recipe> getVeganAndGlutenFreeRecipes() throws IOException, CsvException {
		return fileService.getVeganAndGlutenFreeRecipes();
	}

	@GetMapping("/vegetarian")
	public List<Recipe> getVegetarianRecipes() throws IOException, CsvException {
		return fileService.getVegetarianRecipes();
	}

	@GetMapping("/all-Recipes")
	public List<Recipe> getAllRecipes() throws IOException, CsvException {
		return fileService.getAllRecipes();
	}
}
