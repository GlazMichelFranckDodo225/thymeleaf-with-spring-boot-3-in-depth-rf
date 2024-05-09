package com.dgmf.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
@Component
public class UserForm {
    private String name;
    private String email;
    private String password;
    private String gender;
    private String address;
    private Boolean married;
    private String profession;
}
