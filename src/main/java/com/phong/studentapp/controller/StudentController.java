
package com.phong.studentapp.controller;

import com.phong.studentapp.model.Student;
import com.phong.studentapp.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sinhvien")
@CrossOrigin
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Student> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Student create(@RequestBody Student s) {
        return service.save(s);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
