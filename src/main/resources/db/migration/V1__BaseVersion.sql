-- create table from metal entity
CREATE TABLE METAL(
    ID DOUBLE NOT NULL PRIMARY KEY AUTO_INCREMENT,
    NAME VARCHAR(255) NOT NULL,
    price INT,
    weight INT,
    durability INT,
    hardness INT,
    sharpness INT,
    toughness INT,
    heatResistance INT,
    corrosionResistance INT,
    electricalConductivity INT
);

CREATE TABLE ITEM(
    ID DOUBLE NOT NULL PRIMARY KEY AUTO_INCREMENT,
    NAME VARCHAR(255) NOT NULL,
    price INT,
    metal_id DOUBLE,
    FOREIGN KEY (metal_id) REFERENCES METAL(ID)
);

INSERT INTO METAL
    (name, price, weight, durability, hardness, sharpness, toughness, heatResistance, corrosionResistance, electricalConductivity)
VALUES ("Iron", 100, 100, 100, 100, 100, 100, 100, 100, 100);

INSERT INTO METAL
    (name, price, weight, durability, hardness, sharpness, toughness, heatResistance, corrosionResistance, electricalConductivity)
VALUES ("Steel", 200, 200, 200, 200, 200, 200, 200, 200, 200);

INSERT INTO METAL
    (name, price, weight, durability, hardness, sharpness, toughness, heatResistance, corrosionResistance, electricalConductivity)
VALUES ("Aluminum", 75, 75, 75, 75, 75, 75, 75, 75, 75);ű

INSERT INTO ITEM
    (name, price, metal_id)
VALUES ("Iron Sword", 1000, 1);

INSERT INTO ITEM
    (name, price, metal_id)
VALUES ("Steel Sword", 2000, 2);

INSERT INTO ITEM
    (name, price, metal_id)
VALUES ("Aluminum Dagger", 750, 3);
