create table bus_list( 
bus_no number, 
bus_name varchar2(50) not null, 
bus_source varchar2(50), 
bus_destination varchar2(50), 
class varchar2(50) not null, 
constraint bus_no_pk primary key (bus_no), 
constraint bus_class_ck check(class in ('sleeper','seater','sleeperAc','seaterAc')), 
constraint source_destination_ck check(bus_source<>bus_destination));


create table passenger (
pas_id number not null,
pas_name varchar2(50) not null,
pas_age number not null,
pas_gender varchar2(20) not null,
pas_contact number(10) unique not null,
constraint pas_id_pk primary key(pas_id),
constraint pas_age_ck check(pas_age>=1),
constraint pas_gender_ck check(pas_gender in('Male','Female')),
constraint pas_contat_ck check(pas_contact>6666666666));

create sequence pas_id
start with 1000
increment by 1


create table bus_time(
bus_no number not null,
amount number not null,
departure_time timestamp not null,
arrival_time timestamp not null,
constraint bus_no_pk1 primary key(bus_no),
constraint bus_no_fk2 foreign key(bus_no) references bus_list(bus_no)
);


create table reserve(
ticket_no number not null,
bus_no number not null,
pas_id number not null,
no_of_ticket number not null,
journey_date timestamp not null,
total_amount number,
status varchar2(20),
constraint ticket_no_pk primary key(ticket_no),
constraint no_of_ticket_ck check(no_of_ticket>0),
constraint status_ck check(status in('Booked')),
constraint pas_id_pk3 foreign key(pas_id) references passenger(pas_id),
constraint bus_no_pk2 foreign key(bus_no) references bus_list(bus_no)
);
alter table reserve add user_id number;

create sequence ticket_no
start with 100
increment by 1


create table seat_availability(
bus_no number unique not null,
available_seats number not null,
total_seats number not null,
constraint foreign_key_bus_no foreign key(bus_no) references bus_list(bus_no),
constraint check_no_of_seats check(available_seats>=0)
);


create table AdminRegister
(
Admin_id number ,
Admin_name varchar(20) not null,
Email_id varchar(30) ,
pass_word varchar(30) not null,
constraint admin_id_uk unique (admin_id),
constraint Email_id_uh unique (Email_id));

insert into AdminRegister(Admin_id,Admin_name,Email_id,pass_word)
values(1234,'vignesh','vignesh@gmail.com','vignesh123');
insert into AdminRegister(Admin_id,Admin_name,Email_id,pass_word)
values(12345,'suresh','suresh@gmail.com','suresh123');


create table User_register(
name varchar(30) not null,
Email_id varchar(30) unique,
password varchar(30) not null,
contact number not null,
user_id number unique,
constraint user_id_ck check (user_id>=100)
);


create or replace view bus_list_view as 
select bl.bus_no,bl.bus_name,bl.bus_source,bl.bus_destination,bl.class,bt.amount,bt.departure_time,bt.arrival_time,bs.total_seats, bs.total_seats as available_seats
from bus_list bl,bus_time bt,seat_availability bs where bl.bus_no = bt.bus_no and bt.bus_no = bs.bus_no;


create or replace procedure ticket_booking(
bus_id in number,
passenger_id in number,
no_of_tickets in number,
journey_date in timestamp,
i_user_id in number,
o_ticket_id out number
)as 
seat_count number;
bus_fare number;
amt number;

begin
select ticket_no.nextval into o_ticket_id from dual;
  select amount into amt from bus_time where bus_no=bus_id;
  bus_fare:=no_of_tickets * amt;
  select available_seats into seat_count from seat_availability where bus_no=bus_id;
  if(seat_count>=no_of_tickets) then
    insert into reserve(ticket_no,bus_no,pas_id,no_of_ticket,total_amount,journey_date,status,user_id) values (o_ticket_id,bus_id,passenger_id,no_of_tickets,bus_fare,journey_date,'Booked',i_user_id);
    update seat_availability set available_seats=available_seats-no_of_tickets where bus_no=bus_id;
    update reserve set total_amount  = bus_fare where ticket_no = bus_id;
    o_ticket_id:=o_ticket_id;
    --ticket_status:='Ticket booked';
 -- else
     --   ticket_status:='Booking failed';
   
end if;
end ticket_booking;



CREATE OR REPLACE FUNCTION SEATS_AVALABILITY (i_bus_no IN number)
RETURN NUMBER AS 
remaining_seats number;
booked_seats number;
maximum_seats number;
BEGIN
select available_seats into maximum_seats from seat_availability where bus_no=i_bus_no;
select sum(no_of_ticket) into booked_seats from reserve where bus_no=i_bus_no;
remaining_seats := maximum_seats - booked_seats;
  RETURN remaining_seats;
END SEATS_AVALABILITY;

