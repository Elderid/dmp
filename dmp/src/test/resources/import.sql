-- SQL QUERIES TO SETUP HSQLDB FOR EMBEDDED DAO TESTS


-- Créer des utilisateurs pour les tests CRUD
INSERT INTO user(IDUSER, IDENTIFIANT, PASSWORD) VALUES (1, 'SelectIdentifiant', 'ngLzopB+RVaKg+Lx5Uuu3w==');
INSERT INTO user(IDUSER, IDENTIFIANT, PASSWORD) VALUES (1, 'UpdateIdentifiant', 'Update13');
INSERT INTO user(IDUSER, IDENTIFIANT, PASSWORD) VALUES (1, 'DeleteIdentifiant', 'Delete13');
