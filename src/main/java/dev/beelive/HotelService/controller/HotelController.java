package dev.beelive.HotelService.controller;


import dev.beelive.HotelService.entities.Hotel;
import dev.beelive.HotelService.service.HotelService;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.plaf.LabelUI;
import java.util.List;

@RestController

public class HotelController {

    private final HotelService hotelService;

    @Autowired
    public HotelController( HotelService hotelService){
        this.hotelService = hotelService;
    }

    @PostMapping("/create-hotel")
    public ResponseEntity<Hotel> createHotel(@RequestBody  Hotel hotel){
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.createHotel(hotel));
    }

    @GetMapping("/{hotelID}")
    public ResponseEntity<Hotel> getHotelByID(@PathVariable String hotelID){
        return ResponseEntity.status(HttpStatus.OK).body(hotelService.getHotelByID(hotelID));
    }

    @GetMapping
    public ResponseEntity<List<Hotel>> getAllHotelList(){
        return ResponseEntity.status(HttpStatus.OK).body(hotelService.getAllHotels());
    }


  /*  public ResponseEntity<Hotel> updateHotelInfoByHotelID(@RequestBody Hotel newHotelObj){
        return ResponseEntity.status(HttpStatus.OK).body(hotelService)
    }*/





    /* Create  */



}
