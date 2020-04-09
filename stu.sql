create table member(
id varchar2(20),
pw varchar2(20),
name varchar2(20),
gender varchar2(20));

select * from member;

insert into member values('aaa','123','요한','남');
insert into member values('bbb','111','단비','여');
insert into member values('ccc','222','단비','여');
insert into member values('ddd','333','단구','남');
insert into member values('eee','444','단수','남');

select * from member;

delete from member where id='bbb';

select * from member where name='단비';

delete from member where id='bbb';

select * from member;

update member set gender='남' where id='ccc';

commit;