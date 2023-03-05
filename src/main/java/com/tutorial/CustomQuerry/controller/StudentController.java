package com.tutorial.CustomQuerry.controller;

import com.tutorial.CustomQuerry.model.Student;
import com.tutorial.CustomQuerry.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.json.*;

import javax.lang.model.element.Name;
import java.util.List;

@RestController
@RequestMapping("/student/")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/getStudent")
    public ResponseEntity<Student> getData(@RequestBody String Data){
        JSONObject obj = new JSONObject(Data);

        return new ResponseEntity<>(studentService.get(obj.getString("firstName")), HttpStatus.OK);
    }

    @GetMapping("/countByName/{Name}")
    public ResponseEntity<Integer> count(@PathVariable String Name){
        return new ResponseEntity<>(studentService.count(Name), HttpStatus.OK);
    }

    @GetMapping("/student")
    public ResponseEntity<List<Student>> get(){
        return new ResponseEntity<>(studentService.getAll(),HttpStatus.OK);
    }


    @DeleteMapping("/delete/{name}")
    public String delete(@PathVariable String name){
        studentService.delete(name);
        return "deleted";
    }

    @GetMapping("/sort")
    public List<Student> sort(){
        return studentService.sort();
    }

    @GetMapping("/sortlimit")
    public List<Student> sortLimit(){
        return studentService.sortByLimit();
    }
    @GetMapping("/getStudentfnl")
    public ResponseEntity<List<Student>> getflData(@RequestBody String Data){
        JSONObject obj = new JSONObject(Data);

        return new ResponseEntity<>(studentService.getByFL(obj.getString("firstName"), obj.getString("lastName")), HttpStatus.OK);
    }
    @GetMapping("/getStudentage/")
    public ResponseEntity<List<Student>> getage(@RequestBody String Data){
        JSONObject obj = new JSONObject(Data);

        return new ResponseEntity<>(studentService.getage((int)obj.get("start"), (int)obj.get("end")), HttpStatus.OK);
    }
}
