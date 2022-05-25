package com.rd.employeemanager.repository;

import com.rd.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created at 25.03.2022.
 *
 * @author Ridvan Dogan
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}
