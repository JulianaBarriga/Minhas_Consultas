package Facade;

import java.util.ArrayList;
import java.util.List;

public class ApartamentoService implements IApartamentoService{

    List<Apartamento> apartamentos = new ArrayList<>();

    @Override
    public Boolean cadastratAp(Apartamento apartamento) {
        Boolean isCadastrado = isApartamentoCadastrado(apartamento);
        if(isCadastrado){
            System.out.println("Apartamento já cadastrado!");
            return false;
        }
        // Fazer continuação do código...
        return cadastrarNoBancoDeDados(apartamento);

    }

    private Boolean cadastrarNoBancoDeDados(Apartamento apartamento) {
        this.apartamentos.add(apartamento);
        System.out.println("Código: " + apartamento.getCodigo() + ", Endereço: " + apartamento.getEnd());
        System.out.println("Apartamento cadastrado com sucesso!");
        return true;
    }

    private Boolean isApartamentoCadastrado(Apartamento apartamento){
        for(Apartamento ap : this.apartamentos){
            if(ap.equals(apartamento)){
             return true;
            }
        } return false;
    }
}
