package corporation.valve.apisteam.Players;


import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;

@Service
public class PlayersService {

    private PlayersRepository playersRepository;

    public PlayersService(PlayersRepository playersRepository){
        this.playersRepository = playersRepository;
    }

    public List<PlayersModel> listAll(){
        return playersRepository.findAll();
    }

    public PlayersModel listById(Long id){
        Optional<PlayersModel> conc = playersRepository.findById(id);
        return conc.orElseThrow(RuntimeException::new);
    }

    public PlayersModel register(PlayersModel playersModel){
        return playersRepository.save(playersModel);
    }

    public void delete(Long id){
        playersRepository.deleteById(id);
    }
}
