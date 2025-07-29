package com.sk.services;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService {
    @Override
    public List<String> retrieveAllTodosForGivenUser(String username) {
        return Arrays.asList(
                "Spring in Java",
                "SpringBoot - Production ready Apps!",
                "Learn how to dance",
                "The Power of Spring!");
    }
}
