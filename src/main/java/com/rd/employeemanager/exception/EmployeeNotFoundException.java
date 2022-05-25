package com.rd.employeemanager.exception;

/**
 * Created at 27.03.2022.
 *
 * @author Ridvan Dogan
 */
public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(String message) {
        super(message);
    }

    public EmployeeNotFoundException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
