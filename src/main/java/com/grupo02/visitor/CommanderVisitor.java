package com.grupo02.visitor;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class CommanderVisitor implements UnitVisitor {

  @Override
  public void visit(Soldier soldier) {
    // Do nothing
  }

  @Override
  public void visit(Sergeant sergeant) {
    // Do nothing
  }

  @Override
  public void visit(Commander commander) {
    log.info("Good to see you commander: {}", commander);
  }
}
