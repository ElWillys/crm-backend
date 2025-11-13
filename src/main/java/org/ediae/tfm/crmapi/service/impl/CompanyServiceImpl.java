package org.ediae.tfm.crmapi.service.impl;

import org.ediae.tfm.crmapi.entity.Company;
import org.ediae.tfm.crmapi.exception.GeneralException;
import org.ediae.tfm.crmapi.repository.CompanyRepository;
import org.ediae.tfm.crmapi.service.ICompanyService;
import org.ediae.tfm.crmapi.constant.GeneralConstants;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImpl implements ICompanyService {

    private final CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public Company createCompany(Company company) throws GeneralException {
        try {
            return companyRepository.save(company);
        } catch (Exception e) {
            throw new GeneralException(
                    GeneralConstants.COMPANY_CREATION_ERROR_CODE,
                    GeneralConstants.COMPANY_CREATION_ERROR_MESSAGE
            );
        }
    }

    @Override
    public List<Company> findAllCompanies() throws GeneralException {
        try {
            return companyRepository.findAll();
        } catch (Exception e) {
            throw new GeneralException(
                    GeneralConstants.GENERAL_ERROR_CODE,
                    GeneralConstants.GENERAL_ERROR_MESSAGE
            );
        }
    }

    @Override
    public Company findCompanyById(Long id) throws GeneralException {
        try {
            Optional<Company> optionalCompany = companyRepository.findById(id);
            if (optionalCompany.isPresent()) {
                return optionalCompany.get();
            } else {
                throw new GeneralException(
                        GeneralConstants.COMPANY_NOT_FOUND_ERROR_CODE,
                        GeneralConstants.COMPANY_NOT_FOUND_ERROR_MESSAGE
                );
            }
        } catch (GeneralException ex) {
            throw ex;
        } catch (Exception e) {
            throw new GeneralException(
                    GeneralConstants.GENERAL_ERROR_CODE,
                    GeneralConstants.GENERAL_ERROR_MESSAGE
            );
        }
    }

    @Override
    public Company findCompanyByName(String name) throws GeneralException {
        try {
            Optional<Company> optionalCompany = companyRepository.findByName(name);
            if (optionalCompany.isPresent()) {
                return optionalCompany.get();
            } else {
                throw new GeneralException(
                        GeneralConstants.COMPANY_NOT_FOUND_ERROR_CODE,
                        GeneralConstants.COMPANY_NOT_FOUND_ERROR_MESSAGE
                );
            }
        } catch (GeneralException ex) {
            throw ex;
        } catch (Exception e) {
            throw new GeneralException(
                    GeneralConstants.GENERAL_ERROR_CODE,
                    GeneralConstants.GENERAL_ERROR_MESSAGE
            );
        }
    }

    @Override
    public boolean deleteCompany(Long id) throws GeneralException {
        if (!companyRepository.existsById(id)) {
            throw new GeneralException(
                    GeneralConstants.COMPANY_NOT_FOUND_ERROR_CODE,
                    GeneralConstants.COMPANY_NOT_FOUND_ERROR_MESSAGE
            );
        }

        try {
            companyRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            throw new GeneralException(
                    GeneralConstants.COMPANY_DELETION_ERROR_CODE,
                    GeneralConstants.COMPANY_DELETION_ERROR_MESSAGE
            );
        }
    }
}
