package node;

import java.util.ArrayList;

public class branch extends node {
    
    private final ArrayList<node> subNodes = new ArrayList<>();

    public String getText(){ //getter do txt
        return null;
    }

    public void addNode(node filho){

        filho.setNivel(this.getNivel() + 1);
        subNodes.add(filho);
    }

    public void removeNode(node filho){

        subNodes.remove(filho);
    }

    public int getClasse(){ //getter da classe
        int classe = 0;

        for (node subNo : subNodes){
            classe++;
            classe+= subNo.getClasse();
        }
        return classe;
    }

    public int getAltura(){ //getter da altura

        int alturaBase = this.getNivel();
        int maxAltura = alturaBase;

        for(node node : subNodes){ 

            if(node.getNivel() > maxAltura){
                maxAltura = node.getNivel();
                node.getAltura();
            }
        }
        return(maxAltura - alturaBase);
    }

    @Override 
    public ArrayList<node> getSubNos() {
        return this.subNodes;
    }
   
}
