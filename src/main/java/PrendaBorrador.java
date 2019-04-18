import java.util.List;

import static java.util.Objects.requireNonNull;

//BUILDER
public class PrendaBorrador {
    private TipoDePrenda tipoDePrenda;
    private Material material;
    private Color color;
    private Color colorSecundario;
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

    public PrendaBorrador setColorSecundario (Color _color){
        this.colorSecundario = _color;
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
        if (tipoDePrenda.validarMaterial(material)) {
            return;
        }
        throw new MaterialInvalidoException("Material es invalido para ese tipo de prenda");
    }

    public void validacionColorSecundario(){
        if(this.colorSecundario !=null){
            if(this.colorSecundario != this.color){
                nuevaPrenda.setColorSecundario(this.colorSecundario);
            }
            else{
                throw new ColorIgualException("El color secundario no puede ser igual al primario");
            }
        }
        else{
            //nada
        }
    }
/* esto va en el guardarropa
    public void incluirEnGuardarropa(Guardarropa guardarropa){
        switch (this.tipoDePrenda.categoria()){
            case PARTE_SUPERIOR: guardarropa.agregarPrendaSuperior(this.nuevaPrenda);
            break;
            case PARTE_INFERIOR: guardarropa.agregarPrendaInferior(this.nuevaPrenda);
            break;
            case CALZADO: guardarropa.agregarCalzado(this.nuevaPrenda);
            break;
            default: throw new CategoriaInvalidaException("Categoria Invalida!");
        }
    }
*/


    public Prenda crear(){
        requireNonNull(tipoDePrenda, "Tipo de prenda es obligatorio");
        this.validacionMaterial(); //Valido si hay input y si ademas el material es valido para la prenda
        requireNonNull(color,"color es obligatorio");
        this.validacionTrama(); //valido si hay input, sino la trama sera lisa por defecto
        this.validacionColorSecundario();

        nuevaPrenda = new Prenda(this.tipoDePrenda, this.material, this.color, this.trama);

        //aca no va  VA EN EL TEST this.incluirEnGuardarropa(guardarropa); ///ESTO SE HACE EN EL TEST
        /*
        prenda = prendaBorrador.crear();
prendaBorrador.destroy();
guardarropa.agregar(prenda);
         */

        return nuevaPrenda;

        /////esto debe tirarlo adentro de alguna de las listas de guardarropas
    }


    /////////////Revisar si esto me servia de algo!!!!!//////////////////////////////
    public Categoria categoria() {
        return tipoDePrenda.categoria();
    }
    /////////////////////////////////////////////////////////////////////////////////
}