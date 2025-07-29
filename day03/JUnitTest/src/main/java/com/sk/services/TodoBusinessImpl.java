package com.sk.services;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class TodoBusinessImpl {
    private TodoService todoService;

    public TodoBusinessImpl(TodoService todoService) {
        this.todoService = todoService;
    }

    public List<String> retrieveFilteredTodos(){
        List<String> todoCollection = todoService.retrieveAllTodosForGivenUser("Monica");
        List<String> filteredTodos = new ArrayList<>();
        for(String todo : todoCollection){
            if(todo.contains("Spring")){
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }
}
