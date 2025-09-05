package corporation.valve.apisteam.Games;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Optional;

@Service
public class GamesService {

    private GamesRepository gamesRepository;
    private GamesMapper mapper;

    public GamesService(GamesRepository gamesRepository , GamesMapper mapper){
        this.gamesRepository = gamesRepository;
        this.mapper = mapper;
    }


    //CRUD

    //List
    public List<GamesDTO> list(){
        List<GamesModel> games = gamesRepository.findAll();

        return games.stream()
                .map(mapper :: map)
                .collect(Collectors.toList());
    }

    //FindById
    public GamesDTO findById(Long id){
        GamesModel model = gamesRepository.findById(id).orElseThrow(RuntimeException::new);
        return mapper.map(model);
    }

    //Create
    public GamesDTO create(GamesDTO gamesDTO){
        GamesModel model = mapper.map(gamesDTO);
        model = gamesRepository.save(model);
        return mapper.map(model);
    }



    //Delte
    public void delete(Long id){
        gamesRepository.deleteById(id);
    }


    public GamesDTO alter(Long id, GamesDTO dto){
        Optional<GamesModel> gamesExist = gamesRepository.findById(id);
        if(gamesExist.isPresent()){
            GamesModel model = mapper.map(dto);
            model = gamesRepository.save(model);
            return mapper.map(model);
        }
        return null;
    }
}
