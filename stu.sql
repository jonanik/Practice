create table member(
id varchar2(20),
pw varchar2(20),
name varchar2(20),
gender varchar2(20));

select * from member;

insert into member values('aaa','123','����','��');
insert into member values('bbb','111','�ܺ�','��');
insert into member values('ccc','222','�ܺ�','��');
insert into member values('ddd','333','�ܱ�','��');
insert into member values('eee','444','�ܼ�','��');

select * from member;

delete from member where id='bbb';

select * from member where name='�ܺ�';

delete from member where id='bbb';

select * from member;

update member set gender='��' where id='ccc';

commit;