package corporation.valve.apisteam.Players;

import org.springframework.stereotype.Component;

@Component
public class PlayersMapper {

    public PlayersModel map(PlayersDTO dto){
        PlayersModel model = new PlayersModel();

        model.setId(dto.getId());
        model.setAge(dto.getAge());
        model.setName(dto.getName());
        model.setCpf(dto.getCpf());
        model.setDescription(dto.getDescription());
        model.setGames(dto.getGames());
        model.setPhone(dto.getPhone());
        return model;
    }

    public PlayersDTO map(PlayersModel model){
        PlayersDTO dto = new PlayersDTO();
        dto.setAge(model.getAge());
        dto.setCpf(model.getCpf());
        dto.setName(model.getName());
        dto.setDescription(model.getDescription());
        dto.setGames(model.getGames());
        dto.setPhone(model.getPhone());
        dto.setId(model.getId());

        return dto;
    }
}
