import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


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

    @Test (expected = RuntimeException.class)
    public void creoPrendaSinMaterial()
    {
        try
        {
            prendaBorrador.setTipoDePrenda(TipoDePrenda.ZAPATO);
            prendaBorrador.crear();
        }
        catch(RuntimeException re)
        {
            String message = "Material es obligatorio";
            Assert.assertEquals(message, re.getMessage());
            throw re;
        }
    }

    @Test (expected = RuntimeException.class)
    public void creoPrendaSinColor()
    {
        try
        {
            prendaBorrador.setTipoDePrenda(TipoDePrenda.ZAPATO);
            prendaBorrador.setMaterial(Material.CUERO);
            prendaBorrador.crear();
        }
        catch(RuntimeException re)
        {
            String message = "color es obligatorio";
            Assert.assertEquals(message, re.getMessage());
            throw re;
        }
    }



    @Test (expected = RuntimeException.class)
    public void creoPrendaSinTipoDePrenda()
    {
        try
        {
            prendaBorrador.crear();
            //Run exception throwing operation here
        }
        catch(RuntimeException re)
        {
            String message = "Tipo de prenda es obligatorio";
            Assert.assertEquals(message, re.getMessage());
            throw re;
        }
    }


/*
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

*/

}
