package corporation.valve.apisteam.Players;

import corporation.valve.apisteam.Games.GamesService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/players")
public class PlayersController {

    private final PlayersService playersService;


    public PlayersController(PlayersService playersService, GamesService gamesService){
        this.playersService = playersService;
    }


    @GetMapping("/list/{id}")
    public PlayersDTO listById(@PathVariable Long id){
        return playersService.findById(id);
    }
    @PostMapping("/create/")
    public PlayersDTO create(@RequestBody PlayersDTO playersDTO){
            return playersService.create(playersDTO);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        playersService.deleteById(id);
    }
    @GetMapping("/list")
    public List<PlayersDTO> list(){
        return playersService.list();
    }
    @PutMapping("/alter/{id}")
    public PlayersDTO alter(Long id, PlayersDTO dto){
        return playersService.alter(id,dto);
    }
}
