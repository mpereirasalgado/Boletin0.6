
package boletin0.pkg6;
/**@author mpereirasalgado*/
public class Rectangulo 
{
    //atributos
    public String cor;
    private double base;
    private double altura;
    //constructores
    public Rectangulo()//por defecto
    {
        
    }
    public Rectangulo(String c,double b,double al)//con parametros
    {
        cor = c;
        base = b;
        altura = al;//podese por this.altura=altura pondo tamen altura en vez de al no parametro
    }
    public Rectangulo(double base,double al)//con parametros es para probar sobrecarga de metodos
    {
        this.base = base;
        altura = al;
    }
    //metodos de acceso(gettes settes)
    public void setBase(double b)
    {
        base = b;
    }
    public double getBase()
    {
        return base;
    }
    public void setAltura(double al)
    {
        altura = al;
    }
    public double getAltura()
    {
        return altura;
    }
    public void setCor(String c)
    {
        cor = c;
    }
    public String getCor()
    {
        return cor;
    }
}
