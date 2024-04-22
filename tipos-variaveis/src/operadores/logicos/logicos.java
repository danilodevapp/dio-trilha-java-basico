package operadores.logicos;

public class logicos {
    public static void main(String[] args) {
        int num1, num2, num3;
        num1 = 10;
        num2 = 11;
        num3 = 12;

        if ((num1<num2) && (num3<num2)){
            System.out.println("são verdadeiras!");            
        }
        else if ((num1 > num2) || !(num3 < num1)) {
            System.out.println("Uma das duas há de ser verdadeira!");
        }
        else        
            System.out.println("Nenhuma condição contempla a verdade!");        
        
    }
}
