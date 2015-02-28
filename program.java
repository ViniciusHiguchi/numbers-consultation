package teste;
import java.util.*;
public class Teste
{
	public static void main (String[] args)
	{
		
		int pares[],mult[],primos[],i=0,h=0,num=0;
		char again;
       
       pares = new int[51];
       mult = new int[21];
       primos = new int[26];
       Scanner input = new Scanner (System.in);
       do
       {
       System.out.printf("selecione qual tipo de numeros voce quer ver:\n\n(1)primos\n(2)multiplos de cinco\n(3)pares\n\n");
       h = input.nextInt();
       
       if(h == 1)
       {
       h=0;
       primos[1] = 2; primos[2]=3;
       primos[3] = 5; primos[4]=7;
       primos[5] = 11; primos[6]=13;
       primos[7] = 17; primos[8]=19;
       primos[9] = 23; primos[10]=29;
       primos[11] = 31; primos[12]=37;              
       primos[13] = 41; primos[14]=43;
       primos[15] = 47; primos[16]=53;
       primos[17] = 59; primos[18]=61;
       primos[19] = 67; primos[20]=71;
       primos[21] = 73; primos[22]=79;
       primos[23] = 83; primos[24]=89; primos[25] = 97;
       
       System.out.printf("digite de 1 a 25 a quantidade de numeros primos que voce quer consultar\n\n");
       h = input.nextInt();
       do
       {
    	   num = num + 1;
    	   System.out.printf("\n %d",primos[num]);
    	   
       }
       while(h != num);
       } 
       if(h == 2)
       {
       h=0;
       do
       {
    	   i = i + 1;
    	   mult[i] = 5 * i;
       }
       while(i != 20);
       System.out.printf("digite de 1 a 20 a quantidade de multiplos de cinco que voce quer consultar\n\n");
       h = input.nextInt();
       do
       {
    	   num = num + 1;
    	   System.out.printf("\n %d",mult[num]);   
       }
       while(h != num);
       }
       
       
       
              
       if(h==3)
       {
       do
       {
    	   i = i + 1;
    	   pares[i] = 2 * i;
       }
       while(i != 50);
       System.out.printf("digite de 1 a 50 a quantidade de numeros pares que voce quer consultar\n\n");
       h = input.nextInt();
       do
       {
    	   num = num + 1;
    	   System.out.printf("\n %d",pares[num]);   
       }
       while(h != num);
       }
       
       System.out.printf("\n\nquer fazer outra consulta? s/n\n");
       again = input.next().charAt(0);
       }
       while(again == 's' || again == 'S');
       
       
       
	}
}
