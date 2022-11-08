package com.grupo02.visitor;

import lombok.Getter;
import lombok.Setter;

public class Sergeant extends Unit {

  @Getter
  @Setter
  String name;

  public Sergeant(String name, Unit... children) {
    super(children);
    this.name = name;
  }

  @Override
  public void accept(UnitVisitor visitor) {
    visitor.visit(this);
    super.accept(visitor);
  }

  @Override
  public String toString() {
    return this.name;
  }
}
