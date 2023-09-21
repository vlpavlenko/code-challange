INSERT INTO NAME (first, middle, last)
VALUES ('Bob', 'Bobby', 'Smith'),
       ('John', 'Johnny', 'Johnson'),
       ('Jane', 'Janie', 'Janeway'),
       ('Fred', 'Freddie', 'Fredderson'),
       ('Lola', 'Lolita', 'Lolita');

INSERT INTO ADDRESS (street, city, state, zip)
VALUES ('123 Main St', 'Anytown', 'CA', '12345'),
       ('456 Main St', 'Anytown', 'CA', '12345'),
       ('789 Main St', 'Anytown', 'CA', '12345'),
       ('101112 Main St', 'Anytown', 'CA', '12345'),
       ('131415 Main St', 'Anytown', 'CA', '12345');

INSERT INTO PHONE (number, type)
VALUES ('123-456-7890', 'home'),
       ('234-567-8901', 'work'),
       ('345-678-9012', 'cell'),
       ('456-789-0123', 'home'),
       ('567-890-1234', 'work'),
       ('678-901-2345', 'cell');



INSERT INTO CONTACT (person_id, address_id, email)
VALUES (1, 1, 'test@test.com'),
       (2, 2, 'test2@test.com'),
       (3, 3, 'test3@test.com'),
       (4, 4, 'test4@test.com'),
       (5, 5,'test5@test.com');

INSERT INTO CONTACT_PHONE (contact_entity_id, phone_id)
VALUES (1, 6),
       (1, 1),
       (2, 2),
       (3, 3),
       (4, 4),
       (5, 5);