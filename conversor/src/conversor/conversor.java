package conversor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class conversor {
	int dato;
	conversor(int p){dato=p;}
		public String getNumero (String param){
			if (param == "B"){
			return Integer.toBinaryString(dato);
			}
			if (param == "H"){
			return Integer.toHexString(dato);
			}
			if (param == "O"){
			return Integer.toOctalString(dato);
			}
			return "Parámetro no reconocido";
		}
	
		public static void main(String[] args) throws IOException{ 
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader buff = new BufferedReader(isr);
			System.out.println("Introduzca el número :");
			int num = Integer.parseInt(buff.readLine());
			conversor s = new conversor(num);
		System.out.println("El número "+num +" en binario es: "+s.getNumero("B"));
		System.out.println("El número "+num +" en hexadecimal es: "+s.getNumero("H"));
		System.out.println("El número "+num +" en octal es: "+s.getNumero("O"));
		}
	}

