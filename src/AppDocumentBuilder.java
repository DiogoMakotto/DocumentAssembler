import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import node.*;
import transversal.*;

public class AppDocumentBuilder {
    
    private branch base;
    private transversal transversalMetodo;
    private String outputFileName;
    
    public AppDocumentBuilder(branch base, transversal chosenTransversalMetodo, String outputFileName){
        this.base = base;
        this.transversalMetodo = chosenTransversalMetodo;
        this.outputFileName = outputFileName;
    }
    public static void main(String[] args) throws Exception {
        
        branch base =new branch();
        branch branch1 =new branch();
        branch branch2 =new branch();

        base.addNode(new leaf("Texto"));//ponto inicial para ciração de documento
        base.addNode(branch1);

        branch1.addNode(new leaf("exemplo"));
        branch1.addNode(new leaf("para"));
        branch1.addNode(branch2);

        branch2.addNode(new leaf("criação"));
        branch2.addNode(new leaf("de documento"));

        AppDocumentBuilder var = new AppDocumentBuilder(base, new ordemTransversal(), "document.txt");
        var.txtBuilder();
    }

    public void consoleBuilder(){ //metodo de exibição atraves do console 

        transversalMetodo.builder(this.base);
        System.out.println(transversalMetodo.getText());
    }

    public void txtBuilder(){ //metodo de txt dentro do documento 

        transversalMetodo.builder(this.base);
        FileWriter saida = null;

        try{ //mecanismo de monitoramento
            FileOutputStream apagarConteudoDocumento = new FileOutputStream(this.getOutputFileName());

            saida = new FileWriter(this.getOutputFileName(), true);
            saida.write(this.transversalMetodo.getText());
            saida.write("\nLog: " + java.time.LocalDate.now() + "" + java.time.LocalTime.now());
            saida.close();

        }catch (IOException e){  //tratativa de exceções 
            e.printStackTrace();
        }
    }

    public String getOutputFileName(){
        return outputFileName;
    }

    public void getOutputFileName(String outputFileName){
        this.outputFileName = outputFileName;
    }
}
