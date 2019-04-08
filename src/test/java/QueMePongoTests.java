import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueMePongoTests {
    private Prenda prenda1;
    private PrendaBorrador prendaBorrador;

    @Before
    public void initialize(){

        prendaBorrador = new PrendaBorrador();

    }

    @Test (expected = MaterialInvalidoException.class)
    public void fallaPorMaterialInvalido(){
        prendaBorrador.setTipoDePrenda(TipoDePrenda.ZAPATO);
        prendaBorrador.setMaterial(Material.ORO);
        prendaBorrador.crear();
    }


    @Test
    public void tipoDePrendaConMaterialValido(){
        prendaBorrador.setTipoDePrenda(TipoDePrenda.ZAPATO);
        prendaBorrador.setMaterial(Material.CUERO);
        prendaBorrador.setColor(new Color(12,34,51));
        prendaBorrador.crear();
    }

    @Test(expected = NullPointerException.class)
    public void creoPrendaSintipo(){
        prendaBorrador.crear();
    }


    @Test(expected = NullPointerException.class)
    public void creoPrendaSinColor(){
        prendaBorrador.setTipoDePrenda(TipoDePrenda.ZAPATO);
        prendaBorrador.setMaterial(Material.CUERO);
        prendaBorrador.crear();
    }

    @Test(expected = NullPointerException.class)
    public void creoPrendaSinMaterial(){
        prendaBorrador.setTipoDePrenda(TipoDePrenda.ZAPATO);
        prendaBorrador.crear();
    }




}
