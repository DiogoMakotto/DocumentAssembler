# Document Assembler

Desenvolvido em java para validação do desafio do setor de desenvolvimento(Looplex).

O AppDocumentAssembler recebe o input do texto através do trecho main:

```
    public static void main(String[] args) throws Exception {
        
        branch base =new branch();
        branch branch1 =new branch();
        branch branch2 =new branch();

        base.addNode(new leaf("Texto"));//ponto inicial para ciração de documento e nó 0
        base.addNode(branch1);

        branch1.addNode(new leaf("exemplo")); 
        branch1.addNode(new leaf("para"));
        branch1.addNode(branch2);

        branch2.addNode(new leaf("criação"));
        branch2.addNode(new leaf("de documento"));

        AppDocumentBuilder var = new AppDocumentBuilder(base, new ordemTransversal(), "document.txt");
        va
```

Criando a estrutura de árvore, que foi desenvolvida com base no diagrama UML disponibilizado no desafio (branch e leaf), implantando uma classe abstrata nomeada de "node" (nó) separados antecipadamente por um inteiro chamado de "nivel" e "altura".
Foram criados e métodos de acesso, adição e remoção de seus subnós (leaf ou folhas), que são gerenciados por uma lista de array simples. 

*Métodos de impressão* (2 formas do conteúdo ser printado): 
- consoleBuilder que retorna o texto construído no terminal
- txtBuilder que retorna o texto num txt indicado na construção do document assembler.

Mecanismo de monitoramento escolhido foi através de logs com a data de criação do documento (Data + Horario utilizando a lib java.time.LocalDate).

Foi utilizado o método __Composite__ um padrão de projeto de software utilizado para representar um objeto formado pela composição de objetos similares no caso uma arvore.