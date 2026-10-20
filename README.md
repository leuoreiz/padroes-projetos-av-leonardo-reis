# Padrões de Projetos — Soluções para estudo

Nome completo: Leonardo Reis de Campos  
Turma: __________________ (preencher)

## Questão 1: Factory Method

O produto abstrato é iPassagem. As passagens concretas implementam essa interface. EmissorPassagem é o criador abstrato e declara o método fábrica criarPassagem. Cada emissor especializado decide qual produto criar.

O método final emitir centraliza criação, cálculo e impressão. Ele depende apenas de iPassagem. Main instancia somente os emissores. Para incluir o modal marítimo, criam-se PassagemMaritima e EmissorMaritima, sem modificar as classes existentes; um cliente novo pode usar esse emissor.

Exemplos: tarifa aérea 1000 → taxa 80,00; rodoviária 200 → taxa 6,00; ferroviária 300 → taxa 15,00.

## Questão 2: Abstract Factory

iFabricaMatricula define os três métodos de criação da família. FabricaBrasil cria NFSe, Pix e ComprovanteBrasil; FabricaChile cria BoletaElectronica, Webpay e ComprovanteChile.

Matricula<P> recebe uma única iFabricaMatricula<P> no construtor, mantém essa referência final e cria todos os produtos por ela. Não recebe produtos externos, não instancia produtos concretos e não possui seleção por país.

Para atender de modo mais estrito ao RNF01, as abstrações possuem um parâmetro genérico P extends iPais. Brasil e Chile são marcadores de tipo, não objetos de configuração. iFabricaMatricula<Brasil> só retorna iDocumentoFiscal<Brasil>, iPagamento<Brasil> e iComprovanteMatricula<Brasil>. Retornar new Webpay() na fábrica brasileira resulta em erro de compilação porque Webpay implementa iPagamento<Chile>.

Esse recurso reforça o Abstract Factory ensinado nos slides. A versão convencional da aula agrupa produtos pela fábrica; o parâmetro genérico adiciona verificação da família pelo compilador. Como em qualquer uso de genéricos Java, tipos raw e casts não verificados devem ser evitados. Uma implementação nova continua responsável por produzir descrições corretas.

Um novo país requer um marcador que implemente iPais, novos produtos e uma nova fábrica, sem alteração de Matricula. Para valor de curso 1000, o ISS é 50,00 e o IVA é 190,00. Os valores são demonstrativos nas respectivas moedas locais, sem conversão cambial. CPF e RUT usados no exemplo são fictícios. Os artefatos simulam o comportamento com descrições, sem integrações externas.

## Material de referência

Estrutura baseada nos exemplos de aula: interfaces com prefixo i, classes concretas com implements, herança com extends, @Override e cliente com main. Na questão 1, o criador abstrato adiciona o procedimento único de emissão exigido pelo enunciado. Códigos sem comentários.

## Compilar e executar

Requer JDK 8 ou superior. Na raiz do repositório:

```sh
javac -encoding UTF-8 -d questao1/out questao1/src/*.java
java -cp questao1/out Main
javac -encoding UTF-8 -d questao2/out questao2/src/*.java
java -cp questao2/out Main
```

As duas classes Main devem ser compiladas em diretórios separados.

## Diagramas

Cada questão contém JPG para visualização e PNG para entrega no formato aceito no enunciado. Os arquivos PlantUML também estão incluídos e detalham todas as assinaturas.

## Validação

Ambas as questões foram compiladas e executadas. Foram conferidas as taxas e os impostos dos exemplos. A questão 1 também foi exercitada com um novo modal em classes separadas, sem alterar as classes originais. Na questão 2, uma tentativa de retornar Webpay como pagamento brasileiro foi rejeitada pelo compilador.

As saídas esperadas estão em questao1/saida-esperada.txt e questao2/saida-esperada.txt. As duas classes Main usam valores de exemplo, sem entrada pelo teclado.
