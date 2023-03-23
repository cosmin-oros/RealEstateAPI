package com.cosmin.app.realestateapi.Repo;

import com.cosmin.app.realestateapi.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
