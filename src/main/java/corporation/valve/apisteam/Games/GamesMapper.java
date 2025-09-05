package corporation.valve.apisteam.Games;

import org.springframework.stereotype.Component;

@Component
public class GamesMapper {

    public GamesModel map(GamesDTO gamesDTO){
        GamesModel gamesModel = new GamesModel();

        gamesModel.setId(gamesDTO.getId());
        gamesModel.setDescription(gamesDTO.getDescription());
        gamesModel.setName(gamesModel.getName());
        gamesModel.setEnterprise(gamesModel.getEnterprise());
        gamesModel.setImage(gamesModel.getImage());
        gamesModel.setIndicative(gamesModel.getIndicative());
        gamesModel.setPlayers(gamesModel.getPlayers());
        gamesModel.setRequisistos(gamesModel.getRequisistos());
        gamesModel.setYear(gamesModel.getYear());

        return gamesModel;
    }

    public GamesDTO map(GamesModel gamesModel){
        GamesDTO gamesDTO = new GamesDTO();

        gamesDTO.setDescription(gamesDTO.getDescription());
        gamesDTO.setEnterprise(gamesDTO.getEnterprise());
        gamesDTO.setName(gamesDTO.getName());
        gamesDTO.setPlayers(gamesDTO.getPlayers());
        gamesDTO.setIndicative(gamesDTO.getIndicative());
        gamesDTO.setYear(gamesDTO.getYear());
        gamesDTO.setId(gamesDTO.getId());
        gamesDTO.setImage(gamesDTO.getImage());
        gamesDTO.setRequisistos(gamesDTO.getRequisistos());

        return gamesDTO;
    }

}
