package corporation.valve.apisteam.Enterprises;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping("/enterprises")
@RestController
public class EnterprisesController {

    private EnterpriseService enterprisesService;

    public EnterprisesController(EnterpriseService enterprisesService){
        this.enterprisesService = enterprisesService;
    }

    @GetMapping("/list")
    public List<EnterprisesModel> list(){
        return enterprisesService.listAll();
    }

    @GetMapping("/list/{id}")
    public EnterprisesModel listById(@PathVariable Long id){
        return enterprisesService.listById(id);
    }

    @PostMapping("/register")
    public EnterprisesModel register(@RequestBody EnterprisesModel enterprisesModel){
        return enterprisesService.register(enterprisesModel);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        enterprisesService.delete(id);
    }
}
