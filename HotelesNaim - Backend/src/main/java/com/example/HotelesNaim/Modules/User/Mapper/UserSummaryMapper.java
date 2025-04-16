package com.example.HotelesNaim.Modules.User.Mapper;

import com.example.HotelesNaim.Modules.User.DTO.UserSummaryDTO;
import com.example.HotelesNaim.Modules.User.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserSummaryMapper {
    UserSummaryMapper INSTANCE = Mappers.getMapper(UserSummaryMapper.class);

    UserSummaryDTO entityToDto(User user);
}
