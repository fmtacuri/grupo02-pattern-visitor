package com.grupo02.visitor;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class SergeantVisitor implements UnitVisitor {

  @Override
  public void visit(Soldier soldier) {
    // Do nothing
  }

  @Override
  public void visit(Sergeant sergeant) {
    log.info("Hello sergeant: {}", sergeant);
  }

  @Override
  public void visit(Commander commander) {
    // Do nothing
  }
}
