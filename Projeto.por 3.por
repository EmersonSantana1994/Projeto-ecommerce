programa
{
	inclua biblioteca Matematica-->mat
	inclua biblioteca Texto
	inclua biblioteca Tipos
	
	funcao inicio()
	{
	cadeia mercadoria[10]= {"Playstation5","Playstation4","FifaUltimate"," XboxOne ","   Gta ","Controle PS5","Controle PS4","  Cabo Hdmi  ","  Controle U  ","TecladoGamer"}
     inteiro unidades [10] ={10,10,10,10,10,10,10,10,10,10}
     real preco [10] ={500.00,200.00,299.00,300.00,245.00,200.00,140.00,129.00,130.00,140.00}
     logico continua
     caracter cont = ' '
     caracter continuar2
     logico continua2 = verdadeiro
     cadeia codigo3
     cadeia codigo4 [10]
     cadeia codigo [10]
     caracter pagamento = '0'
     real imposto
     inteiro qntd = 0
     cadeia comprador[2]
	inteiro x
	inteiro compras[10]
	real total = 0.0, parcelas = 0.0
	caracter op = ' '


	escreva("Digite seu nome: \n")
		leia(comprador[0])
		escreva("Digite seu CPF: \n")
		leia(comprador[1])

		para(inteiro y = 0 ; y < 10; y++){
		se(y > 8) {
		codigo4[y] = "G-"+ (y+1)
		}
		senao
		{
			codigo4[y] = "G-0" + (y+1)
		}

	
		}
			limpa()
		
     escreva ("--------Bem Vindo a Smart Gamer!-------------\n")
	escreva ("-------Novo mundo ao seu alcance!------------\n")
	escreva("\n")
     		faca{
     		faca {
		// Liste os produtos a disposição
		escreva("\nCOD:\t"," PRODUTOS:\t" ,  "VALOR:\t" ,  "ESTOQUE:\n")
		
	  	para(inteiro i = 0 ; i < 10; i++){
			escreva(codigo4[i] + " \t ",mercadoria[i],"\t ",mat.arredondar(preco[i],2), "\t ", unidades[i])
			escreva("\n")
		}
		escreva("\n")
		escreva("Nossos estoques contam com 10 unidades de cada produto. Boas Compras!")
			// Pedir código do produto a ser comprado
			escreva("\nDigite o código do produto que deseja comprar: \n")
			leia(codigo3)
			para (inteiro r = 0; r < 10; r++) {
				se (codigo3 == codigo4[r]){
					escreva("O produto selecionado: ")
					escreva(+ mercadoria[r],"\nPreço Final: R$",mat.arredondar(preco[r],2), "\nEstoque: ", unidades[r])
					escreva("\nConfirmar pedido S/N:  ")
					leia(op)
				}
			}
					se (op == 'S' ou op == 's') {
							escreva("\nDigite a quantidade que deseja: \n")
							leia(qntd)
					}
					para (inteiro m = 0; m < 10; m++) {
						se (codigo3 == codigo4[m] ) {
					enquanto (qntd < 1 ou qntd > unidades[m])  {
						para  (inteiro g = 0; g < 10; g++){
							se (codigo3 == codigo4[g] ) {
								escreva("\nQuantidade indisponivel, escreva uma quantidade acima de 0 e abaixo de" + " " + unidades[g]+ " "+ "unidades de " + mercadoria[g]+ " " )
							 	leia(qntd)
							}
					}
					}
					}
					}
						// Caso a quantidade escolhida seja menor ou igual a quantidade de unidades em estoque,
						// adicionar a quantidade à compra e subtrair a quantidade das unidades em estoque
						para (inteiro t = 0; t < 10; t++) {
						se (codigo3 == codigo4[t] e qntd <= unidades[t]) {
							compras[t] = compras[t] + qntd
							unidades[t] = unidades[t] - qntd
							total += (preco[t] * qntd)
							escreva("Você selecionou " + qntd + " unidades de " + mercadoria[t] + "\n")
							
							 se(qntd < 1 ou qntd > 10) {
							escreva("Não há unidades o suficiente disponível em estoque!!\n")
							escreva("Estoque: " + unidades[t] + " unidades de " + mercadoria[t] + "\n")
							pare
						}
						} 
						}
			para(x= 0; x < 10; x++) {
				// Loop pelo vetor de compras e confira, caso haja compras, imprimir a relação para o usuário
				se (compras[x] != 0) {
					escreva("\nRestam " + unidades[x] + " unidades de :" + mercadoria[x] + "\n")
				}
			}
			escreva("\nDeseja continuar comprando S/N: \n")
			leia(cont)
			limpa()
     		}
     		enquanto (cont == 'S' ou cont == 's')
					
			// Alterar o valor da variável continua de verdadeiro para falso, caso o usuário decida não continuar comprando
			// fazendo assim que o loop do carrinho se quebre
			
					

		escreva("\nVocê finalizou suas compras!\n")
		escreva("Seu carrinho:\n\n")
		// Listar as compras no carrinho
		para (x = 0; x < 10; x++) {	
			se (compras[x] != 0) {
				escreva(compras[x] + " unidades de " + mercadoria[x] + "\n")
				escreva("\n----------------------------------------------------------------------\n")
			}
		}
		// Calcular imposto e mostrar opções de pagamento
		imposto = total * 0.09
		escreva("O valor total de sua compra foi: R$ " + total + " e R$ " + imposto + " de impostos\n")
		escreva("Opções de pagamento: ")
		escreva("\n1 - Á vista em dinheiro ou cheque(10% de desconto)")
		escreva("\n2 - A vista no cartão de crédito(15% de desconto)")
		escreva("\n3 - Em duas vezes(15% de acréscimo)")
		
		// Pergunte a forma de pagamento até que seja respondido uma forma válida
		faca {
			escreva("\nDigite a forma de pagamento: \n")
			leia(pagamento)
			se (pagamento == '1') {
				total = total - (total * 0.1)
			} senao se (pagamento == '2') {
				total = total - (total * 0.10)
			} senao se (pagamento == '3') {
				total = total + (total * 0.15)
			} senao {
				escreva("\nEscolha uma forma de pagamento válida!!\n")
			}
		} enquanto (pagamento != '1' e pagamento != '2' e pagamento != '3')
		/*
			NOME DA LOJA - CNPJ
			NOME DO COMPRADOR - CPF	
			Loop (valor de cada produto):
				quantidae - produto - valor do produto
			valor do imposto
			forma de pagamento
			valor total da nota
		*/
		limpa()
		escreva("\n-----------------------------------\n")
		escreva("\"Smart Gamer - 572.198.047/0001-77\n")
		escreva("\n-----------------------------------\n")
		escreva("Nome: "+comprador[0] + "\nCPF: " + comprador[1] + "\n")
		escreva("\n")
		escreva("\n")
		escreva("QUANTIDADE:\tPRODUTO:\tPREÇO: ")
		para (x = 0; x < 10; x++) {
			se (compras[x] != 0) {
				escreva("\n")
				escreva(compras[x] + "\t\t" + mercadoria[x] + " \tR$" + preco[x] + "\n")
				escreva("\n")
			}
		}
		escreva("\n")
		escreva("Imposto de ICMS R$ " + mat.arredondar(imposto, 2) + "\n")
		escreva("\n------------------------------------\n")
		escreva("Total da nota: R$ " + mat.arredondar((total + imposto),2)+ "\n\n")
		escreva("--------------------------------------\n")
		
		
		se (pagamento == '3') {
			parcelas = total / 2
			escreva("Pagar em 2x de R$ " +mat.arredondar(parcelas,2) + "\n")
		} 
		escreva("Deseja comprar mais S/N: \n")
		leia(continuar2)
		limpa()
     	
	}
	enquanto (continuar2 =='S' ou op == 's')
	escreva("-----Obrigado!!------\n")
	escreva("----Até Breve!!----")
			}
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2518; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */