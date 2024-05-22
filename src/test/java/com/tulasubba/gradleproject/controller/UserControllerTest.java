package com.tulasubba.gradleproject.controller;

import com.tulasubba.gradleproject.entity.User;
import com.tulasubba.gradleproject.services.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserControllerTest {

    @Mock
    private UserService userService;

    @InjectMocks
    private UserController userController;

    @Test
    public void testGetAllUsers() {
        //Arrange
        User user1 = new User();
        user1.setUsername("John");

        User user2 = new User();
        user2.setUsername("Ram");

        List<User> userList = Arrays.asList(user1, user2);

        when(userService.getAllUsers()).thenReturn(userList);

        //Act
        List<User> result = userController.getAllUsers();

        //Assert
        assertEquals(userList.size(), result.size());
        assertEquals(userList.get(0).getUsername(), result.get(0).getUsername());
        assertEquals(userList.get(1).getUsername(), result.get(1).getUsername());
    }
}
