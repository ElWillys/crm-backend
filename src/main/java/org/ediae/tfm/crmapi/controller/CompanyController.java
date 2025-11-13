package org.ediae.tfm.crmapi.controller;

import org.ediae.tfm.crmapi.entity.Company;
import org.ediae.tfm.crmapi.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/empresa")
public class CompanyController {
    @Autowired
    private ICompanyService companyService;

  /*
  +++++++++ FUTURE DEVELOPMENT +++++++++++ for serverAdmin panel only !!

  @PostMapping("/crearEmpresa")
    public ModelMap createCompany(@RequestBody Company company) {
        try {
            return GeneralUtilsController.crearRespuestaModelMapOk(companyService.createCompany(company));
        } catch (Exception ex) {
            return GeneralUtilsController.crearRespuestaModelMapError(ex);
        }
    }

    @GetMapping("/listarEmpresas")
    public ModelMap findAllCompanys() {
        try {
            return GeneralUtilsController.crearRespuestaModelMapOk(companyService.findAllCompanies());
        } catch (Exception ex) {
            return GeneralUtilsController.crearRespuestaModelMapError(ex);
        }
    }

    @GetMapping("/empresa")
    public ModelMap findCompanyByName(@RequestParam String name) {
        try {
            return GeneralUtilsController.crearRespuestaModelMapOk(companyService.findCompanyByName(name));
        } catch (Exception ex) {
            return GeneralUtilsController.crearRespuestaModelMapError(ex);
        }
    }

    @GetMapping("/encontrarEmpresa/{id}")
    public ModelMap getById(@PathVariable Long id) {
        try {
            return GeneralUtilsController.crearRespuestaModelMapOk(companyService.findCompanyById(id));
        }catch (Exception ex) {
            return GeneralUtilsController.crearRespuestaModelMapError(ex);
        }
    }

    @DeleteMapping("/eliminarEmpresa/{id}")
    public ModelMap deleteCompanyById(@PathVariable Long id) {
        try {
            return GeneralUtilsController.crearRespuestaModelMapOk(companyService.deleteCompany(id));
        } catch (Exception ex) {
            return GeneralUtilsController.crearRespuestaModelMapError(ex);
        }
    }*/
}
