package com.zcj.tc.repository;

import org.hibernate.sql.Insert;
import org.springframework.data.jpa.repository.JpaRepository;
import com.zcj.tc.model.User;


public interface UserRepository extends JpaRepository<User, String> {

    User findUserByLoginName(String loginName);
}
