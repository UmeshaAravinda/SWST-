package com.kln.swst.simplerest.controller;

import com.kln.swst.simplerest.model.Student;
import com.kln.swst.simplerest.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
   StudentRepository studentRepository;

    @RequestMapping(method= RequestMethod.GET)
        public Iterable<Student> get() throws IllegalArgumentException{
            return studentRepository.findAll();
    }

    @RequestMapping(value = "/name{name}",method = RequestMethod.GET)
    public List<Student> get(@PathVariable String name)throws IllegalArgumentException{
        return studentRepository.findAllByName(name);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Student get(@PathVariable Long id)throws IllegalArgumentException{
        return studentRepository.findById(id).get();
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id)throws IllegalArgumentException{
        studentRepository.deleteById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Student save(@RequestBody Student student){
        return studentRepository.save(student);
    }

}

