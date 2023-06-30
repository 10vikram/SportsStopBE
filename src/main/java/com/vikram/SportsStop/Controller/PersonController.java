package com.vikram.SportsStop.Controller;

import com.vikram.SportsStop.Entity.Person;
import com.vikram.SportsStop.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @PostMapping("/add")
    public String add(@RequestBody Person person){
        personService.savePerson(person);
        return "New Person is added";
    }
    @GetMapping("/getAllPerson")
    public List<Person> getAllPerson(){
        return personService.getAllPerson();
    }
}
