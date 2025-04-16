package com.example.HotelesNaim.Modules.User.Mapper;

import com.example.HotelesNaim.Modules.Stay.DTO.StaySummaryDTO;
import com.example.HotelesNaim.Modules.Stay.Mapper.StaySummaryMapper;
import com.example.HotelesNaim.Modules.Stay.Stay;
import com.example.HotelesNaim.Modules.User.DTO.UserDTO;
import com.example.HotelesNaim.Modules.User.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.util.Set;
import java.util.stream.Collectors;

@Mapper(uses = {StaySummaryMapper.class})
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(source = "favorites", target = "favorites", qualifiedByName = "mapStaysToStayDTOs")
    UserDTO entityToDto(User user);

    @Named("mapStaysToStayDTOs")
    default Set<StaySummaryDTO> mapStaysToStayDTOs(Set<Stay> stays) {
        return stays.stream()
                .map(StaySummaryMapper.INSTANCE::entityToDto)
                .collect(Collectors.toSet());
    }
}
