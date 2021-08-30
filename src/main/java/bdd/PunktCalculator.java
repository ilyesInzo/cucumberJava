package bdd;

public class PunktCalculator {

    private SmoothieSchema smoothieSchema;
    private int points = 0;
    PunktCalculator(SmoothieSchema smoothieSchema){

        this.smoothieSchema = smoothieSchema;
    }

    public void order(String getrank, Integer menge) {
        System.out.println(smoothieSchema.getPunktFor(getrank));
        points +=smoothieSchema.getPunktFor(getrank) *  menge;
    }

    public Integer getPunkte() {

        return points ;
    }
}
