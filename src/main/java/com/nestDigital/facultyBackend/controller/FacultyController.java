package com.nestDigital.facultyBackend.controller;

import com.nestDigital.facultyBackend.dao.FacultyDAO;
import com.nestDigital.facultyBackend.model.FacultyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FacultyController {
    @Autowired
    private FacultyDAO dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addFaculty",consumes = "application/json",produces = "application/json")
    public String addFaculty(@RequestBody FacultyModel faculties){
        dao.save(faculties);
        return "{status:'success'}";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewFaculty")
    public List<FacultyModel> viewFaculty(){
        return (List<FacultyModel>)dao.findAll();
    }
}
