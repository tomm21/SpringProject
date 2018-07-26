package cinema.controllers;

import cinema.entity.Hall;
import cinema.service.HallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/halls")
public class HallController {
    @Autowired
    private HallService hallService;

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Hall ceateHall(@RequestBody Hall hall){
        return hallService.createHall(hall);
    }

    @PostMapping(value = "/create/everything", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Hall createEverything(@RequestBody Hall hall){
        return hallService.createEverything(hall);
    }

    @GetMapping(value="/all")
    public List<Hall> getAllHalls(){
        return hallService.getAllHalls();
    }

    @PutMapping(value = "/update/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Hall update(@PathVariable(value="id") Long id,@RequestBody Hall hall) {
        return hallService.updateHall(hall);
    }
}
