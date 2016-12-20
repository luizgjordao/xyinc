# xyinc
Teste Zup

Foi proposto uma API Web na qual fosse poss�vel realizar opera��es de Inser��o, Edi��o, Dele��o e Consultas em um recurso de produtos: Ex.: http://domain.com/products.

Neste projeto foi utilizado:

    Maven, para f�cil gerenciamento de depend�ncias.
    Hibernate para trabalhar com persist�ncia de dados via ORM
    Framework Spring para seguir a arquitetura MVC simples.
    MySQL como reposit�rio de dados
    AppHarbor para armazenamento de dados em nuvem e provisionamento r�pido de inst�nciaS

O projeto foi separado em 3 packages, para que cada um pudesse ter sua pr�pria responsabilidade:

    Web -> cont�m controllers e l�gica relacionadas a request/reponse da API.
    Entidades -> cont�m o modelo de neg�cio (isolado e independente) -> Data -> cont�m as regras de reposit�rio (persist�ncia)

Pelo fato de nunca ter tido experi�ncia com o Java (e seus frameworks), e vir de uma stack diferente (Node.JS e .NET) tive um pouco de dificuldades em criar este projeto, o qual o deixou com in�meras oportunidades de melhorias, como por exemplo a cria��o de testes unit�rios, track de erros (exce��es), migrations de base de dados, etc.