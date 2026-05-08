// 2. Calculadora de Soma
// Recebe dois números do usuário e exibe a soma no console.
const readline = require("readline");

const rl2 = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl2.question("Digite o primeiro número: ", (valor1) => {
  rl2.question("Digite o segundo número: ", (valor2) => {
    const numero1 = parseFloat(valor1.replace(",", "."));
    const numero2 = parseFloat(valor2.replace(",", "."));
    const soma = numero1 + numero2;
    console.log(`Resultado da soma: ${soma}`);
    rl2.close();
  });
});
