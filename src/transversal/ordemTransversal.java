package transversal;

import node.branch;
import node.leaf;
import node.node;

public class ordemTransversal extends transversal {
    
    public void builder(node base){

        if(base instanceof leaf){
            
            this.setText(base.getText() + "");

        }else if (base instanceof branch){
            for (node subNode : base.getSubNos()){
                builder(subNode);
            }
        }
    }

    public String getText(){
        return this.text;
    }

    public void setText(String text){
        this.text += text;
    }
}
