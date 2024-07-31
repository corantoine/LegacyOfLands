package model;

import java.util.HashMap;
import java.util.Map;

// Le marchand et le commerce sont une sorte d'évènement car pas toujours présent.
// Utilisation de boolean et de condition
//TODO en cours de dvl

public class Marchand {
    private boolean marchandIsHere = false;


    public void setMarchandIsHere(boolean marchandIsHere) {
        this.marchandIsHere = marchandIsHere;
    }
}
