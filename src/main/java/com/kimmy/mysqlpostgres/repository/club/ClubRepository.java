package com.kimmy.mysqlpostgres.repository.club;

import com.kimmy.mysqlpostgres.models.club.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClubRepository extends JpaRepository<Club, Integer> {
}
