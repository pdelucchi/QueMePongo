import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static java.util.Objects.requireNonNull;

public class Prenda {
    private TipoDePrenda tipoDePrenda;
    private Material material;
    private Color color;
    private Trama trama;
    private Color colorSecundario;
    private BufferedImage imagen;


    Prenda(TipoDePrenda _tipoDePrenda, Material _material, Color _color, Trama _trama,Color _colorSecundario){
        this.tipoDePrenda = _tipoDePrenda;
        this.material = _material;
        this.color = _color;
        this.trama = _trama;
        this.colorSecundario = _colorSecundario;
    }

    public Categoria categoria(){
        return tipoDePrenda.categoria();
    }

    public TipoDePrenda tipoDePrenda(){
        return this.tipoDePrenda;
    }

    public Prenda setColorSecundario(Color _colorSecundario){
        this.colorSecundario = _colorSecundario;
        return this;
    }

    //Setter Imagen//
    public BufferedImage insertarImagenPrenda(String path) throws IOException {
        int width = 963;    //ancho imagen
        int height = 640;   //largo imagen
        try {
            File folderInput = new File(path); //path de la imagen

            imagen = ImageIO.read(folderInput);
            imagen = new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB); //reformato de la imagen

        }
        catch(IOException e){
            System.out.println("Error: "+e);
        }
        return imagen;
    }
    public void insertarImagenPrenda2(String path) throws IOException {

    }

    /*@Override
    public String toString() {
        return "Tipo";
    }*/
}
