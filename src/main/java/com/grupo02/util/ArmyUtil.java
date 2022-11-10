package com.grupo02.util;

import com.grupo02.visitor.Commander;
import com.grupo02.visitor.Sergeant;
import com.grupo02.visitor.Soldier;

public class ArmyUtil {

  public static Commander getCommander() {
    return new Commander("UPS",
        new Sergeant("MAURICIO", new Soldier("Freddy"), new Soldier("Cris"), new Soldier("Victor")),
        new Sergeant("RODOLFO", new Soldier("Fausto"), new Soldier("Klever")));
  }
}
