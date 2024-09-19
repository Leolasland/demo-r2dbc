package ru.project.demor2dbc.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import ru.project.demor2dbc.model.Staff;

public interface StaffRepository extends ReactiveCrudRepository<Staff, Long> {

    Flux<Staff> findStaffsByLastNameAndFirstNameAndPhone(String lastName, String firstName, String phone);
}
