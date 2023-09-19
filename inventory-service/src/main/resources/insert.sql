delete from `inventory`.`inventory`;

INSERT INTO `inventory`.`inventory`
(`id`,
`price`,
`product_category`,
`product_name`,
`stock_quantity`)
VALUES
(1,
1000,
"Bedding",
"Pillows",
100);


INSERT INTO `inventory`.`inventory`
(`id`,
`price`,
`product_category`,
`product_name`,
`stock_quantity`)
VALUES
(2,
2000,
"Bedding",
"Sheets",
0);

commit;
