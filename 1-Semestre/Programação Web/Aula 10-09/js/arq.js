function calc(){
    var qtdBroa = parseInt (document.getElementById('idBroa').value)
    var qtdPao = parseInt (document.getElementById('idPao').value)
    var totalvenda = (qtdPao * 0.12) + (qtdBroa * 1.50)
    var poupanca = totalvenda * 0.10

    document.getElementById('totvenda'). value = totalvenda
    document.getElementById('totdez'). value = poupanca

}