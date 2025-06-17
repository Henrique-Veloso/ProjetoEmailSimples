public class Anexo {
    private String name; //nome do anexo
    private String content; //conteúdo do anexo

    public Anexo(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public boolean contains(String serchString){
        return content.contains(serchString);
    }
}
