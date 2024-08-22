CREATE TABLE `USERS` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`external_id` BINARY(16) NOT NULL DEFAULT (UUID_TO_BIN(UUID(), 1)),
	`name` VARCHAR(255) NOT NULL,
	`nickname` VARCHAR(255) NOT NULL,
	`email` VARCHAR(255) NOT NULL,
	`phone` VARCHAR(20) NOT NULL,
	`gender` CHAR(1) NOT NULL,
	`password` VARCHAR(255) NOT NULL,
	`created_at` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY (`id`)
) ENGINE=InnoDB;

CREATE TABLE `PROFILE_PHOTOS` (
    `id` INT NOT NULL AUTO_INCREMENT,
    file_url VARCHAR(255) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    user_id INT NOT NULL,
    FOREIGN KEY (user_id) REFERENCES USERS(id),
    PRIMARY KEY (id)
) ENGINE=InnoDB;


INSERT INTO `USERS` (`external_id`, `name`, `nickname`, `email`, `phone`, `gender`, `password`, `created_at`)
VALUES (uuid_to_bin(uuid(),1), 'Vinicius', 'Vini', 'vini@hotmail.com', '7070707070', 'M', '12345678', now());

INSERT INTO `USERS` (`external_id`, `name`, `nickname`, `email`, `phone`, `gender`, `password`, `created_at`)
VALUES (uuid_to_bin(uuid(),1), 'My User', 'Vini', 'vini2@hotmail.com', '7070707071', 'M', '12345678', now());