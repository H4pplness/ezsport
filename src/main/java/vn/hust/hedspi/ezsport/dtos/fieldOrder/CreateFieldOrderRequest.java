package vn.hust.hedspi.ezsport.dtos.fieldOrder;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateFieldOrderRequest {
    @NotNull
    String fieldId;

    @NotNull
    LocalTime start;

    @NotNull
    LocalTime end;

    @NotNull
    @FutureOrPresent
    LocalDate date;

    @NotNull
    @DecimalMin("0.0")
    double price;

    String userId;

    @FutureOrPresent
    LocalDateTime paidAt;
}
