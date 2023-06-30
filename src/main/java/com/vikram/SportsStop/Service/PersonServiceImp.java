package com.vikram.SportsStop.Service;

import com.vikram.SportsStop.Entity.Person;
import com.vikram.SportsStop.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImp implements PersonService{
    @Autowired
    private PersonRepository personRepository;
    @Override
    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public List<Person> getAllPerson() {
        return personRepository.findAll();
    }
}
