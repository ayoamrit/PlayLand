CREATE TABLE contact_form(
    Email VARCHAR(50) DEFAULT NULL,
    Message VARCHAR(1000) DEFAULT NULL,
    FOREIGN KEY(Email) REFERENCES customer_info(Email)
)