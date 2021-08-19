package Programas;
import Classes.Celulares;
import Classes.ClasseMae;
import Classes.Jogos;
import Classes.Vendas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class tst2 {
    public static void main(String[] args) {
        String auxProd;
        char op;
        int auxQuant = 0;
        char op1;
        double auxValor = 0.00;
        char op2;
        
       int pos = 0;

        Scanner leia = new Scanner(System.in);
        List<ClasseMae> carrinho = new ArrayList<>();
        List<ClasseMae> estoque = new ArrayList<>();
        //LISTAS A SEREM PREENCHIDAS
        estoque.add(new Celulares("RedMagic 5",10,"G4-1",1345.00,"Redmagic","Galaxy 1.5"));
        estoque.add(new Celulares("RogPhone 3",10,"G4-2",5.000,"Asus","Galaxy 1.5"));
        estoque.add(new Celulares("LG K20",10,"G4-3",600.00,"Lg","Galaxy 1.5"));
        estoque.add(new Celulares("Galaxy S10",10,"G4-4",2000.00,"Samsung","Galaxy 1.5"));
        estoque.add(new Celulares("IPHONE",10,"G4-5",4000.00,"Apple","Galaxy 1.5"));
        estoque.add(new Jogos("------- ",10,"G4-6",0.00,""));
        estoque.add(new Jogos("-------",10,"G4-7",0.00,"-------"));
        estoque.add(new Jogos("-------",10,"G4-8",0.00,"-------"));
        estoque.add(new Jogos("------- ",10,"G4-9",0.00,"-------"));
        estoque.add(new Jogos("------- ",10,"G4-10",0.00,"-------"));

        
        do {
      
        //MOSTRAR NA TELA O CLIENTE QUER
        System.out.println("COD\tPRODUTO\tVALOR\tESTOQUE");
      
        for ( ClasseMae prod: estoque) {
            System.out.println(prod.getCodigo()+"\t"+prod.getProduto()+"\t"+prod.getValor()+"\t"+prod.getEstoque());
        }
        System.out.println("Digite o código do produto: ");
        auxProd = leia.next().toUpperCase();
        
        
    
    
    for (int x = 0; x <estoque.size(); x++ ) {
		if (estoque.get(x).getCodigo().equals(auxProd)) {
			pos = x;
			
		
			}
			System.out.println("Você escolheu o produto "+ estoque.get(pos).getCodigo()+ "\t" + estoque.get(pos).getProduto() + "\t" + "valor " + "\t" +  estoque.get(pos).getValor()+ "Estoque:"+ "\t"+ estoque.get(pos).getEstoque());
		}   System.out.println("Esta correto? S ou N?");
		   op = leia.next().toUpperCase().charAt(0);		   		
	} 
             while (op == 'N');
        
        }
        
        
    }

