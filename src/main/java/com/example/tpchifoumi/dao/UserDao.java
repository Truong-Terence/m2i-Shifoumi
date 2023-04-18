package com.example.tpchifoumi.dao;

import com.example.tpchifoumi.model.User;

public interface UserDao extends GenericDao<User, Long> {

    User findByUsername(String username);
}