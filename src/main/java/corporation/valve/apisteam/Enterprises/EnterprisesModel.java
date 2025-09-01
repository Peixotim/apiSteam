package corporation.valve.apisteam.Enterprises;

import com.fasterxml.jackson.annotation.JsonIgnore;
import corporation.valve.apisteam.Games.GamesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_enterprise")
public class EnterprisesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(unique = true)
    private String cnpj;

    @Column(unique = true)
    private String email;

    @Column(name = "opening_year")
    private int year;

    @Column(unique = true)
    private String telefone;

    @JsonIgnore
    @OneToMany(mappedBy = "enterprise")
    private List<GamesModel> gamesModel;
}
