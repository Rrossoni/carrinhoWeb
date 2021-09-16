create database dboscaras;
use dboscaras;
create table carrinho (
	id int primary key auto_increment,
    produto varchar(100) not null,
    quantidade int not null,
    valor decimal(10,2) not null
);

insert into carrinho(produto,quantidade,valor)
values('cimento','100','200');
insert into carrinho(produto,quantidade,valor)
values('torneira','10','100');
insert into carrinho(produto,quantidade,valor)
values('chuveiro','20','50');
select * from carrinho order by produto;

show databases;

use dboscaras;
