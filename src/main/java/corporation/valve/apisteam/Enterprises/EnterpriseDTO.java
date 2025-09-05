package corporation.valve.apisteam.Enterprises;

import corporation.valve.apisteam.Games.GamesModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnterpriseDTO {

    private Long id;
    private String name;
    private String cnpj;
    private String email;
    private int year;
    private String telefone;
    private List<GamesModel> gamesModel;


}
