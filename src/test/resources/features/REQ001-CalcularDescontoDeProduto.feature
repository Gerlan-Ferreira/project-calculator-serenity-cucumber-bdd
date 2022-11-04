# language: pt


  Funcionalidade: REQ001 - Calcular Desconto de Produto


    Esquema do Cenario: Cálculo de Desconto do Produto Válido

      Dado que o usuario está na página inicial do sistema
      E deseja selecionar um produto para calcular o desconto

      Quando informa os dados no formulário do cálculo do desconto
        | clientType | <TipoDeCliente> |
        | quantity   | <Quantidade> |

      Entao o sistema apresenta o fator de desconto do produto corretamente
        | discountFactor | <FatorDeDesconto> |

      Exemplos:
      | TipoDeCliente | Quantidade | FatorDeDesconto                 |
      | A             | 99         | 0,90 (ou seja, 10% de desconto) |
      | A             | 100        | 0,95 (ou seja, 5% de desconto)  |
      | A             | 1000       | 1,00 (ou seja, 0% de desconto)  |
      | B             | 99         | 0,85 (ou seja, 15% de desconto) |
      | B             | 100        | 0,90 (ou seja, 10% de desconto) |
      | B             | 1000       | 0,95 (ou seja, 5% de desconto)  |
      | C             | 99         | 0,80 (ou seja, 20% de desconto) |
      | C             | 100        | 0,85 (ou seja, 15% de desconto) |
      | C             | 1000       | 0,90 (ou seja, 10% de desconto) |
