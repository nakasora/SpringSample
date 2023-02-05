CREATE TABLE `holdBrand` (
    `brand_code` varchar(45) NOT NULL,
    `holding_num` decimal(10,0) NOT NULL,
    `book_val` decimal(10,3) NOT NULL,
    `market_price` decimal(10,3) DEFAULT NULL,
    `coupon_num` int(11) DEFAULT NULL,
    PRIMARY KEY ('id')
)