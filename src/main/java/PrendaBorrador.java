import java.util.List;

import static java.util.Objects.requireNonNull;

//BUILDER
public class PrendaBorrador {
    private TipoDePrenda tipoDePrenda;
    private Material material;
    private Color color;
    private Trama trama;
    private Prenda nuevaPrenda;
    private List<Material> materialesValidos;


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

    public void validacionTrama(){
        if(this.trama == null){
            this.trama = Trama.LISA;
        }
    }

    public void validacionMaterial(){
        requireNonNull(material,"Material es obligatorio");
        if(tipoDePrenda.validarMaterial(material)){

        }
        else{
            throw new MaterialInvalidoException("Material es invalido para ese tipo de prenda");
            //return tipoDePrenda.RetornarMaterialesValidosTipoDePrenda();  VER COMO DEVOLVER LA LISTA PARA QUE EL USUARIO SELECCIONE
        }
    }

    public Prenda crear(){
        requireNonNull(tipoDePrenda, "Tipo de prenda es obligatorio");
        this.validacionMaterial(); //Valido si hay input y si ademas el material es valido para la prenda
        requireNonNull(color,"color es obligatorio");
        this.validacionTrama(); //valido si hay input, sino la trama sera lisa por defecto



        nuevaPrenda = new Prenda(this.tipoDePrenda, this.material, this.color, this.trama);
        return nuevaPrenda;
    }

    public Categoria categoria() {
        return tipoDePrenda.categoria();
    }
}