
public class Circulo extends Figura implements Comparable<Circulo>{
    
    private double radio;

    public Circulo(double radio){
        this.radio = radio;
    }

    public double calcularArea(){
        return 2*(Math.PI)*radio;
    }

    public int ladosFigura(){
        return 1;
    }

    
    public int compareTo(Circulo circuloPorComparar) {
        
        double miArea = this.calcularArea();
        double areaPorComparar = circuloPorComparar.calcularArea();
        int misLados = this.ladosFigura();
        int ladosPorComparar = circuloPorComparar.ladosFigura();


        if (miArea == areaPorComparar && misLados == ladosPorComparar){
            return 0;
        }
        
        else if (miArea > areaPorComparar){
            return 1;
        }
        
        else{
            return -1;
        }
    }

}
