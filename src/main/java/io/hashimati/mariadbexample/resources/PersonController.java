package io.hashimati.mariadbexample.resources;


import io.micronaut.context.annotation.Parameter;
import io.micronaut.http.annotation.*;

import javax.inject.Inject;

import io.hashimati.mariadbexample.domains.Person;
import io.hashimati.mariadbexample.services.PersonService;


@Controller("/api/person")
public class PersonController {

    @Inject PersonService personService;

    @Post("/save")
    public Person save(Person person){

        //TODO insert your logic here!

        //saving Object
        return personService.save(person);
    }
    @Get("/get")
    public Person findById(@Parameter("id") long id){
        return personService.findById(id);
    }

    @Delete("/delete/{id}")
    public boolean deleteById(@PathVariable("id") long id){
        return  personService.deleteById(id);
    }
}