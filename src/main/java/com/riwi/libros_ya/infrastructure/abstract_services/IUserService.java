package com.riwi.libros_ya.infrastructure.abstract_services;

import com.riwi.libros_ya.api.dto.request.UserRequest;
import com.riwi.libros_ya.api.dto.response.UserResponse;

public interface IUserService extends CrudService<UserRequest, UserResponse, Long> {
    
}
