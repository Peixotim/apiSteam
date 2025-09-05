package corporation.valve.apisteam.Players;


import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Optional;
@Service
public class PlayersService {

    private PlayersRepository playersRepository;
    private PlayersMapper mapper;

    public PlayersService(PlayersRepository playersRepository , PlayersMapper mapper){
        this.playersRepository = playersRepository;
        this.mapper = mapper;
    }



    public PlayersDTO alter(Long id , PlayersDTO dto){
        Optional<PlayersModel> playerExist = playersRepository.findById(id);
        if(playerExist.isPresent()){
            PlayersModel player = mapper.map(dto);
            player = playersRepository.save(player);

            return mapper.map(player);
        }
        return null;
    }

    public PlayersDTO findById(Long id){
        PlayersModel model = playersRepository.findById(id).orElseThrow(RuntimeException::new);
        return mapper.map(model);
    }



    public PlayersDTO create(PlayersDTO dto){
        PlayersModel model = mapper.map(dto);
        model = playersRepository.save(model);
        return mapper.map(model);
    }


    public void deleteById(Long id){
        playersRepository.deleteById(id);
    }


    public List<PlayersDTO> list(){
        List<PlayersModel> model = playersRepository.findAll();

        return model.stream()
                .map(mapper :: map)
                .collect(Collectors.toList());
    }
}
