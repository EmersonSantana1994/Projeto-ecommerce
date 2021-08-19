package Programas;
import Classes.Celulares;
import Classes.ClasseMae;
import Classes.Jogos;
import Classes.Vendas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Loja {
    public static void main(String[] args) {
        String auxProd;
        char op;
        int auxQuant = 0;
        char op1;
        double auxValor = 0.00;
        char op2;
        
       int pos = 1;

        Scanner leia = new Scanner(System.in);
        List<ClasseMae> carrinho = new ArrayList<>();
        List<ClasseMae> estoque = new ArrayList<>();
        //LISTAS A SEREM PREENCHIDAS
        estoque.add(new Celulares("RedMagic 5",10,"G4-1",1345.00,"Redmagic","Galaxy 1.5"));
        estoque.add(new Celulares("RogPhone 3",10,"G4-2",5.000,"Asus","Galaxy 1.5"));
        estoque.add(new Celulares("LG K20      ",10,"G4-3",600.00,"Lg","Galaxy 1.5"));
        estoque.add(new Celulares("Galaxy S10",10,"G4-4",2000.00,"Samsung","Galaxy 1.5"));
        estoque.add(new Celulares("IPHONE      ",10,"G4-5",4000.00,"Apple","Galaxy 1.5"));
        estoque.add(new Jogos("------- ",10,"G4-6",0.00,""));
        estoque.add(new Jogos("-------",10,"G4-7",0.00,"-------"));
        estoque.add(new Jogos("-------",10,"G4-8",0.00,"-------"));
        estoque.add(new Jogos("------- ",10,"G4-9",0.00,"-------"));
        estoque.add(new Jogos("------- ",10,"G4-10",0.00,"-------"));

        do {
        do {
        do {
        	pos = -1;
        //MOSTRAR NA TELA O CLIENTE QUER
        System.out.println("COD\tPRODUTO\tVALOR\tESTOQUE");
      
        for ( ClasseMae prod: estoque) {
            System.out.println(prod.getCodigo()+" "+"\t"+" "+prod.getProduto()+"\t"+" "+prod.getValor()+"\t"+" "+prod.getEstoque());
        }
        System.out.println("Digite o código do produto: ");
        auxProd = leia.next().toUpperCase();
        
        
    
    
    for (int x = 0; x <estoque.size(); x++ ) {
		if (estoque.get(x).getCodigo().equals(auxProd)) {
			pos = x;
			
			
			
		
		}
			else if (pos >= 0) {
				
			System.out.println("Você escolheu o produto "+ estoque.get(pos).getCodigo()+ "\t" + estoque.get(pos).getProduto() + "\t" + "valor " + "\t" +  estoque.get(pos).getValor()+ "Estoque:"+ "\t"+ estoque.get(pos).getEstoque());
			break;
		}   
		}  		   		
	 
         System.out.println("Esta correto? S ou N?");
          op = leia.next().toUpperCase().charAt(0);
        } while (op == 'N');
             
        System.out.println("Digite a quantidade desejada");
        auxQuant = leia.nextInt();
        System.out.println("Você vai levar " + (estoque.get(pos).getEstoque() - auxQuant));
        System.out.println("Você vai pagar R$" + (auxQuant * estoque.get(pos).getValor()));
        carrinho.add(new ClasseMae(estoque.get(pos).getProduto(), estoque.get(pos).getEstoque(), estoque.get(pos).getCodigo(), estoque.get(pos).getValor()));
         System.out.println("Confirma pedido? S ou N?");
        op1 = leia.next().toUpperCase().charAt(0);
        auxValor = (auxQuant*estoque.get(pos).getValor());
		
        }      
        while (op1 == 'N');
        
        System.out.println("\"COD\\tVALOR\\tESTOQUE\\tPRODUTO\"");
        double auxTotal=0;
        for(ClasseMae fechamento : carrinho) {
        	
        	for(int i = 0; i<estoque.size() ; i++) {
        		if (estoque.get(i).getCodigo().equals(fechamento.getCodigo())) {
					pos = i;
					
        }
        
}
        	System.out.println(fechamento.getCodigo()+"\t"+fechamento.getValor()+"\t"+ (estoque.get(pos).getEstoque() - auxQuant) +"\t"+fechamento.getProduto());
    		auxTotal = auxTotal + (fechamento.getValor()*fechamento.getEstoque());
    		estoque.get(pos).getEstoque();
}
        System.out.println("Valor total R$: "+auxValor);
		carrinho.clear();

		System.out.println("Gostaria de compra mais? S ou N");
		 op2 = leia.next().toUpperCase().charAt(0);
 
        } while (op2 == 'S');
        
		System.out.println("ATÉ BREVE!!!");
        
        }
}

