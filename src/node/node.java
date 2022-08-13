package node;

import java.util.ArrayList;

public abstract class node {
    
    private int profundidade;
    private int Altura;
    private int classe;
    private int nivel;
    public Object getAltura;

    public abstract String getText();

    public abstract int getClasse();

    public abstract int getAltura();

    public abstract ArrayList<node> getSubNos();

    public int getNivel(){
        return this.nivel;
    }

    public void setNivel(int nivel){
        this.nivel = nivel;
    }
}
