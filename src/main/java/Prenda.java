import static java.util.Objects.requireNonNull;

public class Prenda {
    private TipoDePrenda tipoDePrenda;
    private Material material;
    private Color color;

    Prenda(TipoDePrenda _tipoDePrenda, Material _material, Color _color){
        this.tipoDePrenda = requireNonNull(_tipoDePrenda, "Tipo de prenda es obligatorio");
        this.material = requireNonNull(_material,"Material es obligatorio");
        this.color = requireNonNull(_color,"color es obligatorio");
    }

    public Categoria categoria(){
        return tipoDePrenda.categoria();
    }

}

