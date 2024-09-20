package ru.project.demor2dbc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import ru.project.demor2dbc.dto.StaffDto;
import ru.project.demor2dbc.repository.StaffRepository;

@Service
@RequiredArgsConstructor
public class StaffService {

    private final StaffRepository staffRepository;

    public Flux<StaffDto> findAllBy(String lastName,
                                    String firstName,
                                    String phone) {
        return staffRepository.findStaffsByLastNameAndFirstNameAndPhone(lastName, firstName, phone)
                .map(m -> new StaffDto(m.getPersonId(),
                        m.getLastName(),
                        m.getFirstName(),
                        m.getPhone()));
    }
}
