package util;

import java.util.Scanner;

public class InterfaceUsuario {
    
    //Menu usuário | Escolher tipo de imóvel - Ap, Casa, Terreno.
    public static int pedirTipoImovel(Scanner scanner){
        int menuUser;
        int confirm;

        while (true) {
            System.out.print("Digite o tipo de imóvel a financiar pelo número do menu:\n\n1 - Apartamento\n2 - Casa\n3 - Terreno\n\nResposta:");

            //Testando input
            if(scanner.hasNextInt()) {
                menuUser = scanner.nextInt();

                //Apartamento, Casa, Terreno
                if(menuUser == 1){
                    System.out.print("Você escolheu: Apartamento.\nConfirma sua escolha?\n\n1 - Sim\n2 - Não\n\nResposta: ");

                    if(scanner.hasNextInt()){
                        confirm = scanner.nextInt();

                        if(confirm == 1){
                            return menuUser;
                        } else {
                            System.out.println("Voltando ao início do menu!");
                        }
                    } else {
                        System.out.println("Não entendi sua resposta. Volte desde o início.");
                    }

                //Casa
                } else if(menuUser == 2){
                    System.out.print("Você escolheu: Casa.\nConfirma sua escolha?\n\n1 - Sim\n2 - Não\n\nResposta: ");

                    if(scanner.hasNextInt()){
                        confirm = scanner.nextInt();

                        if(confirm == 1){
                            return menuUser;
                        } else {
                            System.out.println("Voltando ao início do menu!");
                        }
                    } else {
                        System.out.println("Não entendi sua resposta. Volte desde o início.");
                    }
                //Casa
                } else if(menuUser == 3){
                    System.out.print("Você escolheu: Terreno.\nConfirma sua escolha?\n\n1 - Sim\n2 - Não\n\nResposta: ");

                    if(scanner.hasNextInt()){
                        confirm = scanner.nextInt();

                        if(confirm == 1){
                            return menuUser;
                        } else {
                            System.out.println("Voltando ao início do menu!");
                        }
                    } else {
                        System.out.println("Não entendi sua resposta. Volte desde o início.");
                    }
                }
            
            } else {
                System.out.println("Valor digitado inválido. Por favor, tente novamente.\nSe certifique de estar digitando um número e que ele corresponde à opção desejada.");
            }
        }
    }
    
    //Pedidos universais
        //Pedido somente do valor total do imóvel | Se positivo | Se usa vírgula
        public static double pedirValorImovel(Scanner scanner) {
            double valorImovel;
            
            while (true) {
                System.out.print("Digite o valor total do seu imóvel: ");
                            
                //Testando se input voltou um double
                if(scanner.hasNextDouble()) {

                    valorImovel = scanner.nextDouble();

                    //Testando se input voltou um número positivo
                    if (valorImovel > 0){
                        return valorImovel;
                    } else {
                        System.out.println("Valor inválido. Por favor, tente novamente digitando seu valor contendo vírgula e sendo positivo.: '00,00'\n");
                    }

                //Testando se número voltou double com vírgula
                } else {
                    System.out.println("Valor inválido. Por favor, tente novamente digitando seu valor contendo vírgula e sendo positivo.: '00,00'\n");
                }
            }
        }
        

        //Pedido somente do valor anual do juros | Se positivo | Se usa vírgula
        public static double pedirTaxaJurosAnual(Scanner scanner) {
            double taxaJuros;

            while (true) {
                System.out.print("Digite a taxa de juros anual: ");

                //Testando se input voltou um double
                if (scanner.hasNextDouble()) {

                    taxaJuros = scanner.nextDouble();

                    //Testando se input voltou um número positivo
                    if (taxaJuros > 0) {
                        return taxaJuros;
                    } else {
                        System.out.println("Valor inválido. Por favor, digite um número positivo e com vírgula se existir. Segue exemplo: '1,2'\n");
                    }

                //Testando se número voltou double com vírgula
                } else {
                    System.out.println("Valor inválido. Por favor, digite um número positivo e com vírgula se existir. Segue exemplo: '1,2'\n");
                }
            }
        }


        //Pedido somente do prazo de pagamento em anos | Se positivo | Se inteiro
        public static int pedirPrazoFinanciamento(Scanner scanner) {
        int prazoFinanciamento;
        
        while (true) {
            System.out.print("Digite o prazo do seu financiamento em anos: ");


            //Testando se input voltou uma int
            if (scanner.hasNextInt()) {
            
                prazoFinanciamento = scanner.nextInt();

                //Testando se input voltou um número positivo
                if (prazoFinanciamento > 0) {
                    return prazoFinanciamento;
                } else {
                    System.out.println("Valor inválido. Por favor, digite um número positivo. Segue exemplo: '8'\n");
                }
            } else {
                System.out.println("Valor inválido. Por favor, digite um número positivo. Segue exemplo: '8'\n");
            }
        }
    }

    //Pedidos CASA
        //Pedido de tamanho da área construida
        public static double pedirAreaConstruida(Scanner scanner) {
            double areaConstruida;
            
            while (true) {
                System.out.print("Digite o tamanho da área construída: ");
                            
                //Testando se input voltou um double
                if(scanner.hasNextDouble()) {

                    areaConstruida = scanner.nextDouble();

                    //Testando se input voltou um número positivo
                    if (areaConstruida > 0){
                        return areaConstruida;
                    } else {
                        System.out.println("Valor inválido. Por favor, tente novamente digitando seu valor contendo vírgula e sendo positivo.: '00,00'\n");
                    }

                //Testando se número voltou double com vírgula
                } else {
                    System.out.println("Valor inválido. Por favor, tente novamente digitando seu valor contendo vírgula e sendo positivo.: '00,00'\n");
                }
            }
        }

        //Pedido de tamanho do terreno
        public static double pedirTamanhoTerreno(Scanner scanner) {
            double tamanhoTerreno;
            
            while (true) {
                System.out.print("Digite o tamanho total do terreno: ");
                            
                //Testando se input voltou um double
                if(scanner.hasNextDouble()) {

                    tamanhoTerreno = scanner.nextDouble();

                    //Testando se input voltou um número positivo
                    if (tamanhoTerreno > 0){
                        return tamanhoTerreno;
                    } else {
                        System.out.println("Valor inválido. Por favor, tente novamente digitando seu valor contendo vírgula e sendo positivo.: '00,00'\n");
                    }

                //Testando se número voltou double com vírgula
                } else {
                    System.out.println("Valor inválido. Por favor, tente novamente digitando seu valor contendo vírgula e sendo positivo.: '00,00'\n");
                }
            }
        }

    //Pedidos APARTAMENTO
        //Pedido número de vagas de garagem
        public static int pedirVagasGaragem(Scanner scanner) {
            int vagasGaragem;
            
            while (true) {
                System.out.print("Digite quantas vagas há na garagem: ");
                            
                //Testando se input voltou um int
                if(scanner.hasNextInt()) {

                    vagasGaragem = scanner.nextInt();

                    //Testando se input voltou um número positivo
                    if (vagasGaragem > 0){
                        return vagasGaragem;
                    } else {
                        System.out.println("Valor inválido. Por favor, tente novamente digitando seu valor inteiro e sendo positivo.: '5'\n");
                    }

                //Testando se número voltou int com vírgula
                } else {
                    System.out.println("Valor inválido. Por favor, tente novamente digitando seu valor contendo vírgula e sendo positivo.: '5'\n");
                }
            }
        }

        //Pedido andar do apartamento
        public static int pedirNumeroAndar(Scanner scanner) {
            int numeroAndar;
            
            while (true) {
                System.out.print("Digite o número do andar do apartamento: ");
                            
                //Testando se input voltou um int
                if(scanner.hasNextInt()) {

                    numeroAndar = scanner.nextInt();

                    //Testando se input voltou um número positivo
                    if (numeroAndar > 0){
                        return numeroAndar;
                    } else {
                        System.out.println("Valor inválido. Por favor, tente novamente digitando seu valor inteiro e sendo positivo.: '5'\n");
                    }

                //Testando se número voltou int com vírgula
                } else {
                    System.out.println("Valor inválido. Por favor, tente novamente digitando seu valor contendo vírgula e sendo positivo.: '5'\n");
                }
            }
        }

    //Pedidos TERRENO
        //Pedido tipo de zona
        public static String pedirTipoZona(Scanner scanner) {
            String tipoZona;
            int confirm;
            
            while (true) {
                System.out.print("Digite o tipo de zona do terreno:\n\n1 - Residencial\n2 - Comercial ");
                            
                //Testando se input voltou um double
                if(scanner.hasNextInt()) {

                    confirm = scanner.nextInt();

                    //Testando se input voltou um número positivo
                    if (confirm == 1){
                        tipoZona = "Residencial";
                        return tipoZona;
                    } else if(confirm == 2){
                        tipoZona = "Comercial";
                        return tipoZona;
                    } else {
                        System.out.println("Valor inválido. Por favor, tente novamente digitando seu valor inteiro e sendo positivo.: '5'\n");
                    }

                //Testando se número voltou double com vírgula
                } else {
                    System.out.println("Valor inválido. Por favor, tente novamente digitando seu valor contendo vírgula e sendo positivo.: '5'\n");
                }
            }
        }
}