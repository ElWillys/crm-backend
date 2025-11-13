package org.ediae.tfm.crmapi.service;

import org.ediae.tfm.crmapi.entity.Brand;
import org.ediae.tfm.crmapi.entity.Company;
import org.ediae.tfm.crmapi.exception.GeneralException;

import java.util.List;
import java.util.Optional;

public interface ICompanyService {
    List<Company> findAllCompanies() throws GeneralException;
    Company findCompanyById(Long id) throws GeneralException;
    Company findCompanyByName(String name) throws GeneralException;
    Company createCompany(Company company) throws GeneralException;
    boolean deleteCompany(Long id) throws GeneralException;


}