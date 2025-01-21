package com.tekarch.flights.TafUserService.Service.Interface;


import com.tekarch.flights.TafUserService.Model.User;

import java.util.List;

public interface UserService {

    User createUser(User user);

    User getUserById(Long id);

    List<User> getAllUsers();

    User updateUser(Long id, User user);

    void deleteUser(Long id);
}
