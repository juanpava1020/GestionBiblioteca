package com.riwi.demo.api.dto.customResponse;

import com.riwi.demo.Enums.RoleUser;
import com.riwi.demo.domain.entities.Loan;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserBasicResponse {
    private Long id;
    private String userName;
    private String password;
    private String email;
    private String fullName;
    private RoleUser role;

}
