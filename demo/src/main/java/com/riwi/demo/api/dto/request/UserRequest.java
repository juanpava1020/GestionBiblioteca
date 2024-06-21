package com.riwi.demo.api.dto.request;

import com.riwi.demo.Enums.RoleUser;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest  {
    @NotBlank(message = "the userName is required")
    private String userName;

    @NotBlank(message = "the password is required")
    private String password;

    @NotBlank(message = "the email is required")
    private String email;

    @NotBlank(message = "the fullName is required")
    private String fullName;

    @NotBlank(message = "the role is required")
    private RoleUser role;
}
