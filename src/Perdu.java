public class Perdu {

    /**
     * Cette méthode retourne un objet EnsembleChaines qui contient un ensemble de chaînes représentant "vous avez perdu" en ASCII Art du jeu.
     * @return un objet EnsembleChaines qui contient un ensemble de chaînes représentant "vous avez perdu" en ASCII Art du jeu.
     */
    public EnsembleChaines getEnsembleChaines(){
        EnsembleChaines ens = new EnsembleChaines();
        ens.ajouteChaine(30,50,"██╗    ██╗█████╗ ██╗   ██╗ ██████╗","orange");
        ens.ajouteChaine(30,49,"██║   ██║██╔══██╗██║   ██║██╔════╝","orange");
        ens.ajouteChaine(30,48,"╚██╗ ██╔╝██║  ██║██║   ██║╚█████╗ ","orange");
        ens.ajouteChaine(30,47," ╚████╔╝ ██║  ██║██║   ██║ ╚═══██╗","orange");
        ens.ajouteChaine(30,46,"  ╚██╔╝  ╚█████╔╝╚██████╔╝██████╔╝","orange");
        ens.ajouteChaine(30,45,"   ╚═╝    ╚════╝  ╚═════╝ ╚═════╝ ","orange");

        ens.ajouteChaine(6,40," █████╗ ██╗   ██╗███████╗███████╗","orange");
        ens.ajouteChaine(6,39,"██╔══██╗██║   ██║██╔════╝╚════██║","orange");
        ens.ajouteChaine(6,38,"███████║╚██╗ ██╔╝█████╗    ███╔═╝","orange");
        ens.ajouteChaine(6,37,"██╔══██║ ╚████╔╝ ██╔══╝  ██╔══╝  ","orange");
        ens.ajouteChaine(6,36,"██║  ██║  ╚██╔╝  ███████╗███████╗","orange");
        ens.ajouteChaine(6,35,"╚═╝  ╚═╝   ╚═╝   ╚══════╝╚══════╝","orange");

        ens.ajouteChaine(55,40,"██████╗ ███████╗██████╗ ██████╗ ██╗   ██╗","orange");
        ens.ajouteChaine(55,39,"██╔══██╗██╔════╝██╔══██╗██╔══██╗██║   ██║","orange");
        ens.ajouteChaine(55,38,"██████╔╝█████╗  ██████╔╝██║  ██║██║   ██║","orange");
        ens.ajouteChaine(55,37,"██╔═══╝ ██╔══╝  ██╔══██╗██║  ██║██║   ██║","orange");
        ens.ajouteChaine(55,36,"██║     ███████╗██║  ██║██████╔╝╚██████╔╝","orange");
        ens.ajouteChaine(55,35,"╚═╝     ╚══════╝╚═╝  ╚═╝╚═════╝  ╚═════╝ ","orange");
        return ens;
    }
}
