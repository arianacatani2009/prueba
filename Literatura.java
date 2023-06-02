public class Literatura {
    String tipo, autor;
    int anio;
    public Literatura(String Tipo, String Autor, int Anio) {
        this.anio = Anio;
        this.tipo = Tipo;
        this.autor = Autor;

    }
    public java.lang.String getTipo() {
        return tipo;
    }
    public void setTipo(java.lang.String tipo) {
        this.tipo = tipo;
    }

    public java.lang.String getAutor() {
        return autor;
    }

    public void setAutor(java.lang.String autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    public void imprimirdatos(){
        System.out.println(this.tipo);
        System.out.println(this.autor);
        System.out.println(this.anio);
    }

}