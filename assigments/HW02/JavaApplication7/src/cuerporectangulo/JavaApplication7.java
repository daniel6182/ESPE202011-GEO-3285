package cuerporectangulo;

public class Rectangulo extends figurasgeometricas {
    private int base;
    private int altura;
    private double area;
    private double perimetro;
    private static int cantidad = 0;
    
    public Rectangulo(int b, int a){
       
    this.area=area;
    this.altura=altura;
        cantidad ++;
            } 
    public static int getcantidad(){
      return  cantidad;      
    }
    public int getBase() { 
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    } 
    public void setArea(double area) {
        this.area = area;
    }
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    @Override
public String getArea(int b, int a){
    double area=0;
        area=(b * a);
        return ("el area de rectangulo es:" + area);
    }
    @Override
    public String getperimetro(int b, int a){
        double perimetro=0;
        perimetro = (2 * b) + (2 * a);
        return ("el perimetro del rectangulo es:" + perimetro);
    }
}
        
        
        
    }
            
  
    
    
        


