package ru.sidorov.spring.PP3_1_1_SpringBoot.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sidorov.spring.PP3_1_1_SpringBoot.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
