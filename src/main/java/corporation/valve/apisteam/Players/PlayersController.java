package corporation.valve.apisteam.Players;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayersController {

    private PlayersService playersService;

    public PlayersController(PlayersService playersService){
        this.playersService = playersService;
    }


    @GetMapping("/list")
    public List<PlayersModel> list(){
        return playersService.listAll();
    }

    @GetMapping("/list/{id}")
    public PlayersModel listById(@PathVariable Long id){
        return playersService.listById(id);
    }

    @PostMapping("/register")
    public PlayersModel register(@RequestBody PlayersModel playersModel){
        return playersService.register(playersModel);
    }

}
