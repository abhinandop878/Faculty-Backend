package com.nestDigital.facultyBackend.dao;

import com.nestDigital.facultyBackend.model.FacultyModel;
import org.springframework.data.repository.CrudRepository;

public interface FacultyDAO extends CrudRepository<FacultyModel,Integer> {
}
