package com.javatechie.api.repository;

import com.javatechie.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUserId(int id);
}
