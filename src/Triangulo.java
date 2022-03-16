public class Triangulo extends Figura implements Comparable<Triangulo> {

    
    private double base;
    private double altura;
    

    public double calcularArea() {
        
        return (base*altura) / 2;
    }

    
    public int ladosFigura() {

        return 3;
    }

    
    public int compareTo(Triangulo TrianguloPorComparar) {
        
        double miArea = this.calcularArea();
        double areaPorComparar = TrianguloPorComparar.calcularArea();
        int misLados = this.ladosFigura();
        int ladosPorComparar = TrianguloPorComparar.ladosFigura();

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
