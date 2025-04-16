package com.example.HotelesNaim.Modules.Reservation.Mapper;

import com.example.HotelesNaim.Modules.Reservation.DTO.ReservationDTO;
import com.example.HotelesNaim.Modules.Reservation.Reservation;
import com.example.HotelesNaim.Modules.Stay.Mapper.StaySummaryMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {StaySummaryMapper.class})
public interface ReservationMapper {
    ReservationMapper INSTANCE = Mappers.getMapper(ReservationMapper.class);

    @Mapping(source = "stay.images", target = "stay.images", qualifiedByName = "stayImagesToStrings")
    @Mapping(source = "confirmed", target = "confirmed")
    @Mapping(source = "reviewed", target = "reviewed")
    ReservationDTO entityToDto(Reservation reservation);
}
