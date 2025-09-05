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
    public List<GamesDTO> list(){
        return gamesService.list();
    }

    @GetMapping("/find/{id}")
    public GamesDTO findById(@PathVariable Long id){
        return gamesService.findById(id);
    }

    @PostMapping("/create")
    public GamesDTO create(@RequestBody GamesDTO gamesDTO){
        return gamesService.create(gamesDTO);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id){
        gamesService.delete(id);
    }

    @PutMapping("/alter/{id}")
    public GamesDTO alter(@PathVariable Long id , @RequestBody GamesDTO dto){
        return gamesService.alter(id,dto);
    }
}
