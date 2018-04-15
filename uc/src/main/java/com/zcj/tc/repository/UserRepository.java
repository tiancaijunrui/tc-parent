package com.zcj.tc.repository;

import com.zcj.tc.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, String> {

    User findUserByLoginName(String loginName);
}
