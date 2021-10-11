package testes_uri;

import java.util.*;

class Pedido{
  String[][] menu = {{"1","Cachorro Quente","4.00"},{"2","X-Salada","4.50"},{"3","X-Bacon","5.00"},{"4","Torrada simples","2.00"},{"5","Refrigerante","1.50"}};
  int cod;
  int qnt;

  public void setCod(int c){
    this.cod = c;
  }

  public void setQnt(int q){
    this.qnt = q;
  }

  public double totalConta(){
    double total;
    for(int i = 0; i < 5; i++){
        if(menu[i][0].equals(Integer.toString(this.cod))){
          total = qnt * Double.parseDouble(menu[i][2]);
          return total;
        }  
    }
    return 0.0; 
  }
}

public class Main {

	public static void main(String[] args) {
	    
	    Scanner key = new Scanner(System.in);

	    Pedido p = new Pedido();

	    p.setCod(key.nextInt());
	    p.setQnt(key.nextInt());

	    key.close();

	    System.out.printf("Total: R$ %.2f%n",p.totalConta());
	  }
}
