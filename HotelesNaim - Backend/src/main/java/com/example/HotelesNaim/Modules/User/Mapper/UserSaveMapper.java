package com.example.HotelesNaim.Modules.User.Mapper;

import com.example.HotelesNaim.Modules.User.DTO.UserSaveDTO;
import com.example.HotelesNaim.Modules.User.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserSaveMapper {
    UserSaveMapper INSTANCE = Mappers.getMapper(UserSaveMapper.class);

    UserSaveDTO entityToDto(User user);

    User dtoToEntity(UserSaveDTO userSaveDTO);
}
