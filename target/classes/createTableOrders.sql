USE my_db;

CREATE TABLE orders (
  id int NOT NULL AUTO_INCREMENT,
  price double,
  currency varchar(10),
  producttype varchar(20),
  signeddocuments text,
  comission double,
  PRIMARY KEY (id)
) ;

