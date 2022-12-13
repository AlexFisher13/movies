INSERT INTO movie (id, title) VALUES (1, 'Breaking bad');
INSERT INTO movie (id, title) VALUES (2, 'Troy');
INSERT INTO movie (id, title) VALUES (3, 'Inglourious Basterds');
INSERT INTO movie (id, title) VALUES (4, 'Warrior');

INSERT INTO actor (id, name, birth) VALUES (1, 'Brad Pitt', '1963-12-18');
INSERT INTO actor (id, name, birth) VALUES (2, 'Tom Hardy', '1977-09-15');
INSERT INTO actor (id, name, birth) VALUES (3, 'Bryan Cranston', '1956-03-7');

INSERT INTO movie_actors (movie_id, actors_id) VALUES (1, 3);
INSERT INTO movie_actors (movie_id, actors_id) VALUES (2, 1);
INSERT INTO movie_actors (movie_id, actors_id) VALUES (3, 1);
INSERT INTO movie_actors (movie_id, actors_id) VALUES (4, 2);
