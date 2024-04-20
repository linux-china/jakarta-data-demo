create table IF NOT EXISTS book
(
    id    int primary key auto_increment,
    isbn  varchar(255),
    title varchar(255),
    text  varchar(255)
);

insert into book(isbn, title, text)
values ('111', 'Java 22', 'This is book for Java 22');

insert into book(isbn, title, text)
values ('222', 'Rust', 'This is book for Rust');