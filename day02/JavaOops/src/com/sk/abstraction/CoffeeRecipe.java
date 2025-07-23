package com.sk.abstraction;

public class CoffeeRecipe extends AbstractRecipe{
    @Override
    public void prepareIngredients() {
        System.out.println("Coffee Bean | Water | Honey");
    }

    @Override
    public void cookRecipe() {
        System.out.println("Put all ingredients in machine.");
    }

    @Override
    public void cleanUp() {
        System.out.println("Clean the machine.");
    }
}
