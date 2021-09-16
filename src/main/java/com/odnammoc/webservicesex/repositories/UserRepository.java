package com.odnammoc.webservicesex.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.odnammoc.webservicesex.entites.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
