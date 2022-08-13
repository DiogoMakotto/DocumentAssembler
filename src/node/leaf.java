package node;

import java.util.ArrayList;

public class leaf extends node{
    
    private String text;

    public leaf(String text){
        this.text = text;
    }

    @Override
    public String getText() {
        // TODO Auto-generated method stub
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public int getClasse() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getAltura() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public ArrayList<node> getSubNos() {
        // TODO Auto-generated method stub
        return null;
    }
}
