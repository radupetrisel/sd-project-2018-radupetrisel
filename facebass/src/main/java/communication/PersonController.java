package communication;

import business.dtos.Person;
import business.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping(value = "/login")
    public boolean login(String email, String password) {
        return personService.login(email, password);
    }

    @GetMapping
    public Person get(@RequestParam(value = "email") String email){
        return personService.get(email);
    }

    @PostMapping(value = "/create")
    public boolean create(@RequestBody Person person) {
        System.out.println(person);
        return personService.register(person);
    }

}
