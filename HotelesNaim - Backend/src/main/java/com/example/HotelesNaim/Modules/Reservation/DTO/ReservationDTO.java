package com.example.HotelesNaim.Modules.Reservation.DTO;

import com.example.HotelesNaim.Modules.Stay.DTO.StaySummaryDTO;
import com.example.HotelesNaim.Modules.User.DTO.UserSummaryDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class ReservationDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private UUID id;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private Double total;
    private StaySummaryDTO stay;
    private UserSummaryDTO user;
    private Boolean confirmed;
    private Boolean reviewed;
}
