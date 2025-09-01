package corporation.valve.apisteam.Games;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class GamesService {

    private GamesRepository gamesRepository;

    public GamesService(GamesRepository gamesRepository){
        this.gamesRepository = gamesRepository;
    }

    public List<GamesModel> listAll(){
        return gamesRepository.findAll();
    }

    public GamesModel listById(Long id){
        Optional<GamesModel> conc = gamesRepository.findById(id);
        return conc.orElseThrow(RuntimeException::new);
    }

    public GamesModel register(GamesModel gamesModel){
        return gamesRepository.save(gamesModel);
    }

}
