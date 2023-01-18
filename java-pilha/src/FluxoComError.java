public class FluxoComError {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    //Error sao encontrados mais em questao da jvm
    
    private static void metodo2() {
    	System.out.println("Chamando metodo 2");
    	metodo2();
    }
}