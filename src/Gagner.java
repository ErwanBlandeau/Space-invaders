public class Gagner{

    /**
     * Cette méthode retourne un objet EnsembleChaines qui contient un ensemble de chaînes représentant "vous avez gagner" en ASCII Art du jeu.
     * @return un objet EnsembleChaines qui contient un ensemble de chaînes représentant "vous avez gagner" en ASCII Art du jeu.
     */
    public EnsembleChaines getEnsembleChaines(){
        EnsembleChaines ens = new EnsembleChaines();
        ens.ajouteChaine(30,50,"██╗    ██╗█████╗ ██╗   ██╗ ██████╗","green");
        ens.ajouteChaine(30,49,"██║   ██║██╔══██╗██║   ██║██╔════╝","green");
        ens.ajouteChaine(30,48,"╚██╗ ██╔╝██║  ██║██║   ██║╚█████╗ ","green");
        ens.ajouteChaine(30,47," ╚████╔╝ ██║  ██║██║   ██║ ╚═══██╗","green");
        ens.ajouteChaine(30,46,"  ╚██╔╝  ╚█████╔╝╚██████╔╝██████╔╝","green");
        ens.ajouteChaine(30,45,"   ╚═╝    ╚════╝  ╚═════╝ ╚═════╝ ","green");

        ens.ajouteChaine(6,40," █████╗ ██╗   ██╗███████╗███████╗","green");
        ens.ajouteChaine(6,39,"██╔══██╗██║   ██║██╔════╝╚════██║","green");
        ens.ajouteChaine(6,38,"███████║╚██╗ ██╔╝█████╗    ███╔═╝","green");
        ens.ajouteChaine(6,37,"██╔══██║ ╚████╔╝ ██╔══╝  ██╔══╝  ","green");
        ens.ajouteChaine(6,36,"██║  ██║  ╚██╔╝  ███████╗███████╗","green");
        ens.ajouteChaine(6,35,"╚═╝  ╚═╝   ╚═╝   ╚══════╝╚══════╝","green");

        ens.ajouteChaine(53,40," ██████╗  █████╗  ██████╗ ███╗  ██╗███████╗","green");
        ens.ajouteChaine(53,39,"██╔════╝ ██╔══██╗██╔════╝ ████╗ ██║██╔════╝","green");
        ens.ajouteChaine(53,38,"██║  ██╗ ███████║██║  ██╗ ██╔██╗██║█████╗  ","green");
        ens.ajouteChaine(53,37,"██║  ╚██╗██╔══██║██║  ╚██╗██║╚████║██╔══╝  ","green");
        ens.ajouteChaine(53,36,"╚██████╔╝██║  ██║╚██████╔╝██║ ╚███║███████╗","green");
        ens.ajouteChaine(53,35," ╚═════╝ ╚═╝  ╚═╝ ╚═════╝ ╚═╝  ╚══╝╚══════╝","green");
        return ens;
    }
}
