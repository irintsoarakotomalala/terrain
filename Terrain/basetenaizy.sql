create database terrain;
\c terrain;


create table Utilisateur(
    idutilisateur SERIAL PRIMARY KEY,
    Email varchar(50),
    Nomutilisateur varchar(40),
    Mdp varchar(30)
);
insert into Utilisateur(Email, Nomutilisateur, Mdp) values ('irintsoa@gmail.com', 'Irintsoa', '1234');



create table Terrain(
idterrain serial primary key,
nomterrain varchar(100),
typesol varchar(50),
nbparcelle int,
superficie double precision,
longitudeterrain int,
latitudeterrain int,
phototerrain varchar(100)

);

-- Terrain 1
INSERT INTO Terrain (nomterrain, typesol, nbparcelle, superficie, longitudeterrain, latitudeterrain, phototerrain)
VALUES ('Ferme de la Vallée', 'Argilo-limoneux', 5, 120.5, 45, -75, 'terrain1.jpg');

-- Terrain 2
INSERT INTO Terrain (nomterrain, typesol, nbparcelle, superficie, longitudeterrain, latitudeterrain, phototerrain)
VALUES ('Champ du Soleil', 'Sableux', 8, 200.75, 40, -80, 'terrain2.jpg');


create table Culture(
idculture serial primary key,
nomculture varchar (200),
typeculture varchar(100),
tempsculture timestamp,
rendement int
);

INSERT INTO Culture (nomculture, typeculture, tempsculture, rendement)
VALUES ('Pommes', 'Fruits', '2024-01-26 08:00:00', 300);

create table Proprietaire(
idproprietaire serial primary key,
nomproprietaire varchar(50)
);


create table parcelle(
idparcelle serial primary key,
idculture int,
foreign key (idculture) references Culture (idculture),
typesolparcelle varchar(50),
longitudeparcelle int,
latitudeparcelle int,
idproprietaire int,
foreign key (idproprietaire) references Proprietaire (idproprietaire),
photoParcelle varchar(100)

);


-- Parcelle 1 (Associée à la culture de Fruits)
INSERT INTO parcelle (idculture, typesolparcelle, longitudeparcelle, latitudeparcelle, idproprietaire, photoparcelle)
VALUES (1, 'Argileux', 40, -75, 1, 'parcelle1.jpg');
