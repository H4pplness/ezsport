package vn.hust.hedspi.ezsport.dtos.playerBooking;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UpdatePlayerBookingRequest {
    @NotNull
    UUID bookingPlayerId;

    @NotNull
    UUID bookedPlayerId;

    @NotNull
    UUID feedId;

    @NotNull
    @Pattern(regexp = "accepted|waiting|rejected")
    String status;
}
