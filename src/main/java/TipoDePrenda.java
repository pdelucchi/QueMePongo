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

public enum TipoDePrenda {

    ZAPATO(Categoria.CALZADO),
    REMERA(Categoria.PARTE_SUPERIOR),
    PANTALON(Categoria.PARTE_INFERIOR),
    COLLAR(Categoria.ACCESORIOS);
    private Categoria categoria;

    TipoDePrenda(Categoria _categoria){
        this.categoria = _categoria;
    }

       public Categoria categoria(){
        return this.categoria;
    }

    //COMO HAGO EL ENUM DE LA ROPA SI YA TENGO UNA CLASE QUE SE LLAMA SIMILAR? osea, a que matchea zaparo, remera, pantalon, etc.
    /*TipoDePrenda ZAPATOO = new TipoDePrenda(Categoria.CALZADO);
    TipoDePrenda REMERA = new TipoDePrenda(Categoria.PARTE_SUPERIOR);
    TipoDePrenda PANTALON = new TipoDePrenda(Categoria.PARTE_INFERIOR);
    TipoDePrenda COLLAR = new TipoDePrenda(Categoria.ACCESORIOS);*/
}