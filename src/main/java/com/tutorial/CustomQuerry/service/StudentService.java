package com.tutorial.CustomQuerry.service;

import com.tutorial.CustomQuerry.dao.StudentRepository;
import com.tutorial.CustomQuerry.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository repository;
    public Student get(String firstName){
        return repository.findByFirstName(firstName).get(0);
    }
   public List<Student> getByFL(String firstName, String lastName){
        return repository.findByFirstNameAndLastName(firstName,lastName);
   }
    public int count(String Name){
        return repository.count(Name);
    }

    public List<Student> getAll(){
        return repository.findAll();
    }

    public void delete(String Name){
        repository.deleteStudent(Name);
    }

    public List<Student> sort(){
        return repository.findByOrderByFirstNameAsc();
    }

    public List<Student> sortByLimit(){
        return repository.sortLimit();}

    public List<Student> getage(int Start, int End){
        return repository.findByAgeBetween(Start,End);}
}

