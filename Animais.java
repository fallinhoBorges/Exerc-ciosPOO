/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package entidades;

/**
 *
 * @author caioe
 */
public class Animais {

    /*Seguintes atributos do animal a ser criado: */
    
    private String nome;
    private String classe;
    private String familia;
    private Integer idade;
    private Boolean estado;
    private Integer caloria;
    private Integer força;
    
    /*Os métodos, este método é o Construtor, que serve para instaciar nosso Objeto com todas os atributos existentes*/
    
    public Animais(String nome, String classe, String familia, Integer idade, Boolean estado, Integer caloria, Integer força) {
        this.nome = nome;
        this.classe = classe;
        this.familia = familia;
        this.idade = idade;
        this.estado = estado;
        this.caloria = caloria;
        this.força = força;
    }

    public Animais(String nome, String classe, String familia) {
        this.nome = nome;
        this.classe = classe;
        this.familia = familia;
        this.força = 10;
        this.caloria = 10;
        this.idade = 0;
        this.estado = true;
    }

    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public String getFamilia() {
        return familia;
    }

    public Integer getIdade() {
        return idade;
    }

    public Boolean getEstado() {
        return estado;
    }

    public Integer getCaloria() {
        return caloria;
    }

    public Integer getForça() {
        return força;
    }

    public String nascer() {
        return " O animal se chama " + nome + " é da classe " + classe + " e da família " + familia + ". O animal possui força de " + força + ", caloria de " + caloria + " e idade de " + idade;
    }

    public String morrer() {
        this.força = 0;
        this.estado = false;
        return "O animal morreu! :(";
    }

    public String comer() {
        this.caloria += 10;
        this.força -= 2;
        return "O animal comeu e agora sua força é de " + força + " e suas calorias valem " + caloria;
    }

    public String correr() {
        this.força -= 5;
        this.caloria -= 5;
        return "O animal está correndo e sua força é de " + força + " e suas calorias valem " + caloria;
    }

    public String dormir() {
        this.força += 20;
        this.caloria -= 2;
        return "O animal está dormindo, agora sua força está em " + força + " e suas calorias foram para " + caloria;
    }

}
