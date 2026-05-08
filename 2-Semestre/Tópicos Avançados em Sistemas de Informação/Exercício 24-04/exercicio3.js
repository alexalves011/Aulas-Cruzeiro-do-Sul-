// 3. Número Par ou Ímpar
// Solicita um número ao usuário e verifica se é par ou ímpar.
const readline3 = require("readline");

const rl3 = readline3.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl3.question("Digite um número: ", (entrada) => {
  const numero = parseFloat(entrada.replace(",", "."));
  if (Number.isNaN(numero)) {
    console.log("Entrada inválida. Por favor, digite um número.");
  } else {
    if (numero % 2 === 0) {
      console.log("O número é par.");
    } else {
      console.log("O número é ímpar.");
    }
  }
  rl3.close();
});
