package com.riwi.libros_ya.infrastructure.abstract_services;

import com.riwi.libros_ya.api.dto.request.ReservationRequest;
import com.riwi.libros_ya.api.dto.response.ReservationResponse;

public interface IReservationService extends CrudService<ReservationRequest, ReservationResponse, Long>{
    
}
