package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class FacadeTestSuite {
    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private Facade facade;

    @Test
    void findEmployeesByNameFragmentTest() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee markSmith = new Employee("Mark", "Smith");

        employeeDao.save(johnSmith);
        employeeDao.save(markSmith);
        int johnSmithId = johnSmith.getId();
        int markSmithId = markSmith.getId();

        //When
        List<Employee> employees = facade.findEmployeesWithPartialName("mith");

        //Then
        assertEquals(2,employees.size());
        employeeDao.deleteById(johnSmithId);
        employeeDao.deleteById(markSmithId);
    }

    @Test
    void findCompaniesByNameFragmentTest() {
        //Given
        Company amazon = new Company("Amazon");
        Company microsoft = new Company("Microsoft");

        companyDao.save(amazon);
        companyDao.save(microsoft);
        int amazonId = amazon.getId();
        int microsoftId = microsoft.getId();

        // When
        List<Company> companies = facade.findCompaniesWithPartialName("amaz");
        //Then
        assertEquals(1,companies.size());
        companyDao.deleteById(amazonId);
        companyDao.deleteById(microsoftId);
    }
}