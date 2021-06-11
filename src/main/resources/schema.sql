
CREATE SEQUENCE id_acteur_seq
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;
    
CREATE TABLE acteur (
    id_acteur integer DEFAULT nextval('id_acteur_seq') NOT NULL,
    nom character varying(45) NOT NULL,
    prenom character varying(45) NOT NULL
);


CREATE SEQUENCE id_film_seq
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;
    
CREATE TABLE film (
    id_film integer  DEFAULT nextval('id_film_seq') NOT NULL,
    titre character varying(255) NOT NULL,
    description text
);

CREATE TABLE film_acteurs (
    acteur_id integer NOT NULL,
    film_id integer NOT NULL
);

ALTER TABLE film_acteurs
    ADD CONSTRAINT film_acteurs_pk PRIMARY KEY (acteur_id, film_id);

ALTER TABLE acteur
    ADD CONSTRAINT acteur_pk PRIMARY KEY (id_acteur);

ALTER TABLE film
    ADD CONSTRAINT film_pk PRIMARY KEY (id_film);

    
ALTER TABLE film_acteurs
    ADD CONSTRAINT id_acteur_fk FOREIGN KEY (acteur_id) REFERENCES acteur(id_acteur) ON UPDATE CASCADE ON DELETE RESTRICT;

ALTER TABLE film_acteurs
    ADD CONSTRAINT id_film_fk FOREIGN KEY (film_id) REFERENCES film(id_film) ON UPDATE CASCADE ON DELETE RESTRICT;