public class ProjectileAlien {
    private double positionX;
    private double positionY;
    private double vitesse = 1.3;



    public ProjectileAlien(double positionX,double positionY){
        this.positionX = positionX;
        this.positionY = positionY;
    }

    
    /**
     * Cette methode renvoie la position X du projectile de l'alien.
     * @return retourne la position X du projectile de l'alien.
     */
    public double getPositionX(){
        return this.positionX;
    }

    /**
     * Cette methode renvoie la position Y du projectile de l'alien.
     * @return retourne la position Y du projectile de l'alien.
     */
    public double getPositionY(){
        return this.positionY;
    }

    /**
     * Modifie la position verticale du projectile en retirant 1.
     * @return la valeur de déplacement à retirant 1 à la position verticale actuelle du projectile.
     */
    public double evolue(){
        return positionY -= vitesse;
    }
    
    /**
     * Renvoie un ensemble de chaine de caractère.
     * @return un ensemble de chaine de caractère.
     */
    public EnsembleChaines getEnsembleChaines(){
        EnsembleChaines ens = new EnsembleChaines();
        ens.ajouteChaine((int)this.positionX, (int)this.positionY, "█","red");
        return ens;
    }

  
}
