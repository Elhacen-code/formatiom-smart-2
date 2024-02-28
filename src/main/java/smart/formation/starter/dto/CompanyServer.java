package smart.formation.starter.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import smart.formation.starter.entity.Server;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompanyServer {
    
    private List<Server> servers;
    private int total;
}
