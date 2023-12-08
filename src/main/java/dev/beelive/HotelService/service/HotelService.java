package dev.beelive.HotelService.service;

import com.sun.istack.NotNull;
import dev.beelive.HotelService.entities.Hotel;
import org.springframework.stereotype.Component;

import java.util.List;
public interface HotelService {

    /*Create Hotel service*/

    Hotel createHotel(@NotNull Hotel hotel);

    /*List all Hotels */

    List<Hotel> getAllHotels();

    Hotel getHotelByID(@NotNull String hotelID);



}
