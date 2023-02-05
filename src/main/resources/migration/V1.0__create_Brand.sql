CREATE TABLE `brand` (
    `brand_code` varchar(45) NOT NULL,
    `brand_name` varchar(45) NOT NULL,
    `interest_rate` decimal(10,3) NOT NULL,
    `redemption_date` date NOT NULL,
    `coupon_num` int(11) NOT NULL,
    PRIMARY KEY ('id')
)