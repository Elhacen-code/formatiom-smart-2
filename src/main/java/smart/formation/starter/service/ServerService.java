package smart.formation.starter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import smart.formation.starter.dao.ServerRepository;
import smart.formation.starter.entity.Company;
import smart.formation.starter.entity.Server;

@Service
public class ServerService {
    
    @Autowired
    private ServerRepository serverRepository;

    public ResponseEntity<Object> createServer(Server server){
        try {
            serverRepository.save(server);

           return ResponseEntity.ok().body("Server created successfully");
        } catch (Exception e) {

            return ResponseEntity.internalServerError().build();
        } 
    } 

}
