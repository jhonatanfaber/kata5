package kata5.model;

public class Currency {

    private final String codigo;
    private final String name;
    private final String simbolo; 

    public Currency(String codigo, String name, String simbolo) {
        this.codigo = codigo;
        this.name = name;
        this.simbolo = simbolo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getName() {
        return name;
    }

    public String getSimbolo() {
        return simbolo;
    }
    
    
    
}
