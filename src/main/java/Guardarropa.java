import com.google.common.collect.*;
import java.util.*;
import java.util.List;

//Cada guardarropa corresponde a un usuario en particular, por lo que cada vez que se cree una ropa, debe guardarse en el guardarropa correspondiente
//mediante incluirEnGuardarropa(prenda)

public class Guardarropa {

    private List<Prenda> prendasSuperiores;
    private List<Prenda> prendasInferiores;
    private List<Prenda> calzados;
    private List<List<Prenda>> listaDelistasDePrendas;
    private List<Atuendo> atuendos;


    public void incluirEnGuardarropa(Prenda prenda) {
        switch (prenda.categoria()) {
            case PARTE_SUPERIOR:
                this.agregarPrendaSuperior(prenda);
                break;
            case PARTE_INFERIOR:
                this.agregarPrendaInferior(prenda);
                break;
            case CALZADO:
                this.agregarCalzado(prenda);
                break;
            default:
                throw new CategoriaInvalidaException("Categoria Invalida!");
        }
    }

    public Guardarropa agregarPrendaSuperior(Prenda _prenda) {
        this.prendasSuperiores.add(_prenda);
        return this;
    }


    public Guardarropa agregarPrendaInferior(Prenda _prenda) {
        this.prendasSuperiores.add(_prenda);
        return this;
    }

    public Guardarropa agregarCalzado(Prenda _prenda) {
        this.prendasSuperiores.add(_prenda);
        return this;
    }

    ////TESTEAR//////////////////////////////////////////////////////////////////////////////
    public Guardarropa sugerir(){
        this.listaDelistasDePrendas = Lists.cartesianProduct(this.prendasSuperiores,this.prendasInferiores,this.calzados);

        for(int i=0; i < this.listaDelistasDePrendas.size(); i++){
            List<Prenda> unAtuendo = this.listaDelistasDePrendas.get(i); //agarra la lista dentro de la listaDeListas en el indice i
            this.atuendos.add(new Atuendo(unAtuendo.get(0),unAtuendo.get(1),unAtuendo.get(2))); //testear que guarda esta wea
        }
        return this;

    }
    //TESTEAR///////////////////////////////////////////////////////////////////////////////

/*
    protected <T> List<List<T>> cartesianProduct(List<List<T>> lists) {
        List<List<T>> resultLists = new ArrayList<List<T>>();
        if (lists.size() == 0) {
            resultLists.add(new ArrayList<T>());
            return resultLists;
        } else {
            List<T> firstList = lists.get(0);
            List<List<T>> remainingLists = cartesianProduct(lists.subList(1, lists.size()));
            for (T condition : firstList) {
                for (List<T> remainingList : remainingLists) {
                    ArrayList<T> resultList = new ArrayList<T>();
                    resultList.add(condition);
                    resultList.addAll(remainingList);
                    resultLists.add(resultList);
                }
            }
        }
        return resultLists;
    }

    System.out.println(cartesianProduct(Arrays.asList(Arrays.asList("Apple", "Banana"), Arrays.asList("Red", "Green", "Blue"))));*/
}






/*////////////////////////////////NO ES NECESARIO ESTA VALIDACION, SE HACE EN EL SWITCH, LO DEJO POR LAS DUDAS////////////////////////////////////////
    public Guardarropa agregarPrendaSuperior(Prenda _prenda) {
        if (_prenda.categoria() == Categoria.PARTE_SUPERIOR) {
            this.prendasSuperiores.add(_prenda);
            return this;
        } else {
            throw new CategoriaInvalidaException("Categoria Invalida! Debe ser PARTE_SUPERIOR");
        }
    }

    public Guardarropa agregarPrendaInferior(Prenda _prenda) {
        if (_prenda.categoria() == Categoria.PARTE_INFERIOR) {
            this.prendasSuperiores.add(_prenda);
            return this;
        } else {
            throw new CategoriaInvalidaException("Categoria Invalida! Debe ser PARTE_INFERIOR");
        }
    }

    public Guardarropa agregarCalzado(Prenda _prenda) {
        if (_prenda.categoria() == Categoria.CALZADO) {
            this.prendasSuperiores.add(_prenda);
            return this;
        } else {
            throw new CategoriaInvalidaException("Categoria Invalida! Debe ser CALZADO");
        }
    }
    *////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

