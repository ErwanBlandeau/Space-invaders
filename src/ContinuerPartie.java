public class ContinuerPartie {
    
    /**
     * Renvoie un ensemble de chaine de caractère
     * @return un ensemble de chaine de caractère
     */
    public EnsembleChaines getEnsembleChaines(){
        EnsembleChaines ens = new EnsembleChaines();
        ens.ajouteChaine(23,55,"██╗   ██╗ ██████╗ ██╗   ██╗██╗     ███████╗███████╗","orange");
        ens.ajouteChaine(23,54,"██║   ██║██╔═══██╗██║   ██║██║     ██╔════╝╚══███╔╝","orange");
        ens.ajouteChaine(23,53,"██║   ██║██║   ██║██║   ██║██║     █████╗    ███╔╝ ","orange");
        ens.ajouteChaine(23,52,"╚██╗ ██╔╝██║   ██║██║   ██║██║     ██╔══╝   ███╔╝  ","orange");
        ens.ajouteChaine(23,51," ╚████╔╝ ╚██████╔╝╚██████╔╝███████╗███████╗███████╗","orange");
        ens.ajouteChaine(23,50,"  ╚═══╝   ╚═════╝  ╚═════╝ ╚══════╝╚══════╝╚══════╝","orange");

        ens.ajouteChaine(32,45,"██╗   ██╗ ██████╗ ██╗   ██╗███████╗","orange");
        ens.ajouteChaine(32,44,"██║   ██║██╔═══██╗██║   ██║██╔════╝","orange");
        ens.ajouteChaine(32,43,"██║   ██║██║   ██║██║   ██║███████╗","orange");
        ens.ajouteChaine(32,42,"╚██╗ ██╔╝██║   ██║██║   ██║╚════██║","orange");
        ens.ajouteChaine(32,41," ╚████╔╝ ╚██████╔╝╚██████╔╝███████║","orange");
        ens.ajouteChaine(32,40,"  ╚═══╝   ╚═════╝  ╚═════╝ ╚══════╝","orange");

        ens.ajouteChaine(13,35," ██████╗ ██████╗ ███╗   ██╗████████╗██╗███╗   ██╗██╗   ██╗███████╗██████╗ ","orange");
        ens.ajouteChaine(13,34,"██╔════╝██╔═══██╗████╗  ██║╚══██╔══╝██║████╗  ██║██║   ██║██╔════╝██╔══██╗","orange");
        ens.ajouteChaine(13,33,"██║     ██║   ██║██╔██╗ ██║   ██║   ██║██╔██╗ ██║██║   ██║█████╗  ██████╔╝","orange");
        ens.ajouteChaine(13,32,"██║     ██║   ██║██║╚██╗██║   ██║   ██║██║╚██╗██║██║   ██║██╔══╝  ██╔══██╗","orange");
        ens.ajouteChaine(13,31,"╚██████╗╚██████╔╝██║ ╚████║   ██║   ██║██║ ╚████║╚██████╔╝███████╗██║  ██║","orange");
        ens.ajouteChaine(13,30," ╚═════╝ ╚═════╝ ╚═╝  ╚═══╝   ╚═╝   ╚═╝╚═╝  ╚═══╝ ╚═════╝ ╚══════╝╚═╝  ╚═╝","orange");
        return ens;
    }
}
