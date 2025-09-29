function mostraconteudo(secao) {
  const conteudo = document.getElementById("conteudo");
  let titulo = "";
  let texto = "";

  switch (secao) {
    case "inicio":
      titulo = "Inicio";
      texto =
        "Explore nossas soluções e descubra como podemos ajudar você a alcançar seus objetivos. Navegue pelo menu para conhecer mais.";
      break;

    case "sobre":
      titulo = "sobre";
      texto =
        "Somos uma equipe dedicada a entregar resultados de alta qualidade. Nossa paixão é transformar ideias em realidade com criatividade e eficiência.";
      break;

    case "servicos":
      titulo = "Serviços";
      texto =
        "Oferecemos uma gama de serviços pensados para atender às suas necessidades. Confira nossas principais especialidades:<br><ul><li>Consultoria Estratégica</li><li>Desenvolvimento de Soluções</li><li>Suporte Técnico Especializado</li></ul>";
      break;

    case "contato":
      titulo = "Contatos";
      texto = `
    <p>
      Para dúvidas, sugestões ou mais informações, entre em contato conosco através dos nossos canais oficiais. Estamos prontos para atender você.
    </p>
    <p>
      <strong>Email:</strong> contato@exemplo.com<br>
      <strong>Telefone:</strong> (11) 98765-4321<br>
      <strong>WhatsApp:</strong> (11) 91234-5678
    </p>
    <hr>
    <p>
      Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
    </p>
    <p>
      Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
    </p>
  `;
      break;

    case "suporte":
      titulo = "Suporte";
      texto =
        "Precisa de ajuda? Nossa equipe de suporte está pronta para resolver qualquer problema. Consulte nossa Central de Ajuda ou abra um chamado.";
      break;
  }

  conteudo.innerHTML = `<h2>${titulo}</h2> ${texto}`;
}
