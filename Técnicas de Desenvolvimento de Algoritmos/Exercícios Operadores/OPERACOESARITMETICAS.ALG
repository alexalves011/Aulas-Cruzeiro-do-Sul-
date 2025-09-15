algoritmo "OperacoesAritmeticas"
var
  n1, n2: inteiro
  soma, subtracao, multiplicacao, divisao, resto: real
inicio
  escreva("Digite o primeiro número: ")
  leia(n1)

  escreva("Digite o segundo número: ")
  leia(n2)


  soma := n1 + n2
  subtracao := n1 - n2
  multiplicacao := n1 * n2


  divisao := n1 / n2

  resto := n1 - ( (n1 div n2) * n2 )

  escreval("Soma: ", soma)
  escreval("Subtração: ", subtracao)
  escreval("Multiplicação: ", multiplicacao)
  escreval("Divisão: ", divisao)
  escreval("Resto da divisão: ", resto)
fimalgoritmo
