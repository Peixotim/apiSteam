package corporation.valve.apisteam.Enterprises;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping("/enterprises")
@RestController
public class EnterpriseController {

    private EnterpriseService enterprisesService;

    public EnterpriseController(EnterpriseService enterprisesService){
        this.enterprisesService = enterprisesService;
    }


    @GetMapping("/list")
    public List<EnterpriseDTO> list(){
        return enterprisesService.list();
    }

    @GetMapping("/list/{id}")
    public EnterpriseDTO listById(@PathVariable Long id){
        return enterprisesService.listById(id);
    }

    @PostMapping("/register")
    public EnterpriseDTO register(@RequestBody EnterpriseDTO enterpriseDTO){
        return enterprisesService.register(enterpriseDTO);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        enterprisesService.delete(id);
    }


    @PutMapping("/alter/id")
    public EnterpriseDTO alter(@PathVariable Long id , @RequestBody EnterpriseDTO dto){
        return enterprisesService.alter(id,dto);
    }
}
