USE movies_db;

--
-- 1. Explique o conceito de normalização e para que é usado.

-- Normalização serve para melhorar a organização dos dados em um banco de dados, deixar mais estável e facilitar possíveis mudanças.


-- 2. Adicione um filme à tabela de filmes.

insert into movies (title, rating, awards, release_date, length, genre_id)
 values ('Filme', '10.0', '1', '2021-07-20', 120, 1);  


-- 3. Adicione um gênero à tabela de gêneros.
insert into genres (name, ranking, active)
	values ('Gênero', 13, 1);


-- 4. Associe o filme do Ex 2. ao gênero criado no Ex. 3.
update movies set genre_id = 13 where title = 'Filme';

-- 5. Modifique a tabela de atores para que pelo menos um ator adicione como favorito o filme adicionado no Ex. 2.
update actors set favorite_movie_id = 13 where id = 1;

-- 6. Crie uma cópia temporária da tabela de filmes.
CREATE TEMPORARY TABLE IF NOT EXISTS temp_movies AS (SELECT * FROM movies);


-- 7. Elimine desta tabela temporária todos os filmes que ganharam menos de 5 prêmios.
delete from temp_movies where awards < 5;


-- 8. Obtenha a lista de todos os gêneros que possuem pelo menos um filme.
select distinct genres.name 
from genres
join movies
	where genres.id = movies.genre_id;

-- 9. Obtenha a lista de atores cujo filme favorito ganhou mais de 3 prêmios.
select CONCAT(actors.first_name, ' ', actors.last_name) from actors
join movies 
where 
	actors.favorite_movie_id = movies.id
    and movies.awards > 3
order by actors.first_name, actors.last_name asc;


-- 10. Use o plano de explicação para analisar as consultas nos Ex. 7.
explain delete from temp_movies where awards < 5;

-- 11. O que são os índices? Para que servem?
Índices são estruturas relacionadas a dados de uma ou mais tabelas para acelerar e diminuir a carga no banco, para facilitar a obtenção de colunas em tabelas com muitos dados.

-- 12. Crie um índice sobre o nome na tabela de filmes.
create index idx_movies_title ON movies (title);

-- 13. Verifique se o índice foi criado corretamente.
SELECT DISTINCT table_name, index_name
FROM information_schema.statistics
WHERE table_schema = 'movies_db'
AND index_name = 'idx_movies_title';

