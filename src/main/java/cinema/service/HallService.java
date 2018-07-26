package cinema.service;

import cinema.entity.Hall;
import cinema.entity.Row;
import cinema.entity.Seat;
import cinema.repository.HallRepository;
import cinema.repository.RowRepository;
import cinema.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HallService {
    @Autowired
    private HallRepository hallRepository;
    @Autowired
    private RowRepository rowRepository;
    @Autowired
    private SeatRepository seatRepository;

    public Hall createHall(Hall hall){
        return hallRepository.save(hall);
    }
    public Hall createEverything(Hall hall){
        int a =0;
        List<Row> rows = hall.getRows();
        for(Row r:rows){
            List<Seat> seats = r.getSeats();
            for(Seat s:seats){
                s.setRow(r);
            }
            r.setHall(hall);
        }
        hallRepository.save(hall);
        return hall;
    }

    public List<Hall> getAllHalls(){
        return hallRepository.findAll();
    }

    public Hall updateHall(Hall hall) {
        return hallRepository.save(hall);
    }

    public Hall findById(Long id){
        return hallRepository.findById(id);
    }
}
