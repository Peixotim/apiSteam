package corporation.valve.apisteam.Games;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping("/games")
@RestController
public class GamesController {

    private GamesService gamesService;

    public GamesController(GamesService gamesService){
        this.gamesService = gamesService;
    }



    @GetMapping("/list")
    public List<GamesModel> list(){
        return gamesService.listAll();
    }

    @GetMapping("/list/{id}")
    public GamesModel listById(Long id){
        return gamesService.listById(id);
    }

    @PostMapping("/register")
    public GamesModel register(@PathVariable GamesModel gamesModel){
        return gamesService.register(gamesModel);
    }

}
