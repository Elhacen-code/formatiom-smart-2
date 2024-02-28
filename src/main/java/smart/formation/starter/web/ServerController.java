package smart.formation.starter.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import smart.formation.starter.entity.Server;
import smart.formation.starter.service.ServerService;

@RestController
@RequestMapping("/servers")
public class ServerController {
    
    @Autowired
    private ServerService service;
    
    @PostMapping("/create")
    public ResponseEntity<Object> createServer(@RequestBody Server server){
            return service.createServer(server);
    }

}
