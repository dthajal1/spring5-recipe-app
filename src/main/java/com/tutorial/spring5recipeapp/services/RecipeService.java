package com.tutorial.spring5recipeapp.services;

import com.tutorial.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}