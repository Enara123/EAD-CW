package com.example.signinmicroservices.Data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    @Query("select e from Employee e where e.username=?1 and e.password=?2")
    Employee findEmployeeByUsernameAndPassword(String username,String password);
}
