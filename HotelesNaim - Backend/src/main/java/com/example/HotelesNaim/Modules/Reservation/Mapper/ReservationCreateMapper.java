package com.example.HotelesNaim.Modules.Reservation.Mapper;

import com.example.HotelesNaim.Modules.Reservation.DTO.ReservationCreateDTO;
import com.example.HotelesNaim.Modules.Reservation.Reservation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ReservationCreateMapper {
    ReservationCreateMapper INSTANCE = Mappers.getMapper(ReservationCreateMapper.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "stay.id", target = "id_stay")
    @Mapping(source = "user.id", target = "id_user")
    ReservationCreateDTO entityToDto(Reservation reservation);

    @Mapping(source = "id_stay", target = "stay.id")
    @Mapping(source = "id_user", target = "user.id")
    Reservation dtoToEntity(ReservationCreateDTO reservationDTO);

}
