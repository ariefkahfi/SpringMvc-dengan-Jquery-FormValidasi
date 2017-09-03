package com.arief.mvc.dao;

import com.arief.mvc.domain.User;

import java.util.List;

/**
 * Created by Arief on 9/3/2017.
 */
public interface UserDAO {
    void save(User u);
    List<User> getAll();
    User getOne(int id);
}
