public class bicicletas {
    public bicicletas(){
    }
    public static void main(String[] args) {
        bici p = new bici();
        System.out.println("---- DATOS BICICLETA P ----" );
        System.out.println("Marca: " + p.getMarca());
        System.out.println("Color: " + p.getColor());
        System.out.println("Anio: " + p.getAnio());
        System.out.println("Marchas: " + p.getMarchas());

        bici q = new bici();
        System.out.println("---- DATOS BICICLETA Q ----" );
        p.setMarca("BIANCHI");
        System.out.println("Marca: " + p.getMarca());
        p.setColor("VERDE");
        System.out.println("Color: " + p.getColor());
        p.setAnio(2018);
        System.out.println("Anio: " + p.getAnio());
        p.setMarchas(4);
        System.out.println("Marchas: " + p.getMarchas());

    }
}
