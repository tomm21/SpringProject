package cinema.controllers;

import cinema.entity.Row;
import cinema.service.RowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rows")
public class RowController {
    @Autowired
    private RowService rowService;

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Row ceateSeat(@RequestBody Row row){
        return rowService.createRow(row);
    }
    @GetMapping("/all")
    public List<Row> getAllRows(){
        return rowService.getAllRows();
    }
}
