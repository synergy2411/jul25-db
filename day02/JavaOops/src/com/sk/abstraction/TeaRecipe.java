package com.sk.abstraction;

public class TeaRecipe extends AbstractRecipe{
    @Override
    public void prepareIngredients() {
        System.out.println("Tea Leafs | Water | Ginger");
    }

    @Override
    public void cookRecipe() {
        System.out.println("Boil the water on stove and add Tea leafs.");
    }

    @Override
    public void cleanUp() {
        System.out.println("Clean all utensils.");
    }
}
