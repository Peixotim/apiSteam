package corporation.valve.apisteam.Players;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayersRepository extends JpaRepository<PlayersModel , Long> {
}
