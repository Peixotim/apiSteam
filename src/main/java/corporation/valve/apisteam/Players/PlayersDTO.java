package corporation.valve.apisteam.Players;

import corporation.valve.apisteam.Games.GamesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlayersDTO {
    private Long id;
    private String name;
    private String description;
    private String phone;
    private String cpf;
    private int age;
    private GamesModel games;
}
