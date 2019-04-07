/*public class TipoDePrenda {

    private Categoria categoria;

    TipoDePrenda(Categoria _categoria){
        this.categoria = _categoria;
    }

    public Categoria categoria(){
        return this.categoria;
    }

    //COMO HAGO EL ENUM DE LA ROPA SI YA TENGO UNA CLASE QUE SE LLAMA SIMILAR? osea, a que matchea zaparo, remera, pantalon, etc.
    TipoDePrenda ZAPATO = new TipoDePrenda(Categoria.CALZADO);
    TipoDePrenda REMERA = new TipoDePrenda(Categoria.PARTE_SUPERIOR);
    TipoDePrenda PANTALON = new TipoDePrenda(Categoria.PARTE_INFERIOR);
    TipoDePrenda COLLAR = new TipoDePrenda(Categoria.ACCESORIOS);
}

*/

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum TipoDePrenda {

    ZAPATO(Categoria.CALZADO, Arrays.asList(Material.CUERO,Material.SINTETICO)),
    REMERA(Categoria.PARTE_SUPERIOR,Arrays.asList(Material.ALGODON,Material.SEDA)),
    PANTALON(Categoria.PARTE_INFERIOR,Arrays.asList(Material.JEAN,Material.CORDEROY,Material.GABARDINA)),
    COLLAR(Categoria.ACCESORIOS,Arrays.asList(Material.ORO,Material.PLATA,Material.PLASTICO));

    private Categoria categoria;
    private List<Material> materialValido;

    TipoDePrenda(Categoria _categoria, List<Material> _materialValido){
        this.categoria = _categoria;
        this.materialValido = _materialValido;
    }

    public Categoria categoria(){
        return this.categoria;
    }

    public Boolean validarMaterial(Material material){
        if(this.materialValido.contains(material)){
            return true;
        }
        else{
            return false;
        }
    }

    public List<Material> RetornarMaterialesValidosTipoDePrenda(){
        return materialValido;
    }

    //COMO HAGO EL ENUM DE LA ROPA SI YA TENGO UNA CLASE QUE SE LLAMA SIMILAR? osea, a que matchea zaparo, remera, pantalon, etc.
    /*TipoDePrenda ZAPATOO = new TipoDePrenda(Categoria.CALZADO);
    TipoDePrenda REMERA = new TipoDePrenda(Categoria.PARTE_SUPERIOR);
    TipoDePrenda PANTALON = new TipoDePrenda(Categoria.PARTE_INFERIOR);
    TipoDePrenda COLLAR = new TipoDePrenda(Categoria.ACCESORIOS);*/
}