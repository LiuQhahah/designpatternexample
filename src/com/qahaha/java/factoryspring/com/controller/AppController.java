package com.controller;
import factory.PetFactorySpring;
import factory.PetSpring;

@RestController
@RequestMapping("/")
public class AppController {

    @Autowired
    private PetFactorySpring petFactorySpring;
    @GetMapping
    public String getDefault(){
        return "{\"message\": \"Hello World\"}";
    }

    @PostMapping("adoptPet/{type}/{name}")
    public PetSpring adoptPet(@PathVariable String type, @PathVariable String name){
        PetSpring pet = this.petFactorySpring.createPet(type);
        pet.setName(name);
        pet.feed();
        return pet;
    }
}
