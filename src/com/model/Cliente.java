package com.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Cliente extends Pessoa{

    private List <Endereco> enderecos;

    public void adcionaEnderecos(Endereco endereco){
        if (endereco == null){
            throw new NullPointerException("Endereco não pode ser nulo!");
        }
        if (endereco.cep == null){
            throw new NullPointerException("Cep não pode ser nulo!");
        }
        getEnderecos().add(endereco);

    }

    private List<Endereco> getEnderecos() {
        if (enderecos == null){
            enderecos = new ArrayList<Endereco>();
        }
        return enderecos;
    }
}
