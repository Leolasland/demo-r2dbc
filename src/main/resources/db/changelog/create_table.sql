CREATE TABLE staff
(
    id         INTEGER GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    person_id  VARCHAR(255),
    last_name  VARCHAR(255),
    first_name VARCHAR(255),
    phone      VARCHAR(255),
    CONSTRAINT pk_staff PRIMARY KEY (id)
);

