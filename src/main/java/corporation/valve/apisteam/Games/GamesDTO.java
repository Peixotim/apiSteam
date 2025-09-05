package corporation.valve.apisteam.Games;

import corporation.valve.apisteam.Enterprises.EnterpriseModel;
import corporation.valve.apisteam.Players.PlayersModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GamesDTO {

    private Long id;
    private String name;
    private String description;
    private int year;
    private String image;
    private int indicative;
    private String requisistos;
    private EnterpriseModel enterprise;
    private List<PlayersModel> players;

}
