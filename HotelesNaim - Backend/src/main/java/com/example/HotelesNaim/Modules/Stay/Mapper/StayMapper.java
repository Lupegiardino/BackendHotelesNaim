package com.example.HotelesNaim.Modules.Stay.Mapper;

import com.example.HotelesNaim.Modules.Address.Address;
import com.example.HotelesNaim.Modules.Address.DTO.AddressDTO;
import com.example.HotelesNaim.Modules.Feature.DTO.FeatureDTO;
import com.example.HotelesNaim.Modules.Feature.Feature;
import com.example.HotelesNaim.Modules.Review.Mapper.ReviewSummaryMapper;
import com.example.HotelesNaim.Modules.Stay.DTO.StayDTO;
import com.example.HotelesNaim.Modules.Stay.Stay;
import com.example.HotelesNaim.Modules.Stay.StayImage;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.util.Set;
import java.util.stream.Collectors;

@Mapper(uses = {ReviewSummaryMapper.class})
public interface StayMapper {
    StayMapper INSTANCE = Mappers.getMapper(StayMapper.class);

    @Mapping(source = "images", target = "images", qualifiedByName = "stayImagesToStrings")
    @Mapping(source = "features", target = "features", qualifiedByName = "featuresToFeaturesDTO")
    @Mapping(source = "category.id", target = "category_id")
    @Mapping(source = "address", target = "address", qualifiedByName = "addressToAddressDTO")
    @Mapping(source = "appreciation", target = "appreciation")
    @Mapping(target = "unavailableDates", ignore = true)
    @Mapping(target = "reviews", ignore = true)
    @Mapping(target = "totalReviews", ignore = true)
    StayDTO entityToDto(Stay stay);

    @Mapping(source = "images", target = "images", qualifiedByName = "stringsToStayImages")
    @Mapping(source = "features", target = "features", qualifiedByName = "featuresDTOToFeatures")
    @Mapping(source = "category_id", target = "category.id")
    @Mapping(source = "appreciation", target = "appreciation")
    @Mapping(source = "address", target = "address", qualifiedByName = "addressDTOToAddress")
    Stay dtoToEntity(StayDTO stayDTO);

    @Named("stayImagesToStrings")
    default Set<String> stayImagesToStrings(Set<StayImage> stayImages) {
        return stayImages.stream()
                .map(StayImage::getUrl)
                .collect(Collectors.toSet());
    }

    @Named("stringsToStayImages")
    default Set<StayImage> stringsToStayImages(Set<String> strings) {
        return strings.stream()
                .map(url -> {
                    StayImage stayImage = new StayImage();
                    stayImage.setUrl(url);
                    return stayImage;
                })
                .collect(Collectors.toSet());
    }

    @Named("featuresToFeaturesDTO")
    default Set<FeatureDTO> featuresToFeaturesDTO(Set<Feature> features) {
        return features.stream()
                .map(feature -> {
                    FeatureDTO featureDTO = new FeatureDTO();
                    featureDTO.setId(feature.getId());
                    featureDTO.setName(feature.getName());
                    featureDTO.setIcon(feature.getIcon());
                    return featureDTO;
                })
                .collect(Collectors.toSet());
    }

    @Named("featuresDTOToFeatures")
    default Set<Feature> featuresDTOToFeatures(Set<FeatureDTO> features) {
        return features.stream()
                .map(featureDTO -> {
                    Feature feature = new Feature();
                    feature.setId(featureDTO.getId());
                    return feature;
                })
                .collect(Collectors.toSet());
    }

    @Named("addressToAddressDTO")
    default AddressDTO addressToAddressDTO(Address address) {
        return AddressDTO.builder()
                .id(address.getId())
                .street(address.getStreet())
                .city(address.getCity())
                .country(address.getCountry())
                .build();
    }

    @Named("addressDTOToAddress")
    default Address addressDTOToAddress(AddressDTO addressDTO) {
        return Address.builder()
                .id(addressDTO.getId())
                .street(addressDTO.getStreet())
                .city(addressDTO.getCity())
                .country(addressDTO.getCountry())
                .build();
    }
}
