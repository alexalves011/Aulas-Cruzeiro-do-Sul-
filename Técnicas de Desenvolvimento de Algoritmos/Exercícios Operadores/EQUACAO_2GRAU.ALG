Algoritmo "equacao_2grau"

Var
   a, b, c, delta, x1, x2: real

Inicio
   escreva("Informe o valor de a: ")
   leia(a)

   escreva("Informe o valor de b: ")
   leia(b)

   escreva("Informe o valor de c: ")
   leia(c)

   delta <- (b * b) - (4 * a * c)

   se (delta < 0) entao
      escreval("Não existem raízes reais para esta equação.")
   senao
      x1 <- (-b + raizq(delta)) / (2 * a)
      x2 <- (-b - raizq(delta)) / (2 * a)

      escreva("A primeira raiz é: ", x1, "\n")
      escreva("A segunda raiz é: ", x2, "\n")
   fimse
Fimalgoritmo
