package com.grupo02.visitor;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class SoldierVisitor implements UnitVisitor {

  @Override
  public void visit(Soldier soldier) {
    log.info("Greetings soldier: {}", soldier);
  }

  @Override
  public void visit(Sergeant sergeant) {
    // Do nothing
  }

  @Override
  public void visit(Commander commander) {
    // Do nothing
  }
}
