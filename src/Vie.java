public class Vie{
    private int vie;

    public Vie(){
        this.vie = 3;
    }

    /**
     * Retourne le nombre de vies restantes.
     * @return Un entier représentant le nombre de vies restantes du joueur.
     */
    public int getVie(){
        return this.vie;
    }

    /**
     * Diminue le nombre de vies du joueur de 1.
     */
    public void decrementeVie(){
        this.vie -= 1;
    }

    /**
     * Renvoie un ensemble de chaine de caractère.
     * @return un ensemble de chaine de caractère.
     */
    public EnsembleChaines getEnsembleChaines(){
        EnsembleChaines ens = new EnsembleChaines();
        // Changement de vaisseau en fonction des vie restant.
        if(this.vie == 3){
            ens.ajouteChaine(35, 58, " ▄██▄██▄" + "\n" + " ▀█████▀" + "\n"+  "   ▀█▀", "red");
            ens.ajouteChaine(44, 58, " ▄██▄██▄" + "\n" + " ▀█████▀" + "\n"+  "   ▀█▀", "red");
            ens.ajouteChaine(53, 58, " ▄██▄██▄" + "\n" + " ▀█████▀" + "\n"+  "   ▀█▀", "red");
        }

        if(this.vie == 2){
            ens.ajouteChaine(40, 58, " ▄██▄██▄" + "\n" + " ▀█████▀" + "\n"+  "   ▀█▀", "red");
            ens.ajouteChaine(49, 58, " ▄██▄██▄" + "\n" + " ▀█████▀" + "\n"+  "   ▀█▀", "red");
        }

        if(this.vie == 1){
            ens.ajouteChaine(43, 58, " ▄██▄██▄" + "\n" + " ▀█████▀" + "\n"+  "   ▀█▀", "red");
        }
        return ens;
    }
    
    @Override
    public String toString(){
        return "Vie : " + this.vie;
    }
    
}