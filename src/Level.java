public class Level {
    private int niveau;

    /**
     * Renvoie le niveau actuelle.
     * @return le niveau actuelle.
     */
    public int getNiveau(){
        return this.niveau;
    }

    /**
     * Modifie le niveau de difficulté du jeu.
     * @param newNiveau le nouveau niveau de difficulté à appliquer.
     */
    public void setNiveau(int newNiveau){
        this.niveau = newNiveau;
    }

    /**
     * Renvoie le score du joueur.
     * @return le score du joueur.
     */
    public EnsembleChaines getEnsembleChaines(){
        EnsembleChaines ens = new EnsembleChaines();
        ens.ajouteChaine(90, 58,toString(), "white");
        return ens;
    }

    @Override
    public String toString(){
        return "Level: " + this.niveau;
    }
}
