public class Atuendo {
    private Prenda parteSuperior;
    private Prenda parteInferior;
    private Prenda calzado;

    Atuendo(Prenda _parteSuperior, Prenda _parteInferior, Prenda _calzado){
        this.parteSuperior = _parteSuperior;
        this.parteInferior = _parteInferior;
        this.calzado = _calzado;
    }

    public Prenda mostrarFalopaSuperior(){
        return this.parteSuperior;
    }
    public Prenda mostrarFalopaInferior(){
        return this.parteInferior;
    }
    public Prenda mostrarFalopaCalzado(){
        return this.calzado;
    }


}
