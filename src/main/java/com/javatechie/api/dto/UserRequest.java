package com.javatechie.api.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {

@NotNull(message = "Name should not be null")
    private String name;
@Email(message ="email is not valid")
    private String email;
@NotNull
@Pattern(regexp = "^\\d{10}$" )
    private String mobile;
    private String gender;
    @Max(60)
    @Min(18)
    private int age;
    @NotBlank(message = "Nationality show be inserted")
    private String nationality;

}
