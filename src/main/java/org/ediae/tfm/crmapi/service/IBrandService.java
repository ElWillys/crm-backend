package org.ediae.tfm.crmapi.service;

import org.ediae.tfm.crmapi.entity.Brand;
import java.util.List;
import java.util.Optional;

public interface IBrandService {

    Brand createBrand(Brand brand);
    List<Brand> findAllBrands();
    Optional<Brand> findByName(String name);
    Brand updateBrand(Brand brand);
    boolean deleteBrandById(Long id);

}
