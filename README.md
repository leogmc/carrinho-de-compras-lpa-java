# carrinho-de-compras-lpa-java
Este projeto tem como objetivo apresentar o trabalho final da disciplina de Lógica e Programação de Algoritmos.

## Descrição do Trabalho:

Os alunos desenvolverão um sistema de carrinho de compras que utiliza um catálogo pré-carregado de itens e preços. O usuário poderá visualizar os itens disponíveis, selecionar um item, informar a quantidade desejada e adicionar ao carrinho, que armazenará os dados de maneira organizada.

## Requisitos Técnicos:

### 1. Estruturas de Seleção:

  - Use IF/ELSE ou Switch para gerenciar um menu que permita as ações:
  - Visualizar catálogo.
  - Adicionar itens ao carrinho.
  - Exibir o carrinho de compras.
  - Finalizar compra e exibir o total geral.

### 2. Estruturas de Repetição:
o Use um WHILE para manter o programa em execução até que o usuário escolha
finalizar.

### 3. Matrizes e Vetores: Utilize uma matriz para para armazenar os itens do carrinho de compras, sendo que cada item terá no minimo:
  - Descrição do item
  - Quantidade
  - Valor unitário
  - Valor total
OBS: Você também pode implementar usando varios vetores (Um para cada tipo de
elemento e o indice vincula as informações)

### 4. Métodos:
  - Um método para exibir o catálogo.
  - Um método para adicionar um item ao carrinho.
  - Um método para exibir os itens do carrinho com seus detalhes.
  - Um método para calcular e exibir o total geral da compra.

### 5. Catálogo Pré-Carregado:
o Crie uma matriz bidimensional representando os itens disponiveis na sua loja
contendo os nomes dos itens e seus preços. Você também pode implementar
usando dois vetores (Um dos preços e outro dos valores)

Exemplo:
["Arroz", "Feijão", "Macarrão", "Açúcar"]
[5.00, 8.00, 4.50, 3.80]

ou

[
["Arroz", 5.00],
["Feijão", 8.00],
["Macarrão", 4.50],
["Açúcar", 3.80]
]

Cada linha da matriz representa um item (nome e preço unitário).

### 6. Exibição do Catálogo:
- Um método exibe os itens do catálogo, numerados para facilitar a seleção. Os
números dos itens são relativos ao indice o vetor/matriz.
Exemplo:
1 - Arroz: R$ 5.00
2 - Feijão: R$ 8.00
3 - Macarrão: R$ 4.50
4 - Açúcar: R$ 3.80

### 7. Adição ao Carrinho:
- O carrinho deve ter capacidade para adicionar até 20 itens
- O usuário seleciona o número correspondente ao item e informa a quantidade desejada.
- Adicione ao carrinho de compras um registro com:

- Nome do item.
- Quantidade informada.
- Preço unitário.
- Total do item (quantidade × preço unitário).

Exemplo de carrinho:
["Arroz", 2, 5.00, 10.00]
["Macarrão", 3, 4.50, 13.50]

### Extras (Opcional – Limitado a 2 pontos extras):

• Remoção de Itens (1 ponto): Permitir que o usuário remova itens do carrinho.
• Cupom de Desconto (0,5 ponto): Permitir ao finalizar a compra que o usuário possa informar um cupom de desconto
• Limite de Estoque (0,5 ponto): Adicione uma quantidade disponível para cada item no catálogo e atualize à medida que os itens são comprados.
• Relatório Final (0,5 ponto): Exiba um recibo detalhado com todos os itens e seus totais,
como no exemplo abaixo:

------------------------------
Item        Quantidade  Preço
------------------------------
Arroz       2         R$20,00
Feijão      1         R$10,00
------------------------------
TOTAL:                R$30,00

### Objetivos Pedagógicos:

• Trabalhar lógica de matrizes bidimensionais, manipulação de dados e modularização.
• Incentivar o uso de métodos organizados e interatividade com o usuário.
• Simular um sistema próximo a um cenário real e prático.

Essa estrutura oferece uma experiência rica para os alunos, com espaço para desafios adicionais e personalizações.
