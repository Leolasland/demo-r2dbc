package ru.project.demor2dbc.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StaffDto {

    private String personId;

    private String lastName;

    private String firstName;

    private String phone;
}
