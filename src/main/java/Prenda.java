import static java.util.Objects.requireNonNull;

public class Prenda {
    private TipoDePrenda tipoDePrenda;
    private Material material;
    private Color color;
    private Trama trama;
    private Color colorSecundario;

    Prenda(TipoDePrenda _tipoDePrenda, Material _material, Color _color, Trama _trama){
        this.tipoDePrenda = _tipoDePrenda;
        this.material = _material;
        this.color = _color;
        this.trama = _trama;
    }

    public Categoria categoria(){
        return tipoDePrenda.categoria();
    }

    public TipoDePrenda tipoDePrenda(){
        return this.tipoDePrenda;
    }

    public Prenda setColorSecundario(Color _colorSecundario){
        this.colorSecundario = _colorSecundario;
        return this;
    }

    @Override
    public String toString() {
        return "Tipo";
    }
}
