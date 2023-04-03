package com.cosmin.app.realestateapi.Repo;

import com.cosmin.app.realestateapi.Models.Properties;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertiesRepo extends JpaRepository<Properties, Long> {
}
