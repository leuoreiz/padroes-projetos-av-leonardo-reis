public class Main {
    public static void main(String[] args) {
        iFabricaMatricula<Brasil> fabricaBrasil = new FabricaBrasil();
        iFabricaMatricula<Chile> fabricaChile = new FabricaChile();

        Matricula<Brasil> brasil = new Matricula<>(fabricaBrasil);
        Matricula<Chile> chile = new Matricula<>(fabricaChile);

        brasil.confirmar("Leonardo Reis ", "000.000.000-00", 1000);
        chile.confirmar("Sofia", "12.345.678-5", 1000);
    }
}
