function mostraconteudo(secao){
    const conteudo = document.getElementById('conteudo');
    let titulo = ''
    let texto = ''


    switch (secao){
        case 'inicio':
            titulo = 'Inicio'
            texto = 'voce esta na pagina inicial. aqui apresentamos uma visão geral do site'
        break

        case 'sobre':
            titulo = 'sobre'
            texto = 'somos uma empresa dedicada a oferecer soluções inovadoras para os clientes'
            break

        case 'servicos':
            titulo = 'Serviços'
            texto = '<p> nossos serviços ..... </p>';
            break

        case 'contato':
            titulo = 'Contatos'
            texto = '<p> email : Exemplo@gmail.com  whatszapp : 00-00000-0000 telefone: 00-00000-0000  <br> Lorem ipsum dolor sit amet consectetur adipisicing elit. Cumque reprehenderit, unde quam sit totam laborum ab eius ea dolore obcaecati laudantium, eum rem. Rem, nesciunt exercitationem quae dicta perspiciatis et? <br> <br> Lorem ipsum dolor sit amet consectetur adipisicing elit. Cumque reprehenderit, unde quam sit totam laborum ab eius ea dolore obcaecati laudantium, eum rem. Rem, nesciunt exercitationem quae dicta perspiciatis et?';

             }




    conteudo.innerHTML = `<h2>${titulo}</h2> ${texto}`
}