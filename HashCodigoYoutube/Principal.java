public class Principal {
    public static void main(String[] args) {
        HashTable hash = new HashTable(8);
        String[] elementos = {"20","33","21","10","12","14","56","35",};
        hash.funcionHash(elementos, hash.arreglo);
        hash.mostrar();
        String buscado = hash.buscarClave("33");
        if(buscado==null){
            System.out.println("El elemento 33 no existe en la lista.");
        }
    }
}
