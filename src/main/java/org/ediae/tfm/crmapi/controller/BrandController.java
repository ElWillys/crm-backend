package org.ediae.tfm.crmapi.controller;

import org.ediae.tfm.crmapi.entity.Brand;
import org.ediae.tfm.crmapi.service.IBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/brand")
public class BrandController {

    @Autowired
    private IBrandService brandService;

    @PostMapping("/crearMarca")
    public ResponseEntity<Brand> createBrand(@RequestBody Brand brand) {
        return ResponseEntity.ok(brandService.createBrand(brand));
    }

    @GetMapping("/listarMarcas")
    public ResponseEntity<List<Brand>> findAllBrands() {
        return  ResponseEntity.ok(brandService.findAllBrands());
    }

    @GetMapping("/marca/{nombre}")
    public ResponseEntity<Optional<Brand>> findBrandByName(@RequestParam String name) {
        return  ResponseEntity.ok(brandService.findByName(name));
    }

    @PutMapping("/actualizarMarca")
    public ResponseEntity<Brand> updateBrand(@PathVariable Long id, @RequestBody Brand brand) {
        brandService.updateBrand(brand);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/eliminarMarca/{id}")
    public ResponseEntity<Boolean> deleteBrandById(@PathVariable Long id) {
        return ResponseEntity.ok(brandService.deleteBrandById(id));
    }
}
