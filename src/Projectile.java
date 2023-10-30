public class Projectile {
    private double positionX;
    private double positionY;



    public Projectile(double positionX,double positionY){
        this.positionX = positionX;
        this.positionY = positionY;
    }

    /**
     * Cette methode renvoie la position X du projectile du vaisseaux.
     * @return retourne la position X du projectile du vaisseaux.
     */
    public double getPositionX(){
        return this.positionX;
    }

    /**
     * Cette methode renvoie la position Y du projectile du vaisseaux.
     * @return retourne la position Y du projectile du vaisseaux.
     */
    public double getPositionY(){
        return this.positionY;
    }

    /**
     * Modifie la position verticale du projectile en ajoutant 1.
     * @return la valeur de déplacement à ajouter 1 à la position verticale actuelle du projectile.
     */
    public double evolue(){
        return positionY += 1;
    }
    
    
    /**
     * Renvoie un ensemble de chaine de caractère.
     * @return un ensemble de chaine de caractère.
     */
    public EnsembleChaines getEnsembleChaines(){
        EnsembleChaines ens = new EnsembleChaines();
        ens.ajouteChaine((int)this.positionX, (int)this.positionY, "|","white");
        return ens;
    }

    
}
