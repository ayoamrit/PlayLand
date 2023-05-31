CREATE TABLE purchase_history(
    Email VARCHAR(50) DEFAULT NULL,
    Quantity INT DEFAULT NULL,
    Date DATE DEFAULT NULL,
    Paid DECIMAL(10,2) DEFAULT NULL,
    FOREIGN KEY(Email) REFERENCES customer_info(Email)
)