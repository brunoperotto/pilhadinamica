/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author bperotto
 */
public class Pilha {
    //atributos
    private CelulaPilha top;
    
    //void não retorna nenhum valor
    public void push(String nome){ //cria nova célula
        CelulaPilha novaCelula = new CelulaPilha(); //
        novaCelula.setDado(nome); //passa o nome pra célula
        novaCelula.setAnterior(this.top); //faz o anterior da nova célula apontar para o topo anterior
        this.top = novaCelula; //topo aponta para a nova célula
    }
    
    //void não retorna nenhum valor
    public void pop(){ //remove células de dentro da pilha
        if(!isEmpty()){ //referencia ao método mais abaixo que checa se a pilha está vazia, se não estiver
            System.out.println("Retirando elemento da pilha: "+this.top.getDado()); //mostra o texto
            this.top = this.top.getAnterior(); //topo da pilha recebe o anterior dela
    }else{
            System.out.println("Pilha vazia!!!"); //caso a pilha esteja vazia, imprime
        }
    }
    
    //sem o void, tem que retornar algo
    public boolean isEmpty(){ //verifica se a pilha está vazia
        if(this.top == null){ //se topo for nulo
            return true; //retrona que está vazia
        }else{
            return false; //senão, é falso
        }
    }
    
    //retornar tamanho da pilha
    public int tamanhoPilha(){
        CelulaPilha p; //cria referência pra célula
        int cont = 0; //cria contador
        p = this.top; //referência aponta para o topo da pilha
        while(p != null){ //enquanto P não for nulo
            p = p.getAnterior(); //p aponta para o anterior e então adiciona +1 no contador
            cont++; //e então adiciona +1 no contador
        }
        return cont; //retorna o valor armazenado no contador, a quantidade de células
    }
    
    //imprimir conteúdo da pilha
    public void imprimir(){
        CelulaPilha p; //cria a referência para a célula
        p = this.top; //referência aponta para o topo
        if(isEmpty()){ //se a pilha estiver vazia
            System.out.println("Pilha está vazia!!!"); //informar que está vazia
        }else{ //senão
            while(p != null){ //enquanto p não for nulo
                System.out.println("Nome da Pilha..: "+p.getDado()); //imprimir nome do dado armazenado em p
                p = p.getAnterior(); //p aponta para a celula anterior
            }
        }
    }
    
    //não tem void, portanto tem que retornar algo
    public CelulaPilha top(){ //informa a celula do topo da pilha
        CelulaPilha p; //cria a referência para a célula
        p = this.top; //a referência aponta para o topo
        if(isEmpty()){
            System.out.println("Pilha está vazia!!!"); //informar que está vazia
            return null;
        }else{
            System.out.println("Celula do topo é: "+p.getDado()); //imprimir dado do topo
            return this.top;
        }
    }
    
}