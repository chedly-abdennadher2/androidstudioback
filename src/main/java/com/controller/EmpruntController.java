package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Emprunt;
import com.repository.EmpruntRepository;

@RequestMapping("/emprunt")
@RestController
public class EmpruntController {
@Autowired 
EmpruntRepository repository;
@GetMapping("/emprunts") 
public List<Emprunt> emprunts (){
return repository.findAll();
}
@GetMapping("/{id}") 

public Emprunt emprunt(@PathVariable int id){
return repository.findById(id).get();
}
@PostMapping("/add") 
public Emprunt save(@RequestBody Emprunt emprunt){
repository.save(emprunt);
return emprunt;
}
@PostMapping("/delete") 
public Emprunt delete(@RequestBody Emprunt emprunt){
repository.delete(emprunt);
return emprunt;
}

}
