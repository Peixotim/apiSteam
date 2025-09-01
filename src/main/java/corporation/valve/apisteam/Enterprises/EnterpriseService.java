package corporation.valve.apisteam.Enterprises;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnterpriseService {

    private EnterpriseRepository enterpriseRepository;

    public EnterpriseService(EnterpriseRepository enterpriseRepository){
        this.enterpriseRepository = enterpriseRepository;
    }


    //Search
    public List<EnterprisesModel> listAll(){
        return enterpriseRepository.findAll();
    }

    //Search
    public EnterprisesModel listById(Long id){
        Optional<EnterprisesModel> conc = enterpriseRepository.findById(id);
        return conc.orElseThrow(RuntimeException::new);
    }

    //Create
    public EnterprisesModel register(EnterprisesModel enterprisesModel){
        return enterpriseRepository.save(enterprisesModel);
    }

    //Delete
    //Por id
    public void delete(Long id){
        enterpriseRepository.deleteById(id);
    }

}
