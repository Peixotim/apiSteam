package corporation.valve.apisteam.Players;

import com.fasterxml.jackson.annotation.JsonIgnore;
import corporation.valve.apisteam.Games.GamesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_players")

public class PlayersModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(unique = true)
    private String phone;

    @Column(unique =  true)
    private String cpf;

    @Column(name = "age")
    private int age;

    @ManyToOne
    @JoinColumn(name = "games_id")
    private GamesModel games;

}
