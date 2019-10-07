#### UnB - Universidade de Brasilia
#### FGA - Faculdade do Gama
#### TPPE - Técnicas de Programação para Plataformas Emergentes

# Avaliação 1 - TPPE
#### 2019/2

**Instruções para a prova:**
* Prova individual.
* Prova avaliada em 100 pontos. 
* É permitida a consulta ao catálogo de refatorações. 
* Para cada questão, realize um _commit_ com a mensagem descrita na propria questão.
* A prova deverá ser entregue via _pull request_ com uma mensagem no seguinte formato: **_Numero de matricula - Nome completo_**
* Horário da prova: das 16:00 às ~~18:00~~ 19:00 horas do dia 7/10/2019. Provas entregues fora desse horário não serão aceitas. 

---

**Questão 1:** Responda cada um dos itens abaixo em um arquivo chamado _questao1.txt_. Ao terminar de responder a questão, crie um _commit_ com a seguinte mensagem: "Questão 1". Valor 20 pontos - 5 pontos cada resposta. 

a) Diferencie interfaces públicas de interfaces publicadas e justifique por que interfaces publicadas não devem ser refatoradas.  
b) Qual a diferença entre os maus cheiros "Cirurgia com rifle" e "Mudanças divergentes". Responda informando claramente os princípios de projetos que estão sendo violados em cada um dos maus-cheiros.  
c) Refatoração sempre leva a projetos mais eficientes em termo de desempenho. A afirmativa é verdadeira ou falsa? Justifique.  
d) Como se tem a garantia de que uma refatoração teve sucesso?  

---  
O código anexo a esse repositório é de uma aplicação em fase muito inicial de implementação. Trata-se de uma aplicação para controle de notas e frequencias das turmas de um professor. Faça o que se pede em cada uma das questões abaixo.

**Questão 2:** As classes _Aluno_, _Disciplina_, _Professor_ e _Turma_, em seus métodos construtores, podem disparar exceções sempre que o valor de um atributo obrigatório não foi informado. Toda exceção é disparada com uma mensagem informando qual foi o erro. A mensagem de exceção é formada no próprio construtor do objeto, o que torna-o confuso e difícil de ser entendido. Aplique **extrair método** nos trechos de código que formam tais mensagens de modo a tornar o construtor menos confuso. Ao terminar de responder a questão, crie um _commit_ com a seguinte mensagem: "Questão 1". Valor 20 pontos - 5 pontos cada.  


**Questão 3:** O método _ordenarAlunos_, presente na classe _CadastroAlunos_, possui duas instruções para formação da matrícula de um aluno no format _dd/ddddddd_ onde _d_ é um dígito. Aplique **extrair método** nessas instruções de modo a criar um método que retorne a matrícula no formato citado anteriormente. Ao terminar de responder a questão, crie um _commit_ com a seguinte mensagem: "Questão 3". Valor 10 pontos. 


**Questão 4:** Com base no resultado da refatoração aplicada na questão 3, aplique a refatoração _Substituir método por método objeto_ no método _ordenarAlunos_ da classe _CadastrarAlunos_. Ao terminar de responder a questão, crie um _commit_ com a seguinte mensagem: "Questão 4". Valor 50 pontos. 

