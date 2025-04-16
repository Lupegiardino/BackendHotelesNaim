package com.example.HotelesNaim.Modules.Review.Mapper;

import com.example.HotelesNaim.Modules.Review.DTO.ReviewCreateDTO;
import com.example.HotelesNaim.Modules.Review.Review;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ReviewCreateMapper {
    ReviewCreateMapper INSTANCE = Mappers.getMapper(ReviewCreateMapper.class);

    @Mapping(source = "id_stay", target = "stay.id")
//    @Mapping(source = "id_reservation", target = "reservation.id")
    Review dtoToEntity(ReviewCreateDTO reviewCreateDTO);
}
