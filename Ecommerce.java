package Programa;

import java.util.*;

public class Ecommerce {
	
		
			
			public static void main(String[] args) {
		        Scanner leia = new Scanner(System.in);
		        //final String NUMBER_MAXIMO;
		        String mercadoria[] = {"Playstation5", "Playstation4", "FifaUltimate", " XboxOne ", "   Gta ", "Controle PS5", "Controle PS4", "  Cabo Hdmi  ", "  Controle U  ", "TecladoGamer"};
		        int unidades[] = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
		        double preco[] = {500.00, 200.00, 299.00, 300.00, 245.00, 200.00, 140.00, 129.00, 130.00, 140.00};
		        boolean continua;
		        char cont = ' ';
		        char continuar2;
		        boolean continua2 = true;
		        String codigo3;
		        String codigo4[] = new String[mercadoria.length];
		        String codigo[] = new String[mercadoria.length];
		        char pagamento = '0';
		        double imposto;
		        int qntd = 0;
		        String comprador[] = new String[2];
		        int x;
		        int compras[] = new int [10];
		        double total = 0.0, parcelas = 0.0;
		        char op = ' ';
		        double preco2;
		        char opp = ' ';
		        char inicio = ' ';
		        String aq [] = new String [2];
		        String sorte;
		        int vem = 0;
		        

		        System.out.println("Digite seu nome: ");
		        comprador[0] = leia.next();
		        

		        for (int y = 0; y < 10; y++) {
		            if (y > 8) {
		                codigo4[y] = "G" + (y + 1);
		            } else {
		                codigo4[y] = "G0" + (y + 1);
		            }

		        }
		        
		        System.out.println("                          Ola " + comprador[0] );
		        System.out.println("             --------Bem Vindo a Smart Gamer!-------------");
		        System.out.println("             -------Novo mundo ao seu alcance!------------");
		        System.out.println("\n");
		        System.out.println("Gostaria de realizar Compras? digite S para sim e N para não");
		        inicio = leia.next().toUpperCase().charAt(0);
		        
		        while (inicio != 'S') {
		        	System.out.println("Digite seu nome: ");
			        comprador[0] = leia.next();
		        	System.out.println("                          Ola " + comprador[0] );
			        System.out.println("             --------Bem Vindo a Smart Gamer!-------------");
			        System.out.println("             -------Novo mundo ao seu alcance!------------");
			        System.out.println("\n");
			        System.out.println("Gostaria de realizar Compras? digite S para sim e N para não");
			        inicio = leia.next().toUpperCase().charAt(0);
		        	
		        }
		        
		        
		        do {
		        	do {
		            do {
		                // Liste os produtos a disposição
		                System.out.print("\nCOD:\t" + " PRODUTOS:\t" + "VALOR:\t" + "ESTOQUE:\n");
		                for (int i = 0; i < 10; i++) {

		                    System.out.println(codigo4[i] + " \t " + mercadoria[i] + "\t " + preco[i] + "\t " + unidades[i]);
		                    

		                }

		                System.out.println("\n");
		                System.out.println("Nossos estoques contam com 10 unidades de cada produto. Boas Compras!");
		                // Pedir código do produto a ser comprado
		         
		                System.out.print("\nDigite o código do produto que deseja comprar: ");
		                codigo3 = leia.next().toUpperCase();
		                
		                for (int r = 0; r < 10; r++) {
		                    if (codigo3.equals(codigo4[r])) {		                    	
		                        System.out.println("O produto selecionado: ");
		                        System.out.println(mercadoria[r] + "\nPreço Final: R$" + preco[r] + "\nEstoque: " + unidades[r]);
		                        System.out.print("Digite a quantidade que deseja: ");
			                    qntd = leia.nextInt();
			                   
		                    }
		                    		
		                }
		                for (int o = 0; o < 10; o++) {
		                if (codigo3 != codigo4[o]){
		                	System.out.print("Digite alguma tecla e precione enter para continuar ");
		                	sorte = leia.next();
		                	break;
		                }
		                }

		                for (int f = 0; f < 10; f++ ) {
		                	if (codigo3.equals(codigo4[f])) {
		                while (qntd < 1 || qntd > unidades[f]) {
		                    for (int g = 0; g < 10; g++) {
		                    	if (codigo3.equals(codigo4[g])) {		                    		
		                    	System.out.println("\nQuantidade indisponivel, escreva uma quantidade acima de 0 e abaixo de" + " " + unidades[g] + " " + "unidades de " + mercadoria[g]);
		                        qntd = leia.nextInt();
		                    }
		                }

		                }
		                	}
		                }
		            	        
		        
		     	for (int t = 0; t < 10; t++) {
				if (codigo3.equals(codigo4[t]) && qntd <= unidades[t]) {
					compras[t] = compras[t] + qntd;
					vem = compras[t];
					unidades[t] = unidades[t] - qntd;
					total += (preco[t] * qntd);
					System.out.println("Você selecionou " + qntd + " unidades de " + mercadoria[t]);
					
					 if(qntd < 1 || qntd > 10) {
						System.out.println("Não há unidades o suficiente disponível em estoque.");
						System.out.println("Estoque: " + unidades[t] + " unidades de " + mercadoria[t] );
					break;
				}
				} 
				
		
				}
				
					
			
	for(x= 0; x < 10; x++) {
		// Loop pelo vetor de compras e confira, caso haja compras, imprimir a relação para o usuário
		if (compras[x] != 0) {
			System.out.println("\nExistem " + unidades[x] + " unidades restantes de " + mercadoria[x] );
		}
	}
		             
		            	 
	System.out.print("\nDeseja continuar comprando? S para sim / N para não: ");
	cont = leia.next().charAt(0);
	

		            }
	
		
		while (cont == 'S' || cont == 's');
			
		        	
		        	} while (vem == 0);
		            
			System.out.print("\nVocê finalizou suas compras!\n");
			System.out.println("Seu carrinho:\n\n");
// Listar as compras no carrinho
for (int f = 0; f < 10; f++) {	
	if (compras[f] != 0) {
		System.out.println(compras[f] + " unidades de " + mercadoria[f] + "\n");
		System.out.println("\n------------------\n");
		
	}
}
		imposto = total * 0.09;
				
				 System.out.println("O valor total de sua compra foi: R$ " + total + " e R$ " + imposto + " de impostos\n");
				 System.out.println("Opções de pagamento: ");
				 System.out.println("1 - Á vista em dinheiro ou cheque(20% de desconto)\"");
				 System.out.println("2 - Em duas vezes(sem desconto)");
				 System.out.println("3 - 3x no cartão (10% de juros)\n");
				 
				 do{
				 
				 System.out.print("Digite a forma de pagamento\n");
				 pagamento = leia.next().charAt(0);
				 if(pagamento == '1') {
					 total = total - (total * 0.2);
							 
					 }else if (pagamento == '2') {
						 total = total - (total * 0.15);
					 }else if (pagamento == '3') {
						 total = total;
					 }else if (pagamento == '4') {
						 total = total + (total * 0.1);
					 }else {
						 System.out.print("\nEscolha uma forma de pagamento válida\n" );
					 }
				 } while (pagamento != '1' && pagamento != '2' && pagamento != '3' && pagamento != '4');
				 
				 System.out.println("Gostaria de informar o CPF na Nota Fiscal, S ou N?" );
				 opp = leia.next().toUpperCase().charAt(0);
				 
				 if (opp == 'S') {
					 System.out.print("Informa o CPF ");
					 comprador[1] = leia.next();
					 System.out.println("---------------------------------------");
				        System.out.println("\n"+"Lojas Games - 572.198.047/0001-77\n");
				        System.out.println("\n------------------------------------\n");
				        System.out.println("Comprador: "+comprador[0] + " - CPF: " + comprador[1] );
						for (x = 0; x < 10; x++) {
							if (compras[x] != 0) {
								System.out.println(compras[x] + "\t" + mercadoria[x] + "\t R$ " + preco[x]);
								compras[x] = 0;
				 }
				 
						}
					}
				 else {
					 
						 System.out.println("---------------------------------------");
					        System.out.println("\n"+"Lojas Games - 572.198.047/0001-77");
					        System.out.println("\n------------------------------------");
					        System.out.println("Comprador "+comprador[0]);
							for (x = 0; x < 10; x++) {
								if (compras[x] != 0) {
									System.out.println(compras[x] + "\t" + mercadoria[x] + "\t R$ " + preco[x] );
									compras[x] = 0;
									
									
				 }
							}
					 }
				 
					System.out.println("\n");
					
					System.out.println("Imposto de ICMS R$ " + imposto);
					System.out.println("\n------------------------------------");
					System.out.println("Total da nota: R$ " + (total + imposto) * 2 + "\n");
					System.out.println("--------------------------------------\n");
					
					
					if (pagamento == '3') {
						parcelas = total / 2;
								System.out.println("Pagar em 2x de R$ " + (parcelas * 2) + "\n");
					} else  if (pagamento == '4') {
						parcelas = total / 3;
								System.out.println("Pagar em 3x de R$ " + (parcelas * 2) + "\n");
					}
					
					System.out.println("Deseja comprar mais? S para sim / N para não \n");
					continuar2 = leia.next().charAt(0);
			     	
				}
					while (continuar2 =='S' || continuar2 == 's');

		        System.out.println("             Obrigado por comprar na Smart Gamer!");		
				System.out.println("Para saber mais sobre nossos produtos, visite nosso site Smartgamer.com.br ");
				System.out.println("                        Ate Breve!");
							
				 
	}
}


