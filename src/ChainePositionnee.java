public class ChainePositionnee{
    int x,y;
    String c;
    String couleur;
    public ChainePositionnee(int a,int b, String d, String couleurs){x=a; y=b; c=d; couleur=couleurs;}

    /**
     * Renvoie la position X de la chaine
     * @return la position X de la chaine
     */
    public int getPosX() {
        return x;
    }

    /**
     * Renvoie la position Y de la chaine
     * @return la position Y de la chaine
     */
    public int getPosY() {
        return y;
    }

    /**
     * Renvoie la chaine 
     * @return la chaine
     */
    public String getChaine() {
        return c;
    }

    /**
     * Renvoie la couleur de la chaine
     * @return la couleur de la chaine
     */
    public String getCouleur() {
        return couleur;
    }
}
