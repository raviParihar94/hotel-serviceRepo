package dev.beelive.HotelService.repository;

import dev.beelive.HotelService.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.net.InterfaceAddress;

public interface HotelRepository extends JpaRepository<Hotel,String> {


}
