create table ACCOUNT_PAYABLE
(
   id integer not null,
   account_number varchar(20) not null,
   purchase_order_number varchar(20) not null,
   account_type varchar(20) not null,
   account_status integer not null,
   primary key(id)
);