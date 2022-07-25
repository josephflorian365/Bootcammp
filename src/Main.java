public class Main {
    public static void main(String[] args) {
        int resultado = suma(1,2,3);
        System.out.println(resultado);
        Coche coche = new Coche();
        coche.incrementar();
        System.out.println(coche.numeroPuertas);
    }
    public static int suma(int a,int b,int c){
        var resultado = a + b + c;
        return resultado;
    }

}
class Coche{
    int numeroPuertas;

    public void incrementar(){
        numeroPuertas++;
    }
}