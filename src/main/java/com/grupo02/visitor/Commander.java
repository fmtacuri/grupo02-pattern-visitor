package com.grupo02.visitor;

import lombok.Getter;
import lombok.Setter;

public class Commander extends Unit {

  @Getter
  @Setter
  String name;

  public Commander(String name, Unit... children) {
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
