public class Alien{
    private double posY;
    private double posX;
    private double vitesse;

    public Alien(double x, double y){
        this.posX = x;
        this.posY = y;
        this.vitesse = 0.1;
    } 

    /**
     * Cette methode renvoie la position X de l'alien.
     * @return retourne la position X de l'alien.
     */
    public double getPosX(){
        return this.posX;
    }

    /**
     * Cette methode renvoie la position Y de l'alien.
     * @return retourne la position Y de l'alien.
     */
    public double getPosY(){
        return this.posY;
    }

    /**
     * Cette methode renvoie la largeur de l'alien.
     * @return retourne la largeur de l'alien.
     */
    public int getLargeur(){
        return 13;
    }

    /**
     * Cette methode renvoie la hauteur de l'alien.
     * @return retourne la hauteur de l'alien.
     */
    public int getHauteur(){
        return 5;
    }

    /**
     * Modifie la position horizontale de l'alien en ajoutant la valeur de déplacement spécifiée.
     * @param nombreY la valeur de déplacement à ajouter à la position horizontale actuelle de l'alien.
     */
    public void evolue(double nombreY) {
        this.posX += vitesse;
        this.posY += nombreY;
    }

    /**
     * Modifie la position horizontale de l'alien en ajoutant la valeur de déplacement spécifiée.
     * @param nombreY la valeur de déplacement à ajouter à la position horizontale actuelle de l'alien.
     */
    public void evolueInverse(double nombreY) {
        this.posX += -vitesse;
        this.posY += nombreY;
    }


    /**
     * Incrémente la vitesse de l'objet en ajoutant la valeur de vitesse spécifiée.
     * @param vitesse la valeur de vitesse à ajouter à la vitesse actuelle de l'objet.
     */
    public void incrementeVitesse(double vitesse) {
        this.vitesse += vitesse;
    }

    /**
     * Renvoie la position horizontale du canon de l'alien.
     * @return la position horizontale du canon de l'alien.
     */
    public double posCanonAlienX(){
        return this.posX + 8;
    }

    /**
     * Renvoie la position verticale du canon de l'alien.
     * @return la position verticale du canon de l'alien.
     */
    public double posCanonAlienY(){
        return this.posY + 2;
    }
    

   
    /**
     * Renvoie un ensemble de chaine de caractère.
     * @return un ensemble de chaine de caractère.
     */
    public EnsembleChaines getEnsembleChaines(){
        EnsembleChaines ens = new EnsembleChaines();
        ens.ajouteChaine((int)posX,(int)posY+5,"      ▄▀  ▄▀     ","purple");
        ens.ajouteChaine((int)posX,(int)posY+4,"    ▄█▀███▀█▄    ","purple");
        ens.ajouteChaine((int)posX,(int)posY+3,"   █▀███████▀█   ","purple");
        ens.ajouteChaine((int)posX,(int)posY+2,"   █ █▀▀▀▀▀█ █   ","purple");
        ens.ajouteChaine((int)posX,(int)posY+1,"      ▀▀ ▀▀      ","purple");
        return ens; // Modélisation de l'Alien.
    }

    
    /**
     * Renvoie un ensemble de chaine de caractère.
     * @return un ensemble de chaine de caractère.
     */
    public EnsembleChaines getEnsembleChainesAnime(){
        EnsembleChaines ens = new EnsembleChaines();
        ens.ajouteChaine((int)posX,(int)posY+5,"      ▀▄ ▀▄     ","purple");
        ens.ajouteChaine((int)posX,(int)posY+4,"    ▄█▀███▀█▄    ","purple");
        ens.ajouteChaine((int)posX,(int)posY+3,"   █▀███████▀█   ","purple");
        ens.ajouteChaine((int)posX,(int)posY+2,"   █ █▀▀▀▀▀█ █   ","purple");
        ens.ajouteChaine((int)posX,(int)posY+1,"    ▄▀     ▀▄  ","purple");
        return ens; // Modelisation de l'alien qui est dans une autre position
    }


    @Override
    public String toString(){
        return ""+this.posX;
    }
}   