import com.model.Cliente;
import com.model.Endereco;


import java.util.ArrayList;

public class EnderecoEntregaApp {

    public static void main(String[] args){

            Endereco endereco = new Endereco();
            endereco.cep = "";

            Cliente cliente = new Cliente();


            try {
            cliente.adcionaEnderecos(endereco);
        System.out.println("Endereco adicionado com suscesso!!!");
          } catch (Exception e){
                System.err.println("Houve um erro ao adicionar endereço: " + e.getMessage());
            }



    }
}
