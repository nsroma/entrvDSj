Insert into acteur
 (id_acteur,nom,prenom)
Values
('1','LUCIE','DEDU')
;
Insert into acteur
 (id_acteur,nom,prenom)
Values
('2','FORD','HARRISON')
;
Insert into acteur
 (id_acteur,nom,prenom)
Values
('3','HAMILL','MARK')
;

Insert into film
 (id_film,titre,description)
Values
 ('1','Star Wars: The Empire Strikes Back','Darth Vader is adamant about turning Luke Skywalker to the dark side.')
;

Insert into film_acteurs
 (acteur_id,film_id)
Values
(1,2)
;

Insert into film_acteurs
 (acteur_id,film_id)
Values
(1,3)
;