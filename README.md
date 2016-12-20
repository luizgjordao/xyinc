# xyinc
Teste Zup

Foi proposto uma API Web na qual fosse possível realizar operações de Inserção, Edição, Deleção e Consultas em um recurso de produtos: Ex.: http://domain.com/products.

Neste projeto foi utilizado:

    Maven, para fácil gerenciamento de dependências.
    Hibernate para trabalhar com persistência de dados via ORM
    Framework Spring para seguir a arquitetura MVC simples.
    MySQL como repositório de dados
    AppHarbor para armazenamento de dados em nuvem e provisionamento rápido de instânciaS

O projeto foi separado em 3 packages, para que cada um pudesse ter sua própria responsabilidade:

    Web -> contém controllers e lógica relacionadas a request/reponse da API.
    Entidades -> contém o modelo de negócio (isolado e independente) 
    Data -> contém as regras de repositório (persistência)

Pelo fato de nunca ter tido experiência com o Java (e seus frameworks), e vir de uma stack diferente (Node.JS e .NET) tive um pouco de dificuldades em criar este projeto, o qual o deixou com inúmeras oportunidades de melhorias, como por exemplo a criação de testes unitários, track de erros (exceções), migrations de base de dados, etc.


Caso seja possível, posso reescrever o teste proposto em: Node.JS ou C#, no qual terei melhores condições para demonstrar, através de código, minha experiência profissional.
