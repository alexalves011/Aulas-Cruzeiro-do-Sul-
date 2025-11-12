const inputNome = document.getElementById("camponome");
const inputSobrenome = document.getElementById("campoSobreNome");
// Agora esta linha vai funcionar, pois "campoturno" existe no HTML
const selectTurno = document.getElementById("campoturno");

const resultado = document.getElementById("resultado"); // A variável se chama 'resultado'

function botaoMostrar() {
  const nome = inputNome.value;
  const turno = selectTurno.value;

  if (nome.trim() === "") {
    // CORREÇÃO 2: Usei 'resultado' ao invés de 'divresultado'
    resultado.innerHTML = "Por Favor digite um nome";
  } else {
    const mensagem = `
        Olá ${nome}  !!
        Você está matriculado no turno ${turno}
        `;

    // CORREÇÃO 3: Usei 'resultado' ao invés de 'divresultado'
    resultado.innerHTML = mensagem;
  }
}
