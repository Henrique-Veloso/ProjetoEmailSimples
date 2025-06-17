import java.util.HashSet;
import java.util.Set;

public class EMail {
    private String origem; //email do remetente
    private String destino; //email do destinatario
    private String mensagem; //corpo do email
    private String data; //data do envio
    private Set<Anexo> anexos; //Lista de anexo (max 3)

    public EMail (String origem, String destino, String mensagem, String data) {
        this.origem = origem;
        this.destino = destino;
        this.mensagem = mensagem;
        this.data= data;
        this.anexos = new HashSet<>(); // garante que não ha anexos repetidos
    }

    public String getOrigem(){
        return origem;
    }

    public void SetOrigem(String origem){
        this.origem = origem;
    }

    public String getDestino(){
        return destino;
    }

    public void setDestino(String destino){
        this.destino = destino;
    }

    public String getMensagem(){
        return mensagem;
    }
    public void setMensagem(String mensagem){
        this.mensagem = mensagem;
    }

    public String getData(){
        return data;
    }

    public void setData(String data){
        this.data = data;
    }

    public Set<Anexo> getAnexos(){
        return anexos;
    }

    public boolean addAnexo(Anexo anexo){
        if (anexos.size()<3){
            return anexos.add(anexo);
        }
        return false;
    }
}


