package corporation.valve.apisteam.Enterprises;

import org.springframework.stereotype.Component;

@Component
public class EnterpriseMapper {

    public EnterpriseModel map(EnterpriseDTO enterpriseDTO){
        EnterpriseModel enterpriseModel = new EnterpriseModel();

        enterpriseModel.setId(enterpriseDTO.getId());
        enterpriseModel.setName(enterpriseModel.getName());
        enterpriseModel.setTelefone(enterpriseDTO.getTelefone());
        enterpriseModel.setCnpj(enterpriseDTO.getCnpj());
        enterpriseModel.setEmail(enterpriseDTO.getEmail());
        enterpriseModel.setYear(enterpriseDTO.getYear());
        enterpriseModel.setGamesModel(enterpriseDTO.getGamesModel());

        return enterpriseModel;
    }


    public EnterpriseDTO map(EnterpriseModel enterpriseModel){
        EnterpriseDTO enterpriseDto = new EnterpriseDTO();

        enterpriseDto.setId(enterpriseModel.getId());
        enterpriseDto.setGamesModel(enterpriseModel.getGamesModel());
        enterpriseDto.setCnpj(enterpriseDto.getCnpj());
        enterpriseDto.setEmail(enterpriseDto.getEmail());
        enterpriseDto.setName(enterpriseDto.getName());
        enterpriseDto.setTelefone(enterpriseDto.getTelefone());
        enterpriseDto.setYear(enterpriseModel.getYear());

        return enterpriseDto;
    }
}
