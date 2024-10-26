package ru.sidorov.spring.PP3_1_1_SpringBoot.dao;


import ru.sidorov.spring.PP3_1_1_SpringBoot.model.User;

import java.util.List;

public interface UserDao {
    List<User> getUsersList();
    User getUser(int id);
    void addUser(User user);
    void deleteUser(int id);
    void editUser(User user);
}
