package io.hashimati.mariadbexample.services;


import javax.inject.Inject;
import javax.inject.Singleton;
import javax.transaction.Transactional;
import io.hashimati.mariadbexample.domains.Person;
import io.hashimati.mariadbexample.repositories.PersonRepository;


@Singleton
@Transactional
public class PersonService {

    @Inject PersonRepository personRepository;

    public Person save(Person person){

        //TODO insert your logic here!
        //saving Object
        personRepository.save(person);
        return person;
    }

    public Person findById(long id){
        return personRepository.findById(id).orElse(null);
    }


    public boolean deleteById(long id){
        try{
            personRepository.deleteById(id);
             return true;
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            return false;
        }
    }

}