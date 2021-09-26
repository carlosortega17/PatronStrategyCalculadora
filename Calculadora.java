public class Calculadora
{
    public static void main(String[] args)
    {
        OperacionAritmetica calculadora;
        // Suma
        calculadora = new OperacionAritmetica(new Sumar());
        int suma = calculadora.procesar(10, 10);
        // Resta
        calculadora = new OperacionAritmetica(new Restar());
        int resta = calculadora.procesar(10, 4);
        // Multiplicacion
        calculadora = new OperacionAritmetica(new Multiplicar());
        int multiplicacion = calculadora.procesar(3, 4);
        // Division
        calculadora = new OperacionAritmetica(new Dividir());
        int division = calculadora.procesar(120, 4);
        // Resultados:
        System.out.println("Suma: "+suma);
        System.out.println("Resta: "+resta);
        System.out.println("Multipliacion: "+multiplicacion);
        System.out.println("Division: "+division);
    }    
}