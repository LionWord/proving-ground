INSERT INTO users (email, registration_date, first_name, last_name)
VALUES ('test@mail.ru', '2023-02-04 23:18:22', 'Ted', 'Bundy'),
        ('cat@mail.ru', '2022-02-04 23:18:22', 'Purr', 'Meow'),
        ('wow@mail.ru', '2021-02-04 23:18:22', 'Killswitch', 'Engage');

INSERT INTO items (user_id, url)
VALUES (1, 'https://www.dns-shop.ru/product/721d4b8248ad3333/drel-deko-dkid600w/'),
       (2, 'https://www.dns-shop.ru/product/97c9fdf198ac3332/vstraivaemaa-posudomoecnaa-masina-dexp-m9c7pb/'),
       (3, 'https://www.dns-shop.ru/product/4424c57c38b53332/kolonki-51-fd-f3800x/'),
       (1, 'https://www.dns-shop.ru/product/990f72e312f93361/kabel-dexp-35-mm-jack---35-mm-jack-cernyj/'),
       (2, 'https://www.dns-shop.ru/product/e9907c6b540fc824/batarejka-litievaa-smartbuy-sbbl-1216-1b/'),
       (3, 'https://www.dns-shop.ru/product/30fe19196c463330/igra-middle-earth-shadow-of-war-xbox-one/');

INSERT INTO tags (name, item_id)
VALUES ('tool', 1),
       ('kitchen appliance', 2),
       ('audio', 3),
       ('audio parts', 4),
       ('power source', 5),
       ('game', 6),
       ('drill', 1),
       ('dishwasher', 2),
       ('stereo', 3),
       ('jack', 4),
       ('slim battery', 5),
       ('LOTR universe', 6);
