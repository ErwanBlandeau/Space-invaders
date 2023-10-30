public class Vaisseau{
    private double posX = 41;


    /**
     * Cette methode renvoie la position X du vaisseaux.
     * @return retourne la position X du vaisseaux.
     */
    public double getPosX(){
        return this.posX;
    }

    /**
     * Cette methode renvoie la position Y du vaisseaux.
     * @return retourne la position Y du vaisseaux.
     */
    public double getPosY(){
        return 5.0;
    }

    /**
     * Cette methode renvoie la largeur du vaisseaux.
     * @return retourne la largeur du vaisseaux.
     */
    public int getLargeur(){
        return 13;
    }

    /**
     * Cette methode renvoie la hauteur du vaisseaux.
     * @return retourne la hauteur du vaisseaux.
     */
    public int getHauteur(){
        return 1;
    }

    /**
     * Modifie la position horizontale du vaisseaux en ajoutant la valeur de déplacement spécifiée.
     * @param dx la valeur de déplacement à ajouter à la position horizontale actuelle du vaisseaux.
     */
    public void deplace(double dx){
        posX += dx;
    }

    

    /**
     * Vérifie si les coordonnées (x, y) sont situées à l'intérieur de l'objet Alien.
     * @param x la coordonnée horizontale à vérifier.
     * @param y la coordonnée verticale à vérifier.
     * @return true si les coordonnées sont situées à l'intérieur de l'objet Alien, false sinon.
     */
    public boolean contient(int x, int y){
        if(posX < x && x < posX + getLargeur() && 1 < y && y < 5){
            return true;
        }
        return false;
    }

    
    /**
     * Retourne la position x du canon en ajoutant une constante de décalage de 6.
     * @return Un double représentant la position x du canon.
     */
    public double positionCanon(){
        return posX+6;
    }

    /**
     * Renvoie un ensemble de chaine de caractère.
     * @return un ensemble de chaine de caractère.
     */
    public EnsembleChaines getEnsembleChainesTroisVie(){
        EnsembleChaines ens = new EnsembleChaines();
        ens.ajouteChaine((int)posX,5,"      ▄      ","green");
        ens.ajouteChaine((int)posX,4,"     ███     ","green");
        ens.ajouteChaine((int)posX,3,"▄███████████▄","green");
        ens.ajouteChaine((int)posX,2,"█████████████","green");
        ens.ajouteChaine((int)posX,1,"█████████████","green");
        ens.ajouteChaine((int)posX,0,"             ","green");
        return ens; // Modelisation du vaisseaux si le vaisseau à trois vie.
    }

    /**
     * Renvoie un ensemble de chaine de caractère.
     * @return un ensemble de chaine de caractère.
     */
    public EnsembleChaines getEnsembleChainesDeuxVie(){
        EnsembleChaines ens = new EnsembleChaines();
        ens.ajouteChaine((int)posX,5,"      ▄      ","orange");
        ens.ajouteChaine((int)posX,4,"     ███     ","orange");
        ens.ajouteChaine((int)posX,3,"▄███████████▄","orange");
        ens.ajouteChaine((int)posX,2,"███  ███████ ","orange");
        ens.ajouteChaine((int)posX,1," ████ ████ ██","orange");
        ens.ajouteChaine((int)posX,0,"             ","orange");
        return ens; // Modelisation du vaisseaux si le vaisseau à deux vie.
    }

    /**
     * Renvoie un ensemble de chaine de caractère.
     * @return un ensemble de chaine de caractère.
     */
    public EnsembleChaines getEnsembleChainesUneVie(){
        EnsembleChaines ens = new EnsembleChaines();
        ens.ajouteChaine((int)posX,5,"      ▄      ","red");
        ens.ajouteChaine((int)posX,4,"     ███     ","red");
        ens.ajouteChaine((int)posX,3,"▄██ ████ ███▄","red");
        ens.ajouteChaine((int)posX,2,"█ █  ██ ████ ","red");
        ens.ajouteChaine((int)posX,1," █ ██ ██ █ ██","red");
        ens.ajouteChaine((int)posX,0,"             ","red");
        return ens; // Modelisation du vaisseaux si le vaisseau à une vie.
    }

    
}
