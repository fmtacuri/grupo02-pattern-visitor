package com.grupo02;

import com.grupo02.visitor.Commander;
import com.grupo02.visitor.CommanderVisitor;
import com.grupo02.visitor.Sergeant;
import com.grupo02.visitor.SergeantVisitor;
import com.grupo02.visitor.Soldier;
import com.grupo02.visitor.SoldierVisitor;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log4j2
public class Grupo02Application {

  public static void main(String[] args) {
    SpringApplication.run(Grupo02Application.class, args);
    log.info("-------------- Start visitor pattern --------------");
    Commander commander = new Commander("UPS",
        new Sergeant("MAURICIO", new Soldier("Freddy"), new Soldier("Cris"), new Soldier("Victor")),
        new Sergeant("RODOLFO", new Soldier("Fausto"), new Soldier("Klever")));
    commander.accept(new SoldierVisitor());
    commander.accept(new SergeantVisitor());
    commander.accept(new CommanderVisitor());
  }

}
