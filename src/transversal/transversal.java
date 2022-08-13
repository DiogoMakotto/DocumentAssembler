package transversal;

import node.*;

public abstract class transversal {
    
    protected String text = "";

    public abstract void builder(node base);

    public abstract String getText();
    public abstract void setText(String text);
}
