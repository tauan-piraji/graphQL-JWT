package org.jwt.graphQL.business.repositories;

import org.jwt.graphQL.models.entities.DbUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DbUserRepository extends JpaRepository<DbUser, Long> {
}