package Case_Study.Services;

import Case_Study.Models.Person.Employee;

import java.util.List;

public interface IEmployeeService extends IService {
    List findAll();

    void addNewEmployee();

    void upDateEmployee(String employeeID);

    Employee enterEmployeeInfo();

    boolean validateDateOfBirth(String dateOfBirth);

    boolean validateAge(String dateOfBirth);
}
