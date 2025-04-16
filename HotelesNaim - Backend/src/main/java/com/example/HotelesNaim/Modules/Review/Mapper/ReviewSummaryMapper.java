package com.example.HotelesNaim.Modules.Review.Mapper;

import com.example.HotelesNaim.Modules.Review.DTO.ReviewSummaryDTO;
import com.example.HotelesNaim.Modules.Review.Review;
import com.example.HotelesNaim.Modules.User.Mapper.UserSummaryMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {UserSummaryMapper.class})
public interface ReviewSummaryMapper {
    ReviewSummaryMapper INSTANCE = Mappers.getMapper(ReviewSummaryMapper.class);

    @Mapping(source = "user", target = "user")
    @Mapping(source = "comment", target = "comment")
    ReviewSummaryDTO entityToDto(Review review);

    @Mapping(source = "user", target = "user")
    Review dtoToEntity(ReviewSummaryDTO reviewDTO);}
