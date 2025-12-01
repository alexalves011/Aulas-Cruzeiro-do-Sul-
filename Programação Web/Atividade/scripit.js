function calcular(event) {
  event.preventDefault();

  const valorCompra = parseFloat(document.getElementById("inputCompra").value);
  const parcela = parseFloat(document.getElementById("selecione").value);

  const juros = valorCompra / parcela;
  let total;

  if (parcela == 2) {
    total = (valorCompra * 2) / 100;
  } else if (parcela == 3) {
    total = (valorCompra * 3) / 100;
  } else {
    total = (valorCompra * 4) / 100;
  }

  alert("valor de cada parcela  " + total);
}
