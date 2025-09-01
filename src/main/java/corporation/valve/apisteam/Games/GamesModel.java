package corporation.valve.apisteam.Games;

import com.fasterxml.jackson.annotation.JsonIgnore;
import corporation.valve.apisteam.Enterprises.EnterprisesModel;
import corporation.valve.apisteam.Players.PlayersModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_games")
public class GamesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "release_date")
    private int year;

    @Column(name = "image")
    private String image;

    @Column(name = "indicative_classification")
    private int indicative;

    @Column(name = "requeriments")
    private String requisistos;

    @ManyToOne
    @JoinColumn(name = "enterprise_id")
    private EnterprisesModel enterprise;

    @OneToMany(mappedBy = "games")
    private List<PlayersModel> players;
}
