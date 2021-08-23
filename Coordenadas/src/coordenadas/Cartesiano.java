
package coordenadas;

public class Cartesiano
{
    private float x;
    private float y;

    public Cartesiano(float x, float y)
    {
        this.x=x;
        this.y=y;
    }

    Cartesiano(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Cartesiano polar_cartesiano(float radio, double angulo)
    {
        float x=radio(float)Math.cos(angulo);
        float y=radio(float)Math.sin(angulo);
        return new Cartesiano(x,y);
    }

    public Cartesiano polar_cartesiano1(Polar p)
    {
        return polar_cartesiano(p.getRadio(),p.getAngulo());
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}
