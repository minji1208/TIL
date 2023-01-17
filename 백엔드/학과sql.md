``` SQL
/* 학과 테이블 생성(부모 테이블) */
CREATE TABLE SUBJECT(
    no number not null,            -- 일련번호
    s_num varchar2(2) not null,    -- 학과번호
    s_name varchar2(80) not null,  -- 학과명
    constraint subject_no_pk primary key(no),
    constraint subject_s_num_uk unique(s_num)
);

/* 학과테이블에 일련번호를 시퀀스에 의해 저장되도록 시퀀스 생성 */
CREATE SEQUENCE subject_seq
START WITH 6
INCREMENT BY 1
MINVALUE 1
MAXVALUE 100000
NOCYCLE
CACHE 2;
```