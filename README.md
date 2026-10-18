## Sistema de Validação de pedidos simples

### 2. Validador de Pedidos de E-commerce
Crie uma cadeia de validação para um `Pedido` (itens, cliente, endereço, forma de
pagamento) usando o padrão **Chain of Responsibility** ou interfaces funcionais.
Cada validador deve poder ser testado isoladamente.
- **Conceitos:** interfaces, composição, princípio de responsabilidade única (SRP).

# Padrão de Projeto: Chain of Responsibility

O **Chain of Responsibility** é um padrão de comportamento que permite passar uma requisição entre uma cadeia de objetos. Cada objeto tem a oportunidade de tratar a requisição, ou delegá-la para o próximo objeto na cadeia.

## Estrutura Principal:

- **Handler (Manipulador)**: Define uma interface para manipular solicitações. Também pode definir um link para o próximo handler na cadeia.
- **Concrete Handler (Implementação do Manipulador)**: Implementa a interface Handler. É responsável por tratar as solicitações que podem ser processadas.
- **Client (Cliente)**: Envia os pedidos para um dos manipuladores. Não conhece a estrutura da cadeia, nem qual objeto será o primeiro na cadeia.

## Benefícios:
- **Acoplamento Reduzido**: Handlers são independentes uns dos outros.
- **Flexibilidade**: Adicionar ou remover manipuladores sem alterar os clientes.
- **Centralização de Fluxo de Controle**: Controla as solicitações em uma única localização (cadeia).

## Quando Usar
- Quando é necessário passar uma solicitação entre vários objetos, não sabendo quem a processará.
- Quando o set de manipuladores for alterado dinamicamente.
- Quando se deseja reduzir acoplamento entre o cliente e os manipuladores.
## Exemplo em Python:
```python
class Handler:
    def __init__(self, successor=None):
        self.successor = successor

    def handle_request(self, request):
        if self.should_handle(request):
            self.handle(request)
        elif self.successor is not None:
            self.successor.handle_request(request)

    def should_handle(self, request):
        raise NotImplementedError(\"Subclasses must implement this!\")

    def handle(self, request):
        raise NotImplementedError(\"Subclasses must implement this!\")


class ConcreteHandler1(Handler):
    def should_handle(self, request):
        return 0 \u003c= request \u003c 5

    def handle(self, request):
        print(f\"ConcreteHandler1 handled {request}\")


class ConcreteHandler2(Handler):
    def should_handle(self, request):
        return 5 \u003c= request \u003c 10

    def handle(self, request):
        print(f\"ConcreteHandler2 handled {request}\")


class ConcreteHandler3(Handler):
    def should_handle(self, request):
        return True

    def handle(self, request):
        print(f\"ConcreteHandler3 handled {request}\")

# Criando a cadeia
handler1 = ConcreteHandler1()
handler2 = ConcreteHandler2()
handler3 = ConcreteHandler3()

handler1.successor = handler2
handler2.successor = handler3


# Enviando solicitações
requests = [4, 7, 10]
for request in requests:
    handler1.handle_request(request)
```

## Resumo:

O **Chain of Responsibility** é uma técnica eficaz para passar requisições entre diferentes objetos, onde cada objeto tem a oportunidade de lidar com ela ou delegá-la para o próximo. Ele promove acoplamento reduzido e flexibilidade na estrutura dos manipuladores, tornando-o ideal em cenários onde os responsáveis por tratar as solicitações podem variar dinamicamente.

Espero que este resumo ajude a entender melhor esse padrão de projeto

