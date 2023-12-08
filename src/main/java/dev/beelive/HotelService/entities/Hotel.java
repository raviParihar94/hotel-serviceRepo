package dev.beelive.HotelService.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
@Builder
public class Hotel {

    @Id
    private String hotelID;

    private String hotelName;

    private String hotelAddress;

    private String about;

}
