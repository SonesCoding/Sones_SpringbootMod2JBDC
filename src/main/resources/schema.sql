create table book
(
   id integer auto_increment primary key ,
   title varchar(255) not null,
   author varchar(255) not null,
   primary key(id)
);

create table author
(
   id integer auto_increment primary key ,
   fname  varchar(255) not null,
   lname  varchar(255) not null,
   primary key(id)
);

create table history
(
   id integer auto_increment primary key ,
   checkin Date,
   checkout Date not null,
   borrowedBook varchar(255) not null,
   primary key(id)
);