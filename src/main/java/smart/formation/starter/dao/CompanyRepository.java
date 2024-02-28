package smart.formation.starter.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import smart.formation.starter.entity.Company;


@Repository
public interface CompanyRepository extends JpaRepository<Company, Long>{
    public Company findByName(String name);

    
}