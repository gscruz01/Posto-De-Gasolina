import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      int escolha, litros , pagamento , saida ;
      double semdesconto , comdesconto ;
      String cartao , email ;
      boolean Sim = true;
      
      
      ;
      Scanner sc = new Scanner(System.in);
  while ( true ){
      System.out.println("Bem Vindo ao Posto Roll, que combusivel deseja?");
      System.out.println("1: Alcool:");
      System.out.println("2: Gasolina:");
      escolha = sc.nextInt();
  
      switch (escolha){
      
        case 1 :

          System.out.println(" Abastecendo ate 20L voçê ganha 3% de desconto acima 5%");
          System.out.println("Quanto deseja abastecer");
          litros = sc.nextInt();
          
      
      if (litros <= 20 ){
          semdesconto = litros * 3.15 ;
          System.out.println(" esse é o valor sem desconto:" + semdesconto);
          comdesconto = semdesconto * 0.97 ;
          System.out.println("esse o valor com desconto:" + comdesconto);
  
      }else if ( litros > 20){
          semdesconto = litros * 3.15 ;
         System.out.println("esse o valor sem desconto:" + semdesconto);
          comdesconto = semdesconto * 0.95 ;
          System.out.println("esse o valor com desconto:" + comdesconto);
  
      }
      break ;

        case 2 :

          System.out.println(" Abastecendo ate 20L voçê ganha 4% de desconto acima 6%");
          System.out.println("Quanto deseja abastecer");
          litros = sc.nextInt();
          
      
      if (litros <= 20 ){
          semdesconto = litros * 4.49 ;
          System.out.println(" esse é o valor sem desconto:" + semdesconto);
          comdesconto = semdesconto * 0.96 ;
          System.out.println("esse o valor com desconto =" + comdesconto);
  
      }else if ( litros > 20){
          semdesconto = litros * 4.49 ;
         System.out.println("esse o valor sem desconto:" + semdesconto);
          comdesconto = semdesconto * 0.94 ;
          System.out.println("esse o valor com desconto:" + comdesconto);
          System.out.println("");
  
      }
      break ;

      default :
      System.out.println("Alternativa invalida tente novamente ");
      continue;
    }
     
    
        System.out.println("Qual sera a forma de pagamento ? ");
        System.out.println("");
        System.out.println("Aceitamos :");
        System.out.println("");
        System.out.println("1 : Pix ");
        System.out.println("2 : Debito");
        System.out.println("3 : Credito");
        System.out.println("4 : Boleto ");
        pagamento = sc.nextInt();
    
    
    
      //Pagamento no pix 
      switch (pagamento){
    
      case 1 :
    
        System.out.println("Esse é a chave do pix : ");
        System.out.println("");
        System.out.println("11 984483408");
        System.out.println("");
        System.out.println("Nome de : Guilherme Cruz Santos");
        System.out.println("");
        System.out.println("Assim que fizer o pagamento nos mande o comprovente via WhatsApp no numero 11984483408");
        System.out.println("");
        System.out.println("Assim que mandar ja enviaremos suas peças. ");
        System.out.println("");
        System.out.println("Obrigado pela compra");
    
      break;
    
      //Pagamento no Debito 
      case 2 :
      System.out.println("Nosso motoboy ira levar a maquininha, para ser pago na entrega ok");
      System.out.println("");
      System.out.println("Obrigado pela compra");
      break;
    
      //Pagamento no Crebito
      case 3 :
    
        System.out.println("Coloque os dados do cartão : ");
        System.out.println("");
        System.out.println("Nome que esta no catão : ");
        System.out.println("");
        cartao = sc.nextLine().trim();
        cartao = sc.nextLine().trim();
        System.out.println("");
        System.out.println("Numeros do cartão");
        System.out.println("");
        cartao = sc.nextLine().trim();
        System.out.println("");
        System.out.println("Data de validade do cartão : ");
        System.out.println("");
        cartao = sc.nextLine().trim();
        System.out.println("");
        System.out.println("CVV do cartão :");
        System.out.println("");
        cartao = sc.nextLine().trim();
        System.out.println("");
        System.out.println("CPF do titular do cartão :");
        System.out.println("");
        cartao = sc.nextLine().trim();
        System.out.println("");
        System.out.println("Parabens seu pedido foi comfirmado assim que o pagamento for autorizado enviaremos sua encomenda.");
        System.out.println("");
    
      break;  
    
      //Pagamento no boleto 
      case 4 :
    
        System.out.println("coloque seu email aqui : ");
        System.out.println("");
        email = sc.nextLine().trim();
        System.out.println("eviaremos o boleto via email");
        System.out.println("");
        System.out.println("assim que o senhor(a) fazer o pagamento iremos mandar sua encomenda ");
        System.out.println("");
        System.out.println("Obrigado pela compra");
    
      break;
    
      default :
      System.out.println("Escolha de pagamento inválida. Por favor, tente novamente.");
      continue;
      }
    
    
        
      System.out.println("Deseja sair ?");
      System.out.println("1 : Sim ");
      System.out.println("2 : Não ");
      saida = sc.nextInt();

      switch (saida){
        
        case 1 :
        System.out.println("Obrigado pela compra");
         while (Sim);
        break;

        case 2 :
        
       
        break;

        default :

    System.out.println("Escolha inválida. Por favor, tente novamente.");
      continue;

      }
    }


    }
    }

    
        


