package com.vikram.SportsStop.Service;

import com.vikram.SportsStop.Entity.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonService {
    public Person savePerson(Person person);
    public List<Person> getAllPerson();
}
