public class Problema4_ParqueBase {
    private int totalVisitantes;
    private int visitantesQueCumplen;

    public void registrarVisitante(Problema4_VisitanteBase visitante) {
        totalVisitantes++;
        if (visitante.getCumple()) {
            visitantesQueCumplen++;
        }
        System.out.println("\n--- Información del visitante ---");
        System.out.println(visitante.toString());
    }

    public String mostrarResumen() {
        return "\n--- RESUMEN DEL DÍA ---\n" +
               "Total de visitantes: " + totalVisitantes +
               "\nVisitantes que cumplen todos los requisitos: " + visitantesQueCumplen;
    }
}
