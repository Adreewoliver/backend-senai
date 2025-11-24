public class OperadoresLogicos {
    public static void main(String[] args) throws Exception {
        int a = 10;
        int b = 20;
        int c = 10;

        // Operador AND lógico (&&)
        boolean resultadoAnd = (a < b) && (a == c);
        System.out.println("Resultado do AND lógico: " + resultadoAnd); // true

        // Operador OR lógico (||)
        boolean resultadoOr = (a > b) || (a == c);
        System.out.println("Resultado do OR lógico: " + resultadoOr); // true

        // Operador NOT lógico (!)
        boolean resultadoNot = !(a < b);
        System.out.println("Resultado do NOT lógico: " + resultadoNot); // false
        
    }
}
