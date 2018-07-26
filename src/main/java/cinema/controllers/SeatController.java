package cinema.controllers;

import cinema.entity.Seat;
import cinema.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seats")
public class SeatController {
    @Autowired
    private SeatService seatService;

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Seat ceateSeat(@RequestBody Seat seat){
       return seatService.createSeat(seat);
    }

    @GetMapping("/{id}")
    public Seat getSeat(@PathVariable(value="id") Long id){
        return seatService.getSeat(id);
    }

    @GetMapping("/all")
    public List<Seat> getAllSeats(){
        return seatService.getAllSeats();
    }
}
