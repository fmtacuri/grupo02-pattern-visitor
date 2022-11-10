package com.grupo02.service.impl;

import com.grupo02.service.ArmyService;
import com.grupo02.util.ArmyUtil;
import com.grupo02.visitor.Commander;
import com.grupo02.visitor.CommanderVisitor;
import com.grupo02.visitor.SergeantVisitor;
import com.grupo02.visitor.SoldierVisitor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class ArmyServiceImpl implements ArmyService {

  @Override
  public void getGreetings(String army) {
    Commander commander = ArmyUtil.getCommander();
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
  }
}
