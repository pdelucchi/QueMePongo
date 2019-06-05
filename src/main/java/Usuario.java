import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private List<Guardarropa> guardarropasDeUsuario;
    private List<Prenda> prendasDeUsuario;
    private Guardarropa guardarropa;
    public List<Atuendo> sugerencias;

    public Usuario(){
        this.guardarropasDeUsuario = new ArrayList<Guardarropa>();
        this.prendasDeUsuario = new ArrayList<Prenda>();
    }

    public Usuario agregarGuardarropa(Guardarropa _guardarropa) {
        this.guardarropasDeUsuario.add(_guardarropa);
        return this;
    }

    public Usuario crearGuardarropa(Guardarropa _guardarropa){
        guardarropasDeUsuario.add(_guardarropa.crear());
        return this;
    }

    public Usuario agregarPrendaAGuardarropa(Prenda prendaAAgregar, int indice){
        if(!prendasDeUsuario.contains(prendaAAgregar)) {
            //throw new exception..
        }
            this.guardarropasDeUsuario.get(indice).incluirEnGuardarropa(prendaAAgregar);
            prendasDeUsuario.remove(prendaAAgregar);
            return this;
    }

    public List<Atuendo> pedirSugerencia(int indice){
        sugerencias = guardarropasDeUsuario.get(indice).sugerir();
        return sugerencias;
    }

    public Usuario cargarPrenda(PrendaBorrador _prendaACrear){
        prendasDeUsuario.add(_prendaACrear.crear());
        return this;
    }
}
