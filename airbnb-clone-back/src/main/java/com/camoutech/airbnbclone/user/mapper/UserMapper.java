package com.camoutech.airbnbclone.user.mapper;

import com.camoutech.airbnbclone.user.application.dto.ReadUserDTO;
import com.camoutech.airbnbclone.user.domaine.Authority;
import com.camoutech.airbnbclone.user.domaine.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    ReadUserDTO readUserDTOToUser(User user);

    default String mapAuthoritiesToString(Authority authority) {
        return authority.getName();
    }

}