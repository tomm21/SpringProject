package cinema.service;

import cinema.entity.Row;
import cinema.entity.Seat;
import cinema.repository.RowRepository;
import cinema.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatService {
    @Autowired
    private SeatRepository seatRepository;
    @Autowired
    private RowRepository rowRepository;

    public Seat createSeat(Seat seat){
      //  long id = seat.getRow().getId();
        //Row row = rowRepository.findById(id);
        //seat.setRow(row);
        return seatRepository.save(seat);
    }
    public Seat getSeat(Long id) {
        return seatRepository.findById(id);
    }
    public List<Seat> getAllSeats(){
        return seatRepository.findAll();
    }
}
