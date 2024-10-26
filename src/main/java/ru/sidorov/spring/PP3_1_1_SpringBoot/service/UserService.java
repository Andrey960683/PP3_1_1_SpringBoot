package ru.sidorov.spring.PP3_1_1_SpringBoot.service;


import ru.sidorov.spring.PP3_1_1_SpringBoot.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsersList();
    User getUser(int id);
    void addUser(User user);
    void editUser(User user);
    void deleteUser(int id);

}
