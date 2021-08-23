
package coordenadas;


public class Cilindrica {
    private float radio1;
    private float angulo1;
    private float z;

    public Cilindrica(float radio1, float angulo1, float z)
    {
        this.angulo1=angulo1;
        this.radio1=radio1;
        this.z=z;
    }

    public Cilindrica esferica_cilindrica(float p, float angazimutal, float angpolar) {
        float radio1=(float)Math.sqrt(Math.pow(p,2)Math.pow(Math.sin(angpolar),2));
        float angulo1=angazimutal;
        float z= p(float)Math.cos(angpolar);
        return new Cilindrica(radio1,angulo1,z);
    }

    public Cilindrica esferica_cilindrica(Esferica e){
        return esferica_cilindrica(e.getP(),e.getAngazimutal(),e.getAngpolar());
    }

    public float getRadio1() {
        return radio1;
    }

    public void setRadio1(float radio1) {
        this.radio1 = radio1;
    }

    public float getAngulo1() {
        return angulo1;
    }

    public void setAngulo1(float angulo1) {
        this.angulo1 = angulo1;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
}
