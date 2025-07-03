package miaudota;

import java.sql.Date;

public class Cachorro extends Animal {
    public Cachorro(int id, String nome, String raca, int idade, String sexo, String porte, double peso, String cor,
            String descricao, Date dataCadastro, boolean vacinado, boolean castrado, TipoAnimal tipo) {
        super(id, nome, raca, idade, sexo, porte, peso, cor, descricao, dataCadastro, vacinado, castrado, tipo);
        this.tipo = TipoAnimal.CACHORRO;
    }

}
