<h1>Projeto de Laboratório - Sistema de Atendimento de Pacientes</h1>

<p>Este projeto implementa um sistema de atendimento de pacientes em um laboratório. Ele foi desenvolvido como parte de um trabalho acadêmico e demonstra o uso de estruturas de dados em Java.</p>
  
<h2>Funcionalidades</h2>

<p>O projeto possui as seguintes funcionalidades:</p>

<ol>
    <li><strong>Retirar Senha</strong>: Permite que o usuário adicione um paciente à fila, informando seu nome e se é um paciente prioritário ou normal.</li>
    <li><strong>Chamar Paciente</strong>: Permite chamar o próximo paciente da fila. O paciente prioritário tem prioridade.</li>
    <li><strong>Verificar Fila</strong>: Exibe o número de pacientes na fila.</li>
    <li><strong>Verificar Início da Fila</strong>: Mostra o próximo paciente a ser atendido.</li>
</ol>

<h3>Estrutura do Projeto</h3>

<p>O projeto é composto por quatro classes principais:</p>

<ol>
    <li><strong>EstruturaEstatica&lt;T&gt;</strong>: Implementa uma estrutura de dados estática que permite o armazenamento de elementos em um array bidimensional.</li>
    <li><strong>Fila&lt;T&gt;</strong>: Herda de EstruturaEstatica&lt;T&gt; e adiciona métodos específicos para operações de fila, como enfileirar e desenfileirar pacientes.</li>
    <li><strong>Lista&lt;T&gt;</strong>: Também herda de EstruturaEstatica&lt;T&gt; e pode ser usada para outros propósitos além da fila.</li>
    <li><strong>Pessoa</strong>: Representa um paciente com um nome e uma prioridade (normal ou prioritário).</li>
    <li><strong>Main</strong>: Contém o programa principal que interage com o usuário através de uma interface de linha de comando.</li>
</ol>

<h3>Utilização</h3>

<p>Para utilizar o sistema, basta executar a classe <code>Main</code>. Ela iniciará a interface interativa onde o usuário pode escolher as opções disponíveis.</p>

<h2>Observações</h2>

<p>Lembre-se de fornecer informações adicionais sobre o projeto, como possíveis requisitos ou configurações necessárias para executá-lo. Também é útil incluir uma seção de licença se você deseja compartilhar o código com outras pessoas.</p>

<h2>Contribuições</h2>

<p>Contribuições são bem-vindas! Se você identificar melhorias ou correções, fique à vontade para criar um <em>pull request</em>.</p>

<h2>Autor</h2>

<p>Caio Teles</p>
