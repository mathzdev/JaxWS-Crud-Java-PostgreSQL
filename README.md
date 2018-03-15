# Jax-WS Crud - Java + PostgreSQL

WebService SOAP construído com as tecnologias:

- ![](https://img.shields.io/badge/Jax_WS-2.0-00b894.svg)
- ![](https://img.shields.io/badge/Java-1.8.0_45-d63031.svg)
- ![](https://img.shields.io/badge/PostgreSQL-9.4-0984e3.svg)

# Métodos e Parâmetros
## Criar
| Parâmetro | Tipo |
| - | - |
| Titulo | String (200) |
| Texto | String (1000) |
| Data | Date (AAAA-MM-DDTHH:MM:SS-HH:MM) |
![](https://i.imgur.com/2BKaGXL.png)
#### Retorno padrão Boolean true/false

## Alterar
| Parâmetro | Tipo |
| - | - |
| Id * | Int |
| Titulo | String (200) |
| Texto | String (1000) |
| Data | Date (AAAA-MM-DDTHH:MM:SS-HH:MM) |
#### * *id Obrigatório para identificação do registro, os outros parâmetros apenas caso deseje que sejam alterados.*
![](https://i.imgur.com/E4UZ7o0.png)
#### Retorno padrão Boolean true/false

## Deletar
| Parâmetro | Tipo |
| - | - |
| Id * | Int |
#### * *id Obrigatório para identificação do registro.*
![](https://i.imgur.com/krfTUlL.png)
#### Retorno padrão Boolean true/false

## Ler
| Parâmetro | Tipo |
| - | - |
| arg0 (Id) * | Int |
#### * *id Obrigatório para identificação do registro.*
![](https://i.imgur.com/TWKEg4D.png)
#### Retorno objeto Noticia com o registro específico.

## Listar
#### *Sem parâmetro.*
![](https://i.imgur.com/yLiJDie.png)
#### Retorno lista de objetos Noticia.

## Pesquisar
| Parâmetro | Tipo |
| - | - |
| arg0 (texto) * | String |
#### * *texto Obrigatório para procurar entre os registros, em seu título ou texto.*
![](https://i.imgur.com/dcJR1au.png)
#### Retorno lista de objetos Noticia que contenham em seu título ou texto o parâmetro requisitado.

#

# ~ by matheusluciox@gmail.com