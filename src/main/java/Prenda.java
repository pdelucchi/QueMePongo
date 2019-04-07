import static java.util.Objects.requireNonNull;

public class Prenda {
    private TipoDePrenda tipoDePrenda;
    private Material material;
    private Color color;
    private Trama trama;

    Prenda(TipoDePrenda _tipoDePrenda, Material _material, Color _color, Trama _trama){
        this.tipoDePrenda = requireNonNull(_tipoDePrenda, "Tipo de prenda es obligatorio");
        this.material = requireNonNull(_material,"Material es obligatorio");
        this.color = requireNonNull(_color,"color es obligatorio");
        this.trama = _trama;
    }

    public Categoria categoria(){
        return tipoDePrenda.categoria();
    }

}
