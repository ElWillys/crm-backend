package org.ediae.tfm.crmapi.service.impl;

import org.ediae.tfm.crmapi.entity.Brand;
import org.ediae.tfm.crmapi.service.IBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ediae.tfm.crmapi.repository.BrandRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BrandServiceImpl implements IBrandService {

    @Autowired
    private BrandRepository brandRepository;

    public Brand createBrand(Brand brand) {
        return brandRepository.save(brand);
    }
    public List<Brand> findAllBrands() {
        return brandRepository.findAll();
    }

    public Optional<Brand> findByName(String name) {
        return brandRepository.findByName(name);
    }

    public Brand updateBrand(Brand brand) {
        return brandRepository.save(brand);
    }
    public boolean deleteBrandById(Long id) {
        if (id != null && brandRepository.existsById(id)) {
            brandRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

}
