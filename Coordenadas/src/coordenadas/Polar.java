
package coordenadas;


public class Polar
{
    private float radio;
    private float angulo; //radianes

    public Polar (float radio,float angulo)
    {
        this.radio=radio;
        this.angulo=angulo;
    }

    Polar(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Polar cartesiano_polar(float x, float y)
    {
        float radio=(float)Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        float angulo=(float)Math.atan(y/x);
        return new Polar(radio,angulo);
    }

    public Polar cartesiano_polar(Cartesiano c)
    {
        return cartesiano_polar(c.getX(),c.getY());
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getAngulo() {
        return angulo;
    }

    public void setAngulo(float angulo) {
        this.angulo = angulo;
    }
}