package com.example.HotelesNaim.Modules.User.Service;

import com.example.HotelesNaim.Modules.User.DTO.UserDTO;
import com.example.HotelesNaim.Modules.User.DTO.UserFavoriteDTO;
import com.example.HotelesNaim.Modules.User.DTO.UserSaveDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.UUID;
public interface IUserService {
    UserDTO findById(UUID id);

    UserDTO findByEmail(String email);

    Page<UserDTO> findAll(Pageable pageable);

    void delete(UUID id);

    UserDTO updateByAdmin(UserSaveDTO userSaveDTO);

    UserDTO addFavorite(UserFavoriteDTO userFavoritesDTO);

    UserDTO removeFavorite(UserFavoriteDTO userFavoritesDTO);
}
