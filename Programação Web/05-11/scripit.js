const inputNome = document.getElementById('camponome');
const inputSobrenome = document.getElementById('campoSobreNome');
const selectTurno = document.getElementById('campoturno');

const resultado = document.getElementById('resultado');

function botaoMostrar(){

    const nome = inputNome.value;

    const turno = selectTurno.value;

    if (nome.trim() === ""){
        divresultado.innerHTML = "Por Favor digite um nome"

    } else{
        const mensagem = `
        Olá ${nome}  !!
        Você está matriculado no turno ${turno}
        `;

        divresultado.innerHTML = mensagem
    }

}