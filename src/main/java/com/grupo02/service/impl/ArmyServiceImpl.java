package com.grupo02.service.impl;

import com.grupo02.domain.ArmyJpa;
import com.grupo02.domain.ArmyJpa.ArmyJpaBuilder;
import com.grupo02.repository.ArmyJpaRepository;
import com.grupo02.service.ArmyService;
import com.grupo02.util.ArmyUtil;
import com.grupo02.visitor.Commander;
import com.grupo02.visitor.CommanderVisitor;
import com.grupo02.visitor.SergeantVisitor;
import com.grupo02.visitor.SoldierVisitor;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ArmyServiceImpl implements ArmyService {

  ArmyJpaRepository armyJpaRepository;

  @Override
  public void getGreetings(String army) {
    Commander commander = ArmyUtil.getCommander();
    ArmyJpaBuilder armyJpa = ArmyJpa.builder();
    switch (army) {
      case "soldier":
        commander.accept(new SoldierVisitor());
        break;
      case "sergeant":
        commander.accept(new SergeantVisitor());
        break;
      case "commander":
        commander.accept(new CommanderVisitor());
        break;
      default:
        throw new AssertionError();
    }

    armyJpa.greeting(army);
    armyJpaRepository.save(armyJpa.build());
  }
}
