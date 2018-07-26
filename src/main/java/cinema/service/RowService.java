package cinema.service;

import cinema.entity.Hall;
import cinema.entity.Row;
import cinema.repository.HallRepository;
import cinema.repository.RowRepository;
import cinema.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RowService {
    @Autowired
    private RowRepository rowRepository;
    @Autowired
    private HallRepository hallRepository;

    public Row createRow(Row row){
       // long id = row.getHall().getId();
        //Hall hall = hallRepository.findById(id);
        //row.setHall(hall);
        return rowRepository.save(row);
    }
    public List<Row> getAllRows(){
        return rowRepository.findAll();
    }
}
