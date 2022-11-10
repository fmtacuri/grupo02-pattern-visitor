package com.grupo02.repository;

import com.grupo02.domain.ArmyJpa;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ArmyJpaRepository extends JpaRepository<ArmyJpa, Long> {

  @Override
  Optional<ArmyJpa> findById(Long id);

  @Query("SELECT army FROM ArmyJpa army")
  Optional<List<ArmyJpa>> findAllArmys();
}
