package com.tinie.GetCatSubcat.repositories;

import com.tinie.GetCatSubcat.models.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepository extends JpaRepository<UserDetails, Long> {
}
