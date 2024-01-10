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

DROP Table if EXISTS tbl_board;

CREATE TABLE tbl_board (
    bno INT NOT NULL AUTO_INCREMENT,
    title VARCHAR(200) NOT NULL,
    content TEXT NULL,
    writer VARCHAR(50) NOT NULL,
    regdate TIMESTAMP NOT NULL DEFAULT now(),
    viewcnt INT DEFAULT 0,
    PRIMARY KEY(bno)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;