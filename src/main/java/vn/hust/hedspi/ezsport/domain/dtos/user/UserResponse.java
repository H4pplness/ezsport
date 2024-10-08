package vn.hust.hedspi.ezsport.domain.dtos.user;

import lombok.*;
import lombok.experimental.FieldDefaults;
import vn.hust.hedspi.ezsport.database.entities.Role;

import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponse {
    String id;
    String email;
    String firstname;
    String lastname;
    Set<Role> roles;
}
