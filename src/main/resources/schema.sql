drop table if exists tbl_member;
create table tbl_member
(
    userid varchar(50) not null,
    userpw varchar(50) not null,
    username varchar(50) not null,
    email varchar(100),
    regdate timestamp default now(),
    updatedate timestamp default now(),
    PRIMARY KEY(userid)
);