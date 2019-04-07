import static java.util.Objects.requireNonNull;

//BUILDER
public class PrendaBorrador {
    private TipoDePrenda tipoDePrenda;
    private Material material;
    private Color color;
    private Trama trama;
    private Prenda nuevaPrenda;


    public PrendaBorrador setTipoDePrenda (TipoDePrenda _tipoDePrenda){
        this.tipoDePrenda = _tipoDePrenda;
        return this;
    }

    public PrendaBorrador setMaterial (Material _material){
        this.material = _material;
        return this;
    }

    public PrendaBorrador setColor (Color _color){
        this.color = _color;
        return this;
    }

    public PrendaBorrador setTrama (Trama _trama){
        this.trama = _trama;
        return this;
    }

    public Prenda crear(){
        nuevaPrenda = new Prenda(this.tipoDePrenda, this.material, this.color);
        return nuevaPrenda;
    }

    public Categoria categoria() {
        return tipoDePrenda.categoria();
    }
}