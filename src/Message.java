public class Message {
    private String texteContinuer;
    private String texteQuitter;
    private String texteperdu;


    public Message() {
        texteContinuer = "APPUYER SUR 'ENTER/ENTRÉE' POUR CONTINUER";
        texteQuitter = "APPUYER SUR 'DEL/SUPPR' POUR ABANDONNER";
        texteperdu = "APPUYER SUR 'ENTER/ENTRÉE' POUR RETOURNER AU MENU";
    }

    /**
     * Renvoie un ensemble de chaine de caractère
     * @return un ensemble de chaine de caractère
     */
    public EnsembleChaines getEnsembleChainesPasserLeNiveau(){
        EnsembleChaines ens = new EnsembleChaines();

        ens.ajouteChaine(28, 5,  texteContinuer, "red");
        ens.ajouteChaine(29, 3, texteQuitter, "red");
        return ens;
    }

    /**
     * Renvoie un ensemble de chaine de caractère
     * @return un ensemble de chaine de caractère
     */
    public EnsembleChaines getEnsembleChaines(){
        EnsembleChaines ens = new EnsembleChaines();
        ens.ajouteChaine(25, 4, texteperdu, "red");
        return ens;
    }
}

