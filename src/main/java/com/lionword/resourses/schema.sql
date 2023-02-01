create table if not exists users
(
    email             varchar(64) not null,
    id                bigint generated by default as identity
        primary key,
    registration_date timestamp,
    first_name        varchar(64) not null,
    last_name         varchar(64) not null
);

create table if not exists items
(
    id      bigint generated by default as identity
        primary key,
    user_id bigint
        constraint items_foreign_key
            references users,
    url     varchar(256)
);

create table if not exists tags
(
    id      bigint generated by default as identity
        primary key,
    name    varchar(50) not null,
    item_id bigint
        constraint tags_items_id_fk
            references items
);
