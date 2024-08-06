# MyBankAppJava

MyBankAppJava é um aplicativo de banco simples escrito em Java, que permite registrar um cliente, autenticar-se e realizar operações básicas como depósito, saque e verificação de saldo. Este projeto demonstra a utilização de parâmetros passados pela linha de comando e manipulação de entradas do usuário usando a classe `Scanner` em Java.

## Funcionalidades

- Registro de cliente com ID, nome, senha e saldo inicial.
- Autenticação do cliente usando ID e senha.
- Opções de menu para realizar depósitos, saques e verificar o saldo.
- Interface de linha de comando interativa.

## Pré-requisitos

- Java 11 ou superior.
- Maven (opcional, para gerenciamento de dependências e build).

## Instalação

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/MarquisWolfbloodofRaven/pooport/MyBankAppJava.git
   cd MyBankAppJava
Compilar o projeto:

Compile o código fonte com o javac:

bash
Copiar código
javac -d target/classes src/main/java/com/mybankappjava/Main.java
Se estiver usando Maven, você pode executar:

bash
Copiar código
mvn clean package
Executar o aplicativo:

Execute o aplicativo passando os parâmetros de linha de comando:

bash
Copiar código
java -cp target/classes com.mybankappjava.Main <id> <name> <password> <initialBalance>
Exemplo:

bash
Copiar código
java -cp target/classes com.mybankappjava.Main 1 John 1234 100.0
Uso
Registro do Cliente:

Após a execução do programa, o cliente será registrado com os parâmetros fornecidos: ID, nome, senha e saldo inicial.

Autenticação:

Após o registro, o cliente será solicitado a autenticar-se fornecendo o ID e a senha.

Menu de Opções:

Se a autenticação for bem-sucedida, um menu será exibido com as seguintes opções:

1. Deposit: Adiciona um valor ao saldo.
2. Withdraw: Retira um valor do saldo.
3. Check Balance: Exibe o saldo atual.
4. Exit: Encerra o aplicativo.
Exemplo
bash
Copiar código
java -cp target/classes com.mybankappjava.Main 1 John 1234 100.0
Entrada esperada:

mathematica
Copiar código
Enter your ID: 1
Enter your password: 1234
Authentication successful!
Choose one of the options:
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Contribuições
Sinta-se à vontade para contribuir com melhorias e correções. Você pode abrir um pull request ou relatar problemas usando o issues tracker.

Licença
Este projeto está licenciado sob a MIT License.

Contato
Se você tiver alguma dúvida ou sugestão, sinta-se à vontade para entrar em contato:

Email: marquis1118dc@gmail.com
GitHub: MarquisWolfbloodRaven
