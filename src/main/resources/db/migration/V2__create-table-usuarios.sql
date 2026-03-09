CREATE TABLE usuarios (
                          id BIGINT NOT NULL AUTO_INCREMENT,
                          login VARCHAR(100) NOT NULL UNIQUE,
                          clave VARCHAR(300) NOT NULL,

                          PRIMARY KEY (id)
);

INSERT INTO usuarios (login, clave)
VALUES ('admin@forohub.com', '$2a$10$EixZaYVK1fsbw1ZfbX3OXePaWxn96p36Q7B5Y5x4Dq3fH6M2YxM5W');