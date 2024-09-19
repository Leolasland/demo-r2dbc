package ru.project.demor2dbc.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Flux;
import ru.project.demor2dbc.dto.StaffDto;
import ru.project.demor2dbc.service.StaffService;

@RestController
@RequestMapping("/staff")
@RequiredArgsConstructor
public class StaffController {

    private final StaffService staffService;

    @GetMapping
    public Flux<StaffDto> findAllBy(@RequestParam(defaultValue = "testLastName0") String lastName,
                                @RequestParam(defaultValue = "testFirstName 0") String firstName,
                                @RequestParam(defaultValue = "0") String phone) {
        return staffService.findAllBy(lastName, firstName, phone);
    }
}

