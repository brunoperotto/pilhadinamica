/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author bperotto
 */
public class CelulaPilha {
    //atributos
    private String nome;
    private CelulaPilha anterior;

//constrói a célula
public CelulaPilha(){}

//joga o nome pra célula e o anterior para a célula anterior
public CelulaPilha(String nome, CelulaPilha anterior){
    this.nome = nome;
    this.anterior = anterior;
}

//retorna o dado armazenado na célula
public String getDado(){
    return this.nome;
}

//armazena o dado na célula
public void setDado(String nome){
    this.nome = nome;
}

//pega a referência anterior
public CelulaPilha getAnterior(){
    return(this.anterior);
}

//coloca na célula a referência da célula anterior
public void setAnterior(CelulaPilha anterior){
    this.anterior = anterior;
}

}