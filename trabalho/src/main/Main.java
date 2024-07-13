//            _____                    _____                    _____                   _______         
//           /\    \                  /\    \                  /\    \                 /::\    \        
//          /::\    \                /::\    \                /::\    \               /::::\    \       
//          \:::\    \              /::::\    \              /::::\    \             /::::::\    \      
//           \:::\    \            /::::::\    \            /::::::\    \           /::::::::\    \     
//            \:::\    \          /:::/\:::\    \          /:::/\:::\    \         /:::/~~\:::\    \    
//             \:::\    \        /:::/  \:::\    \        /:::/__\:::\    \       /:::/    \:::\    \   
//             /::::\    \      /:::/    \:::\    \      /::::\   \:::\    \     /:::/    / \:::\    \  
//    ____    /::::::\    \    /:::/    / \:::\    \    /::::::\   \:::\    \   /:::/____/   \:::\____\ 
//   /\   \  /:::/\:::\    \  /:::/    /   \:::\ ___\  /:::/\:::\   \:::\    \ |:::|    |     |:::|    |
//  /::\   \/:::/  \:::\____\/:::/____/  ___\:::|    |/:::/  \:::\   \:::\____\|:::|____|     |:::|    |
//  \:::\  /:::/    \::/    /\:::\    \ /\  /:::|____|\::/    \:::\  /:::/    / \:::\    \   /:::/    / 
//   \:::\/:::/    / \/____/  \:::\    /::\ \::/    /  \/____/ \:::\/:::/    /   \:::\    \ /:::/    /  
//    \::::::/    /            \:::\   \:::\ \/____/            \::::::/    /     \:::\    /:::/    /   
//     \::::/____/              \:::\   \:::\____\               \::::/    /       \:::\__/:::/    /    
//      \:::\    \               \:::\  /:::/    /               /:::/    /         \::::::::/    /     
//       \:::\    \               \:::\/:::/    /               /:::/    /           \::::::/    /      
//        \:::\    \               \::::::/    /               /:::/    /             \::::/    /       
//         \:::\____\               \::::/    /               /:::/    /               \::/____/        
//          \::/    /                \::/____/                \::/    /                 ~~              
//           \/____/                                           \/____/
//            _____                   _______                   _____                    _____                    _____                   _______                   _____          
//           /\    \                 /::\    \                 /\    \                  /\    \                  /\    \                 /::\    \                 /\    \         
//          /::\    \               /::::\    \               /::\    \                /::\    \                /::\    \               /::::\    \               /::\    \        
//         /::::\    \             /::::::\    \             /::::\    \               \:::\    \              /::::\    \             /::::::\    \             /::::\    \       
//        /::::::\    \           /::::::::\    \           /::::::\    \               \:::\    \            /::::::\    \           /::::::::\    \           /::::::\    \      
//       /:::/\:::\    \         /:::/~~\:::\    \         /:::/\:::\    \               \:::\    \          /:::/\:::\    \         /:::/~~\:::\    \         /:::/\:::\    \     
//      /:::/  \:::\    \       /:::/    \:::\    \       /:::/  \:::\    \               \:::\    \        /:::/  \:::\    \       /:::/    \:::\    \       /:::/__\:::\    \    
//     /:::/    \:::\    \     /:::/    / \:::\    \     /:::/    \:::\    \              /::::\    \      /:::/    \:::\    \     /:::/    / \:::\    \      \:::\   \:::\    \   
//    /:::/    / \:::\    \   /:::/____/   \:::\____\   /:::/    / \:::\    \    ____    /::::::\    \    /:::/    / \:::\    \   /:::/____/   \:::\____\   ___\:::\   \:::\    \  
//   /:::/    /   \:::\    \ |:::|    |     |:::|    | /:::/    /   \:::\ ___\  /\   \  /:::/\:::\    \  /:::/    /   \:::\ ___\ |:::|    |     |:::|    | /\   \:::\   \:::\    \ 
//  /:::/____/     \:::\____\|:::|____|     |:::|    |/:::/____/     \:::|    |/::\   \/:::/  \:::\____\/:::/____/  ___\:::|    ||:::|____|     |:::|    |/::\   \:::\   \:::\____\
//  \:::\    \      \::/    / \:::\    \   /:::/    / \:::\    \     /:::|____|\:::\  /:::/    \::/    /\:::\    \ /\  /:::|____| \:::\    \   /:::/    / \:::\   \:::\   \::/    /
//   \:::\    \      \/____/   \:::\    \ /:::/    /   \:::\    \   /:::/    /  \:::\/:::/    / \/____/  \:::\    /::\ \::/    /   \:::\    \ /:::/    /   \:::\   \:::\   \/____/ 
//    \:::\    \                \:::\    /:::/    /     \:::\    \ /:::/    /    \::::::/    /            \:::\   \:::\ \/____/     \:::\    /:::/    /     \:::\   \:::\    \     
//     \:::\    \                \:::\__/:::/    /       \:::\    /:::/    /      \::::/____/              \:::\   \:::\____\        \:::\__/:::/    /       \:::\   \:::\____\    
//      \:::\    \                \::::::::/    /         \:::\  /:::/    /        \:::\    \               \:::\  /:::/    /         \::::::::/    /         \:::\  /:::/    /    
//       \:::\    \                \::::::/    /           \:::\/:::/    /          \:::\    \               \:::\/:::/    /           \::::::/    /           \:::\/:::/    /     
//        \:::\    \                \::::/    /             \::::::/    /            \:::\    \               \::::::/    /             \::::/    /             \::::::/    /      
//         \:::\____\                \::/____/               \::::/    /              \:::\____\               \::::/    /               \::/____/               \::::/    /       
//          \::/    /                 ~~                      \::/____/                \::/    /                \::/____/                 ~~                      \::/    /        
//           \/____/                                           ~~                       \/____/                                                                    \/____/              

package main;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import modelo.*;
import util.*;

public class Main {
    public static void main(String[] args) {
        //Declarar atributos + iniciar.
        var financiamentos = new ArrayList<Financiamento>();
        double totalImoveis = 0;
        double totalFinanciamentos = 0;

        Scanner scanner = new Scanner(System.in);

        
        //Criando as listas de casa e Ap | Pedindo valores de Terreno ao usuário
            //Casas
            financiamentos.add(new Casa(300000, 10, 24, 150, 200));
            financiamentos.add(new Casa(500000, 10, 24, 150, 200));

            //Aps
            financiamentos.add(new Apartamento(300000, 10, 24, 1, 5));
            financiamentos.add(new Apartamento(500000, 10, 24, 1, 5));


            
            //Pedido de parâmetros ao usuário
            int menuUser;
            double valorImovel;
            double taxaJurosAnual;
            int prazoFinanciamento;

            //Casa
            double areaConstruida;
            double tamanhoTerreno;

            //Ap
            int vagasGaragem;
            int numeroAndar;

            //Terreno
            String zona;


            menuUser = InterfaceUsuario.pedirTipoImovel(scanner);
            valorImovel = InterfaceUsuario.pedirValorImovel(scanner);
            taxaJurosAnual = InterfaceUsuario.pedirTaxaJurosAnual(scanner);
            prazoFinanciamento = InterfaceUsuario.pedirPrazoFinanciamento(scanner);
            
            if(menuUser == 1){
                vagasGaragem = InterfaceUsuario.pedirVagasGaragem(scanner);
                numeroAndar = InterfaceUsuario.pedirNumeroAndar(scanner);

                financiamentos.add(new Apartamento(valorImovel, taxaJurosAnual, prazoFinanciamento, vagasGaragem, numeroAndar));
            } else if(menuUser == 2){
                areaConstruida = InterfaceUsuario.pedirAreaConstruida(scanner);
                tamanhoTerreno = InterfaceUsuario.pedirTamanhoTerreno(scanner);

                financiamentos.add(new Casa(valorImovel, taxaJurosAnual, prazoFinanciamento, areaConstruida, tamanhoTerreno));
            } else {
                zona = InterfaceUsuario.pedirTipoZona(scanner);

            financiamentos.add(new Terreno(valorImovel, taxaJurosAnual, prazoFinanciamento, zona));
            }
            


        
        for (Financiamento financiamento : financiamentos) {
            totalImoveis += financiamento.getValorImovel();
            totalFinanciamentos += financiamento.calcularTotal();
        }


        //prints
        System.out.println("Exemplo de Financiamentos:");
        for (int i = 0; i < financiamentos.size(); i++) {
            System.out.printf("===============\nFinanciamento %d:\n- Valor do imóvel: R$%.2f\n- Valor do financiamento: R$%.2f%n================\n", i + 1, financiamentos.get(i).getValorImovel(), financiamentos.get(i).calcularTotal());
        }

        System.out.printf("Total de todos os imóveis: R$%.2f, total de todos os financiamentos: R$%.2f%n", totalImoveis, totalFinanciamentos);


    }

        private static void salvarDadosEmArquivo(ArrayList<Financiamento> financiamentos) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("financiamentos.dat"))) {
            outputStream.writeObject(financiamentos);
            System.out.println("Dados salvos no arquivo.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar os dados no arquivo: " + e.getMessage());
        }
    }
}