Algoritmo "cerca_triangulo"
Var
  a, b, c, ang_graus, ang_rad, pi: real
  opcao: inteiro

Inicio
  pi <- 3.14159

  escreva("Informe o comprimento do lado a (metros): ")
  leia(a)

  escreva("Informe o comprimento do lado b (metros): ")
  leia(b)

  escreva("Digite 1 se a e b são perpendiculares (ângulo reto), ")
  escreva("ou 2 se você conhece o ângulo entre a e b: ")
  leia(opcao)

  se (opcao = 1) entao

     c <- raizq(a * a + b * b)
  senao
     escreva("Informe o ângulo entre a e b em graus: ")
     leia(ang_graus)
     ang_rad <- ang_graus * pi / 180.0
     c <- raizq(a * a + b * b - 2 * a * b * cos(ang_rad))
  fimse

  escreval("Você precisa comprar ", c, " metros de cerca para fechar o triângulo.")
Fimalgoritmo
