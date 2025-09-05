package corporation.valve.apisteam.Enterprises;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EnterpriseService {

    private EnterpriseRepository enterpriseRepository;
    private EnterpriseMapper enterpriseMapper;


    public EnterpriseService(EnterpriseRepository enterpriseRepository , EnterpriseMapper enterpriseMapper){
        this.enterpriseRepository = enterpriseRepository;
        this.enterpriseMapper = enterpriseMapper;
    }


    public List<EnterpriseDTO> list(){
        List<EnterpriseModel> model = enterpriseRepository.findAll();
        return model.stream().map(enterpriseMapper::map).collect(Collectors.toList());
    }

    //Search
    public EnterpriseDTO listById(Long id){
        EnterpriseModel enterprise = enterpriseRepository.findById(id).orElseThrow(RuntimeException::new);
        return enterpriseMapper.map(enterprise);
    }

    //Create
    public EnterpriseDTO register(EnterpriseDTO enterpriseDTO){
        EnterpriseModel enterprise = enterpriseMapper.map(enterpriseDTO);
        enterprise = enterpriseRepository.save(enterprise);
        return enterpriseMapper.map(enterprise);
    }

//Delete
    public void delete(Long id){
        enterpriseRepository.deleteById(id);
    }

    public EnterpriseDTO alter(Long id, EnterpriseDTO dto){
        Optional<EnterpriseModel> empresaExiste =  enterpriseRepository.findById(id);
        if(empresaExiste.isPresent()){
            EnterpriseModel empresa = enterpriseMapper.map(dto);
            empresa = enterpriseRepository.save(empresa);
            return enterpriseMapper.map(empresa);
        }

        return null;
    }
}
