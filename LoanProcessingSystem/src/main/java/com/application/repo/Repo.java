package com.application.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.application.entity.User;

import antlr.collections.List;
@Repository
public interface Repo extends JpaRepository<User,Integer> {

	java.util.List<User> findAll();
}