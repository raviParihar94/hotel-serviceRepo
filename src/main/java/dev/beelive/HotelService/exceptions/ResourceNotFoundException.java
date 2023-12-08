package dev.beelive.HotelService.exceptions;

import org.springframework.web.bind.annotation.ExceptionHandler;


public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException (String msg){
        super(msg);
    }
}
