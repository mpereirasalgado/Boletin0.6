
package boletin0.pkg6;
/**@author mpereirasalgado*/
public class Boletin06 
{
    public static void main(String[] args) 
    {
        double base, altura;
        String cor;
        Rectangulo rec1 = new Rectangulo();
        rec1.setBase(28.2);
        base = rec1.getBase();
        System.out.println("Base : "+ base);
        rec1.setAltura(45.2);
        altura = rec1.getAltura();
        System.out.println("Altura : "+ altura);
        System.out.println("Area = "+(base*altura));
        rec1.setCor("negro");
        cor = rec1.getCor();
        System.out.println("Cor : "+ cor);
        
        
    }
    
}
