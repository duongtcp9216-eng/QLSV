
package com.phong.studentapp.repository;

import com.phong.studentapp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
