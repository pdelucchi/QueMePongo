import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueMePongoTests {
    private Prenda prenda1;

    @Before
    public void initialize(){

        prenda1 = new Prenda(TipoDePrenda.REMERA, Material.CUERO, null);
    }

    //como hago el test?
    @Test
    public void colorNoPuedeSerNull() {
        new Assert.;
    }
}
