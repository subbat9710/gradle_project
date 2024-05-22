package com.tulasubba.gradleproject.repositories;

public class SQLConstant {
    private SQLConstant(){
        throw new IllegalStateException("SQL Query class");
    }

    public static final String FIND_USERNAME_BY_USERNAME = "SELECT u FROM user u WHERE u.username = :username";
}
