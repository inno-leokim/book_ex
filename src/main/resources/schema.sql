drop table if exists Post;
drop table if exists Member;
create table MEMBER_INFO
(
    user_no int primary key auto_increment,
    user_nm varchar(50) unique,
    user_id varchar(50) not null
);