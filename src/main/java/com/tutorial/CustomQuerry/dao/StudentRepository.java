package com.tutorial.CustomQuerry.dao;

import com.tutorial.CustomQuerry.model.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface StudentRepository extends JpaRepository<Student,Integer> {
public List<Student> findByFirstName(String firstName);
public List<Student> findByOrderByFirstNameAsc();

public List<Student> findByAgeBetween(int start, int end);
List<Student> findByFirstNameAndLastName(String firstName, String LastName);

@Query("select count(u) from Student u where u.firstName=:Name")
public int count(@Param("Name") String Name);


@Query("select u from Student u order by u.firstName limit 2")
public List<Student> sortLimit();

@Modifying
@Query("delete from Student u where u.firstName=:firstName")
public void deleteStudent(@Param("firstName") String firstName);


public


}


