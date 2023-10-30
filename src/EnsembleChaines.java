import java.util.ArrayList;
public class EnsembleChaines {
    
    ArrayList<ChainePositionnee> chaines;
    
    public EnsembleChaines(){chaines= new ArrayList<ChainePositionnee>(); }

    /**
     * Ajoute une chaîne de caractères à la liste de chaînes .
     * @param x la position horizontale de la chaîne à ajouter.
     * @param y la position verticale de la chaîne à ajouter.
     * @param c la chaîne de caractères à ajouter.
     * @param couleur la couleur de la chaîne à ajouter.
     */
    public void ajouteChaine(int x, int y, String c, String couleur){
        chaines.add(new ChainePositionnee(x,y,c,couleur));}


    /**
     * Ajoute toutes les chaînes de caractères d'un autre ensemble à cet ensemble.
     * @param e l'ensemble à assembler avec cet ensemble.
     */
    public void union(EnsembleChaines e){
        for(ChainePositionnee c : e.chaines)
            chaines.add(c);
    }

    /**
     * Vérifie si la position indiqué est occupée par une chaîne de caractères dans cet ensemble.
     * @param x la position horizontale à vérifier.
     * @param y la position verticale à vérifier.
     * @return true si la position indiqué est occupée par une chaîne de caractères dans cet ensemble false sinon.
     */
    public boolean contient(int x, int y) {
        for (ChainePositionnee c : chaines) {
            String chaine = c.getChaine();
            int chaineX = c.getPosX();
            int chaineY = c.getPosY();
            int longueur = chaine.length();
            for (int i = 0; i < longueur; i++) {
                if (chaineX + i == x && chaineY == y) {
                    return true;
                }
            }
        }
        return false;
    }
    
    
    
}
