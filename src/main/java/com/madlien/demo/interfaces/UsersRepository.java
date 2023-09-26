package com.madlien.demo.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.madlien.demo.entities.Users;

@Repository

public interface UsersRepository extends JpaRepository<Users, Long>  {

	

}
