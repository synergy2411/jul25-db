package com.sk.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

public class TodoBusinessImplTest {

    @Test
    public void retrieveFilteredTodosTests_WithMock2() {
//        GIVEN
        TodoService mockTodoService = Mockito.mock(TodoService.class);

//        WHEN
        when(mockTodoService.retrieveAllTodosForGivenUser("Monica"))
                .thenReturn(Arrays.asList("Spring in Java", "The Power of Spring", "Love SpringBoot"));

//        THEN
        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(mockTodoService);
        List<String> filteredTodos = todoBusiness.retrieveFilteredTodos();
        int expectedLength = 3;
        Assertions.assertEquals(expectedLength, filteredTodos.size());

    }

    @Test
    public void retrieveFilteredTodosTests_WithMock1() {
        TodoService mockTodoService = Mockito.mock(TodoService.class);

        when(mockTodoService.retrieveAllTodosForGivenUser("Monica"))
                .thenReturn(Arrays.asList("Spring in Java", "The Power of Spring", "Learn to dance"));

        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(mockTodoService);
        List<String> filteredTodos = todoBusiness.retrieveFilteredTodos();
        int expectedLength = 2;
        Assertions.assertEquals(expectedLength, filteredTodos.size());

    }

    @Test
    public void retrieveFilteredTodosTests_WithStub() {
        TodoServiceStub stub = new TodoServiceStub();
        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(stub);
        List<String> filteredTodos = todoBusiness.retrieveFilteredTodos();
        int expectedLength = 3;
        Assertions.assertEquals(expectedLength, filteredTodos.size());
    }
}
