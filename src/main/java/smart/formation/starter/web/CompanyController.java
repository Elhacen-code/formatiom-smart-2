package smart.formation.starter.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import smart.formation.starter.entity.Company;
import smart.formation.starter.service.CompanyService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/companies")
public class CompanyController {

    @Autowired
    private CompanyService service;
    
    @PostMapping("/create")
    public ResponseEntity<Object> createCompany(@RequestBody Company company){
            return service.createCompany(company);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Object> updateCompany(@RequestBody Company company, @PathVariable Long id){
            return service.updateCompany(company, id);
    }

    @GetMapping
    public ResponseEntity<Object> getCompanies(){
        return service.getCompanies();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Object> deleteCompany(@PathVariable Long id){
            return service.deleteCompany(id);
    }

    @GetMapping("/name")
    public ResponseEntity<Object> findComapnyByName(@RequestParam String name){
        return service.findComapnyByName(name);

    }

    @GetMapping("/{id}/servers")
    public ResponseEntity<Object> getServers(@PathVariable Long id) {
        return service.getServers(id);
    }
    
}
