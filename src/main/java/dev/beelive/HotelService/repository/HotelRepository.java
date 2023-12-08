package dev.beelive.HotelService.repository;

import dev.beelive.HotelService.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.net.InterfaceAddress;
@Repository
public interface HotelRepository extends JpaRepository<Hotel,String> {


}
