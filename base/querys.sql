CREATE DATABASE videojuegos_db;

USE videojuegos_db;

INSERT INTO usuarios (nombre, apellido, email, password) VALUES 
('User', 'One', 'userone@mail.com', '1234'), 
('User', 'Two', 'usertwo@mail.com', '1234'), 
('User', 'Three', 'userthree@mail.com', '1234'),
('User', 'Four', 'userfour@mail.com', '1234');

INSERT INTO videojuegos (nombre, descripcion, portada, fecha_lanzamiento, rating, precio, id_usuario)
VALUES
('Hunter x Hunter: Phantom Troupe Battle', 'Juego de aventura basado en Hunter x Hunter, enfrenta a la Brigada Fantasma.', 'https://a.storyblok.com/f/178900/900x506/9296fa6759/hunter-x-hunter-game-teaser.jpg', '2021-11-10', 4.5, 87.45, 1),
('Jujutsu Kaisen: Curse Hunters', 'Caza maldiciones y protege a la humanidad.', 'https://static.bandainamcoent.eu/high/jujutsu-kaisen/jujutsu-kaisen-cursed-clash/00-page-setup/JJK-header-mobile2.jpg', '2023-05-03', 4.6, 132.78, 2),
('Death Note: L', 'Juego de estrategia para resolver crímenes como el legendario L.', 'https://static1.srcdn.com/wordpress/wp-content/uploads/2024/05/image-of-death-note-with-light-yagami-in-the-forefront-with-ryuk-and-l-in-the-background.jpg', '2019-09-15', 4.7, 74.92, 3),
('Chainsaw Man: Devil Slayer', 'Juego de acción basado en Chainsaw Man, combate a demonios con estilo.', 'https://static1.srcdn.com/wordpress/wp-content/uploads/2022/10/Chainsaw-Man-Face.jpg', '2023-03-12', 4.6, 143.15, null),
('Pokémon: Infinite Worlds', 'Explora nuevas regiones y captura Pokémon nunca antes vistos.', 'https://sm.ign.com/ign_es/lists/e/every-poke/every-pokemon-game-on-the-nintendo-switch-in-2024_vgxa.jpg', '2022-07-08', 4.8, 65.30, null),
('Naruto: Shippuden Legends', 'Revive los momentos icónicos del anime con peleas épicas.', 'https://cdn.hobbyconsolas.com/sites/navi.axelspringer.es/public/media/image/2023/10/naruto-x-boruto-ultimate-ninja-storm-connections-3203300.jpg?tf=3840x', '2020-12-05', 4.4, 55.60, null),
('Attack on Titan: Walls Collapse', 'Protege las murallas y enfrenta titanes aterradores.', 'https://shared.cloudflare.steamstatic.com/store_item_assets/steam/apps/601050/ss_7df7ae959d6021aa0b5f45015ea03ae3316bc756.1920x1080.jpg?t=1729050891', '2021-04-25', 4.3, 148.72, null),
('One Piece: Pirate Voyage', 'Embárcate en aventuras épicas con la tripulación de Luffy.', 'https://static.bandainamcoent.eu/high/one-piece/one-piece-world-seeker/00-page-setup/opws_game_thumb_408x314_3.jpg', '2023-01-20', 4.6, 92.10, null),
('My Hero Academia: Hero Rising', 'Conviértete en el héroe definitivo en el universo de My Hero Academia.', 'https://www.gamespot.com/a/uploads/original/1578/15787979/3321465-1879702111-DQMSw.jpg', '2020-05-30', 4.2, 34.99, null),
('Dragon Ball Z: Universe Fighters', 'Participa en batallas intensas con los guerreros Z.', 'https://static0.gamerantimages.com/wordpress/wp-content/uploads/2019/07/Dragon-Ball-Z-Battle-of-Z-ps-vita-game.jpg', '2021-09-14', 4.5, 121.85, null),
('Demon Slayer: Blade of Fate', 'Revive la historia del anime enfrentando a los demonios más temibles.', 'https://imageio.forbes.com/specials-images/imageserve/601c010ab20cddc74604b9eb/Demon-Slayer/960x0.jpg?format=jpg&width=960', '2022-02-18', 4.7, 140.20, null),
('Bleach: Soul Reapers', 'Explora el mundo espiritual y enfréntate a los hollows.', 'https://assets-prd.ignimgs.com/2024/07/05/438402160-1720220916966.png?crop=16%3A9&width=888', '2021-06-22', 4.3, 47.55, null),
('Sword Art Online: Virtual Realms', 'Experimenta un mundo completamente inmersivo en VR.', 'https://i0.wp.com/news.qoo-app.com/en/wp-content/uploads/sites/3/2022/04/Sword-Art-Online-Variant-Showdown-Reveals-PvE-Battle-System.jpeg?fit=1200%2C678&amp;ssl=1', '2023-05-03', 4.8, 129.33, null),
('Tokyo Revengers: Time Loop', 'Adéntrate en un bucle temporal para salvar a tus amigos.', 'https://cloudfront-us-east-1.images.arcpublishing.com/copesa/EWCFNIQMCNAOPMFT26A7XATAPY.jpeg', '2021-03-10', 4.4, 83.25, null),
('Fullmetal Alchemist: Brotherhood Quest', 'Desentraña los secretos de la alquimia en un mundo lleno de aventuras.', 'https://static1.colliderimages.com/wordpress/wp-content/uploads/2021/12/fullmetal-alchemist-mobile-trailer-social.jpg', '2022-10-01', 4.5, 110.48, null);
