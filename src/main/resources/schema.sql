create table if not exists rated_dogs
(
    id bigserial not null
        constraint rated_dogs_pkey
            primary key,
    image_url varchar(255) not null,
    name varchar(255) not null,
    rating varchar(255) not null
);

create table if not exists anonymous_users
(
    id bigserial not null
        constraint users_pkey
            primary key,
    public_id varchar(255) not null
);
