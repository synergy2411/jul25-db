package com.sk.services;

import java.util.List;

public interface TodoService {
    List<String> retrieveAllTodosForGivenUser(String username);
}
