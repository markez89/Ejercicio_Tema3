public class Main {
    public static void main(String[] args) {

        // Parte 1
        Suma(5,4,7);

        //Parte 2
        Coche miCoche = new Coche();
        miCoche.addPuerta();
        miCoche.addPuerta();
        miCoche.addPuerta();
        System.out.println("El número de puertas del coche es: " + miCoche.numeroPuertas);
    }

    public static void Suma(int a, int b, int c){
        int resultado = 0;
        resultado = a + b+ c;

        System.out.println("El resultado de la suma es: "+resultado);
    }
}

class Coche {
    public int numeroPuertas = 0;

    public void addPuerta(){
        this.numeroPuertas++;
    }

}

