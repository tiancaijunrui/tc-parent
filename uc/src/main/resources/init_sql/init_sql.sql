DROP  TABLE IF EXISTS t_uc_user;
CREATE TABLE t_uc_user (
  user_id VARCHAR(32) PRIMARY KEY ,
  login_name VARCHAR(100) not NULL ,
  password VARCHAR(100) NOT NULL,
  ali_user_id VARCHAR(100),
  wx_open_id VARCHAR(100),
  create_by VARCHAR (32) NOT NULL,
  create_time TIMESTAMP (6) NOT NULL,
  update_by VARCHAR (32) NOT NULL,
  update_time TIMESTAMP (6) NOT NULL
);

DROP TABLE  IF EXISTS t_uc_user_detail;
CREATE TABLE t_uc_user_detail(
  detail_id VARCHAR(32) PRIMARY KEY ,
  user_id VARCHAR(32) NOT NULL ,
  nick_name VARCHAR(50),
  avatar_url VARCHAR(200),
  gender VARCHAR(10),
  city VARCHAR(50),
  province VARCHAR(50),
  country VARCHAR(50),
  bind_type VARCHAR(20),
  user_type VARCHAR(20),
  user_status VARCHAR(20),
  is_certified VARCHAR(20),
  create_by VARCHAR (32) NOT NULL,
  create_time TIMESTAMP (6) NOT NULL,
  update_by VARCHAR (32) NOT NULL,
  update_time TIMESTAMP (6) NOT NULL
);
