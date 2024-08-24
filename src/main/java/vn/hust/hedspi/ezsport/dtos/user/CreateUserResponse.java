package vn.hust.hedspi.ezsport.dtos.user;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserResponse {
    private String id;
    private String email;
    private String firstname;
    private String lastname;
}
