import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;


public class QueMePongoTests {
    //private Prenda prenda1;
    private PrendaBorrador prendaBorrador;
    private PrendaBorrador prendaBorradorRemera1;
    private PrendaBorrador prendaBorradorRemera2;
    private PrendaBorrador prendaBorradorPantalon1;
    private PrendaBorrador prendaBorradorPantalon2;
    private PrendaBorrador prendaBorradorCalzado1;
    private PrendaBorrador prendaBorradorCalzado2;
    private Prenda prendaRemera1;
    private Prenda prendaRemera2;
    private Prenda prendaPantalon1;
    private Prenda prendaPantalon2;
    private Prenda prendaCalzado1;
    private Prenda prendaCalzado2;
    private Guardarropa guardarropa1;
    private Atuendo atuendo1,atuendo2,atuendo3,atuendo4,atuendo5,atuendo6,atuendo7,atuendo8;

    @Before
    public void initialize(){

        prendaBorrador = new PrendaBorrador();

        prendaBorradorRemera1 = new PrendaBorrador();
        prendaBorradorRemera2 = new PrendaBorrador();
        prendaBorradorPantalon1 = new PrendaBorrador();
        prendaBorradorPantalon2 = new PrendaBorrador();
        prendaBorradorCalzado1 = new PrendaBorrador();
        prendaBorradorCalzado2 = new PrendaBorrador();

        prendaBorradorRemera1.setTipoDePrenda(TipoDePrenda.REMERA);
        prendaBorradorRemera1.setMaterial(Material.ALGODON);
        prendaBorradorRemera1.setColor(new Color(12,34,51));
        prendaRemera1 = prendaBorradorRemera1.crear();

        prendaBorradorRemera2.setTipoDePrenda(TipoDePrenda.REMERA);
        prendaBorradorRemera2.setMaterial(Material.SEDA);
        prendaBorradorRemera2.setColor(new Color(14,20,10));
        prendaRemera2 = prendaBorradorRemera2.crear();

        prendaBorradorPantalon1.setTipoDePrenda(TipoDePrenda.PANTALON);
        prendaBorradorPantalon1.setMaterial(Material.CORDEROY);
        prendaBorradorPantalon1.setColor(new Color(14,20,10));
        prendaPantalon1 = prendaBorradorPantalon1.crear();

        prendaBorradorPantalon2.setTipoDePrenda(TipoDePrenda.PANTALON);
        prendaBorradorPantalon2.setMaterial(Material.JEAN);
        prendaBorradorPantalon2.setColor(new Color(14,24,50));
        prendaPantalon2 = prendaBorradorPantalon2.crear();

        prendaBorradorCalzado1.setTipoDePrenda(TipoDePrenda.ZAPATO);
        prendaBorradorCalzado1.setMaterial(Material.CUERO);
        prendaBorradorCalzado1.setColor(new Color(12,24,60));
        prendaCalzado1 =  prendaBorradorCalzado1.crear();

        prendaBorradorCalzado2.setTipoDePrenda(TipoDePrenda.ZAPATO);
        prendaBorradorCalzado2.setMaterial(Material.SINTETICO);
        prendaBorradorCalzado2.setColor(new Color(14,24,50));
        prendaCalzado2 = prendaBorradorCalzado2.crear();

        guardarropa1 = new Guardarropa();

        guardarropa1.incluirEnGuardarropa(prendaRemera1);
        guardarropa1.incluirEnGuardarropa(prendaRemera2);
        guardarropa1.incluirEnGuardarropa(prendaPantalon1);
        guardarropa1.incluirEnGuardarropa(prendaPantalon2);
        guardarropa1.incluirEnGuardarropa(prendaCalzado1);
        guardarropa1.incluirEnGuardarropa(prendaCalzado2);
        /*
        prendaRemera1 prendaRemera2;
        prendaPantalon1 prendaPantalon2;
        prendaCalzado1 prendaCalzado2;
        */
        atuendo1 = new Atuendo(prendaRemera1,prendaPantalon1,prendaCalzado1);
        atuendo2 = new Atuendo(prendaRemera1,prendaPantalon1,prendaCalzado2);
        atuendo3 = new Atuendo(prendaRemera1,prendaPantalon2,prendaCalzado1);
        atuendo4 = new Atuendo(prendaRemera1,prendaPantalon2,prendaCalzado2);
        atuendo5 = new Atuendo(prendaRemera2,prendaPantalon1,prendaCalzado1);
        atuendo6 = new Atuendo(prendaRemera2,prendaPantalon1,prendaCalzado2);
        atuendo7 = new Atuendo(prendaRemera2,prendaPantalon2,prendaCalzado1);
        atuendo8 = new Atuendo(prendaRemera2,prendaPantalon2,prendaCalzado2);




    }
/*
    @Test //(expected = MaterialInvalidoException.class)
    public void validarMaterialValidoRemera1(){
        List<Material> listaPrendasValidas = Arrays.asList(Material.ALGODON,Material.SEDA);
       Assert.assertEquals(prendaRemera1.tipoDePrenda(),listaPrendasValidas);
    }
*/
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

    @Test
    public void verificoListadePrendasSuperiorEnGuardarropa1 (){
        List<Prenda> listaPrendasSuperiores = Arrays.asList(prendaRemera1,prendaRemera2);
        Assert.assertEquals(guardarropa1.getPrendasSuperiores(),listaPrendasSuperiores);
    }

    @Test
    public void sizeDeListaDeListasDePrendas (){
        guardarropa1.sugerir();
        Assert.assertEquals(8,guardarropa1.getListadeListasDePrendas());

        /*
        A B
        C D
        E F

        8 Combinaciones Posibles (Prod Cartesiano)

        ACE
        ACF
        ADE
        ADF
        BCE
        BCF
        BDE
        BDF
        */
    }
    @Test
    public void verificoGuardarropa1LuegoDeSugerirAtuendos (){ //COMPARO LOS DIFERENTES ATUENDOS PRE-ARMADOS CON LOS GENERADOS POR GUARDARROPA.SUGERIR. -> VER DE HACERLO ITERATIVO PARA VERIFICAR TODAS
        //LAS COMBINACIONES POSIBLES
        List<Atuendo> listaDeAtuendos = Arrays.asList(atuendo1,atuendo2,atuendo3,atuendo4,atuendo5,atuendo6,atuendo7,atuendo8);
        guardarropa1.sugerir();
        Assert.assertEquals(listaDeAtuendos.get(0).mostrarFalopaSuperior(),guardarropa1.getAtuendos().get(0).mostrarFalopaSuperior());
        Assert.assertEquals(listaDeAtuendos.get(0).mostrarFalopaInferior(),guardarropa1.getAtuendos().get(0).mostrarFalopaInferior());
        Assert.assertEquals(listaDeAtuendos.get(0).mostrarFalopaCalzado(),guardarropa1.getAtuendos().get(0).mostrarFalopaCalzado());
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
