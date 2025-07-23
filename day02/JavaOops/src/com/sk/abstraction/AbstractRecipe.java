package com.sk.abstraction;

public abstract class AbstractRecipe {

    public abstract void prepareIngredients();
    public abstract void cookRecipe();
    public abstract void cleanUp();

    public void execute(){
        prepareIngredients();
        cookRecipe();
        cleanUp();
    }
}
