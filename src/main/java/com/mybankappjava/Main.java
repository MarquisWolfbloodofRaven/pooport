package com.mybankappjava;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        if (args.length < 4) {
            System.out.println("Usage: java Main <id> <name> <password> <initialBalance>");
            return;
        }

        // Ler parâmetros da linha de comando
        int id = Integer.parseInt(args[0]);
        String name = args[1];
        int password = Integer.parseInt(args[2]);
        double initialBalance = Double.parseDouble(args[3]);

        // Criar o cliente usando os parâmetros
        Client client = new Client(id, name, password, initialBalance);

        // Autenticação do cliente
        if (client.authenticate()) {
            client.menuOptionsForClient();
        } else {
            System.out.println("Failed to authenticate. Exiting...");
        }
    }

    public static class Client {
        private int id;
        private double balance;
        private int password;

        // Construtor com parâmetros
        public Client(int id, String name, int password, double initialBalance) {
            this.id = id;
            this.password = password;
            this.balance = initialBalance;
        }

        // Método de autenticação e outros métodos omitidos para simplicidade
        public boolean authenticate() {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.print("Enter your ID: ");
                int inputId = scanner.nextInt();
    
                System.out.print("Enter your password: ");
                int inputPassword = scanner.nextInt();
    
                if (inputId == this.id && inputPassword == this.password) {
                    System.out.println("Authentication successful!");
                    return true;
                } else {
                    System.out.println("Authentication failed. Please try again.");
                    return false;
                }
            } finally {
                //scanner.close();
            }
        }

        public void menuOptionsForClient() {
            Scanner scanner = new Scanner(System.in);
            int choice;

            do {
                System.out.println("Choose one of the options:");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");

                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        deposit(scanner);
                        break;
                    case 2:
                        withdraw(scanner);
                        break;
                    case 3:
                        checkBalance();
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } while (choice != 4);
        }

        private void withdraw(Scanner scanner) {
            System.out.println("Enter the amount to withdraw:");
            double amount = scanner.nextDouble();
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal successful! New balance: " + balance);
            } else {
                System.out.println("Invalid amount or insufficient funds.");
            }
        }

        private void deposit(Scanner scanner) {
            System.out.println("Enter the amount to deposit:");
            double amount = scanner.nextDouble();
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposit successful! New balance: " + balance);
            } else {
                System.out.println("Invalid amount.");
            }
        }

        private void checkBalance() {
            System.out.println("Current balance: " + balance);
        }
    }
}
