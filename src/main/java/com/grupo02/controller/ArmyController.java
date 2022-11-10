package com.grupo02.controller;

import static org.springframework.http.HttpStatus.OK;

import com.grupo02.service.ArmyService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequestMapping("${main.rest.path.value}/army")
public class ArmyController {

  ArmyService armyService;

  @GetMapping("/{state}")
  ResponseEntity<Object> getVehicle(@PathVariable String state) {
    armyService.getGreetings(state);
    return new ResponseEntity<>(OK);
  }
}
