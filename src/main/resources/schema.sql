
create table if not exists country
(
    id serial not null primary key,
    name varchar(255) unique not null,
    population integer not null
) ;

insert  into  country(name, population) VALUES
                                          ('Germany', 2000000),
                                          ('France', 3000000),
                                          ('Italy', 1000000);