package org.jsp.boot_jsp.repository;

import org.jsp.boot_jsp.dto.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyRepository extends JpaRepository<Student, Integer> {

}
