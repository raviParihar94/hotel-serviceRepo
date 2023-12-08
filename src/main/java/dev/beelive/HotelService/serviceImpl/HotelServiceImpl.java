package dev.beelive.HotelService.serviceImpl;

import dev.beelive.HotelService.entities.Hotel;
import dev.beelive.HotelService.exceptions.ResourceNotFoundException;
import dev.beelive.HotelService.repository.HotelRepository;
import dev.beelive.HotelService.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class HotelServiceImpl implements HotelService {

    private final HotelRepository hotelRepository;

    @Autowired
    public HotelServiceImpl(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }


    @Override
    public Hotel createHotel(Hotel hotel) {
        UUID uuid = UUID.randomUUID();
        hotel.setHotelID(uuid.toString());
        Hotel hotel1 = hotelRepository.save(hotel);
        return hotel1;
    }

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getHotelByID(String hotelID) {
        return hotelRepository.findById(hotelID).orElseThrow( ()-> new ResourceNotFoundException("Hotel with hotel id  "+ hotelID +" is Not Found !!!"));
    }
}
