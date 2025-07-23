package com.sk.abstraction;

public class AbstractRecipeRunner {
    public static void main(String[] args) {

//        TeaRecipe tea = new TeaRecipe();
//        tea.execute();
//
//        CoffeeRecipe coffee = new CoffeeRecipe();
//        coffee.execute();

//        AbstractRecipe recipe = new TeaRecipe();
        AbstractRecipe recipe = new CoffeeRecipe();
        recipe.execute();
    }
}
