package testes_uri;

import java.util.*;

class IdadeEmAnosConvert{
	
		public int idadeEmDias;

		public int getIdadeEmDias() {
			return idadeEmDias;
		}

		public void setIdadeEmDias(int idadeEmDias) {
			this.idadeEmDias = idadeEmDias;
		}
	
		public String ConverteIdadeEmAnos() {
			int anos = this.idadeEmDias / 365;
			int ram = this.idadeEmDias - anos * 365;
			int mes = ram / 30;
			ram = ram - mes * 30;
			int dia = ram;
		
			return anos+" ano(s)%n"+mes+" mes(es)%n"+dia+" dia(s)%n";
		}
}

public class IdadeEmAnos {

	public static void main(final String[] args){
		 
        Scanner key = new Scanner(System.in);
		
		IdadeEmAnosConvert con = new IdadeEmAnosConvert();
		
		con.setIdadeEmDias(key.nextInt());
		
		key.close();

        System.out.printf(con.ConverteIdadeEmAnos());
 
    }
}
