package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {

    private EmployeeDao employeeDao;
    private CompanyDao companyDao;

    @Autowired
    public Facade(EmployeeDao employeeDao, CompanyDao companyDao) {
        this.employeeDao = employeeDao;
        this.companyDao = companyDao;
    }

    public List<Company> findCompaniesWithPartialName(String partname) {
        partname = "%" + partname + "%";
        return companyDao.retrieveCompaniesWithPartialName(partname);
    }

    public List<Employee> findEmployeesWithPartialName(String partname) {
        partname = "%" + partname + "%";
        return employeeDao.retrieveEmployeesWithPartialName(partname);
    }
}
