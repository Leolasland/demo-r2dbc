package ru.project.demor2dbc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table("staff")
public class Staff {

    @Id
    private Long id;

    @Column("person_id")
    private String personId;

    @Column("last_name")
    private String lastName;

    @Column("first_name")
    private String firstName;

    @Column("phone")
    private String phone;
}
