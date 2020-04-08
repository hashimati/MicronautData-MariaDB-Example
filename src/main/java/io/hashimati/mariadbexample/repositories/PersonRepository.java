package io.hashimati.mariadbexample.repositories;

import io.hashimati.mariadbexample.domains.Person;
import java.util.Optional;
import io.micronaut.data.annotation.*;
import io.micronaut.data.model.*;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
}