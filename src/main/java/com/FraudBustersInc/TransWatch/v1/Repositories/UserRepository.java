package com.FraudBustersInc.TransWatch.v1.Repositories;

import com.FraudBustersInc.TransWatch.v1.Entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {
}
