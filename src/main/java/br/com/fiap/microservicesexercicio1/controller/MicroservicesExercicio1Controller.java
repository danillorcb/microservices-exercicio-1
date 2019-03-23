package br.com.fiap.microservicesexercicio1.controller;

import br.com.fiap.microservicesexercicio1.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MicroservicesExercicio1Controller {

    @GetMapping("/exemplo-1/{firstName}/{lastName}")
    public ResponseEntity getHello(@PathVariable(value="firstName", required=true) String firstName,
                                   @PathVariable(value="lastName") String lastName) {

        System.out.printf("Hello %s %s", firstName, lastName);

        log.info("Hello {} {}", firstName, lastName);

        return new ResponseEntity(HttpStatus.OK);

    }

    @GetMapping("/exemplo-1")
    public ResponseEntity<Person> getHelloPerson(Person person) {

        log.info("Hello {} {}", person.getFirstName(), person.getLastName());

        return new ResponseEntity<>(person, HttpStatus.OK);
    }
}
