create table questions
(
	id int auto_increment,
	title varchar(50),
	description text,
	gmt_create BIGINT,
	gmt_modified BIGINT,
	creator int,
	comment_count int default 0,
	like_count int default 0,
	view_count int default 0,
	tag varchar(256)
);

create unique index questions_id_uindex
	on questions (id);

