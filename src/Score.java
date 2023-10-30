public class Score{
    private int score;

    public Score(){
        this.score = 0;
    }

    /**
     * Renvoie le score du joueur.
     * @return le score du joueur.
     */
    public int getScore(){
        return this.score;
    }

    /**
     * Met à jour le score du joueur avec une nouvelle valeur.
     * @param newScore  la nouvelle valeur de score à attribuer au joueur.
     */
    public void setScore(int newScore){
        this.score = newScore;
    }

    /**
     * Incrémente le score avec une valeur donnée.
     * @param nb la valeur à ajouter au score.
     */
    public void incrementeScore(int nb){
    this.score += nb;
    }

    /**
     * Renvoie un ensemble de chaine de caractère.
     * @return un ensemble de chaine de caractère.
     */
    public EnsembleChaines getEnsembleChaines(){
        EnsembleChaines ens = new EnsembleChaines();
        ens.ajouteChaine(2,58,toString(),"white");
        return ens;
    }

    /**
     * Convertit le score du joueur en chaîne de caractères.
     * @return le score du joueur en chaîne de caractères.
     */
    public String convertIntStr(){
        return this.score + "";
    }

    /**
     * Convertit une chaîne de caractères représentant un nombre en une série de chaînes représentant chaque chiffre du nombre en ASCII art.
     * @param nombreString une chaîne de caractères représentant un nombre.
     * @return Un EnsembleChaines contenant une série de chaînes ASCII représentant chaque chiffre du nombre.
     */
    public EnsembleChaines convertStrAscii(String nombreString){
        EnsembleChaines ens = new EnsembleChaines();
        for ( int i = 0; i < nombreString.length(); i++){
            int valeurNombre = Character.getNumericValue(nombreString.charAt(i));
            if (nombreString.length() == 1){
                if (valeurNombre == 1){
                    ens.ajouteChaine(45, 15,"  ███╗  "+"\n"+" ████║  "+"\n"+"██╔██║  "+"\n"+"╚═╝██║  "+"\n"+"███████╗"+"\n"+"╚══════╝","cyan");
                }

                else if (valeurNombre == 2){
                    ens.ajouteChaine(45, 15,"██████╗ "+"\n"+"╚════██╗"+"\n"+"  ███╔═╝"+"\n"+"██╔══╝  "+"\n"+"███████╗"+"\n"+"╚══════╝","cyan");
                }

                else if (valeurNombre == 3){
                    ens.ajouteChaine(45, 15,"██████╗ "+"\n"+"╚════██╗"+"\n"+" █████╔╝"+"\n"+" ╚═══██╗"+"\n"+"██████╔╝"+"\n"+"╚═════╝ ","cyan");
                }

                else if (valeurNombre == 4){
                    ens.ajouteChaine(45, 15,"  ██╗██╗"+"\n"+" ██╔╝██║"+"\n"+"██╔╝ ██║"+"\n"+"███████║"+"\n"+"╚════██║"+"\n"+"    ╚═╝","cyan");
                }

                else if (valeurNombre == 5){
                    ens.ajouteChaine(45, 15, "███████╗"+"\n"+"██╔════╝"+"\n"+"██████╗ "+"\n"+"╚════██╗"+"\n"+"██████╔╝"+"\n"+"╚═════╝ ","cyan");
                }
                
                else if (valeurNombre == 6){
                    ens.ajouteChaine(45, 15," █████╗ "+"\n"+"██╔═══╝ "+"\n"+"██████╗ "+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                }
                
                else if (valeurNombre == 7){
                    ens.ajouteChaine(45, 15,"███████╗"+"\n"+"╚════██║"+"\n"+"   ██╔╝"+"\n"+"   ██╔╝ "+"\n"+"  ██╔╝  "+"\n"+"  ╚═╝   ","cyan");
                }
                
                else if (valeurNombre == 8){
                    ens.ajouteChaine(45, 15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                }

                else if (valeurNombre == 9){
                    ens.ajouteChaine(45, 15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"╚██████║"+"\n"+" ╚═══██║"+"\n"+" █████╔╝"+"\n"+" ╚════╝ ","cyan");
                }

                else if (valeurNombre == 0){
                    ens.ajouteChaine(45, 15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"██║  ██║"+"\n"+"██║  ██║"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                }
            }

            else if(nombreString.length() == 2){
                if (i == 0){
                    if (valeurNombre == 1){
                        ens.ajouteChaine(40, 15,"  ███╗  "+"\n"+" ████║  "+"\n"+"██╔██║  "+"\n"+"╚═╝██║  "+"\n"+"███████╗"+"\n"+"╚══════╝","cyan");
                    }

                    else if (valeurNombre == 2){
                        ens.ajouteChaine(40, 15,"██████╗ "+"\n"+"╚════██╗"+"\n"+"  ███╔═╝"+"\n"+"██╔══╝  "+"\n"+"███████╗"+"\n"+"╚══════╝","cyan");
                    }

                    else if (valeurNombre == 3){
                        ens.ajouteChaine(40, 15,"██████╗ "+"\n"+"╚════██╗"+"\n"+" █████╔╝"+"\n"+" ╚═══██╗"+"\n"+"██████╔╝"+"\n"+"╚═════╝ ","cyan");
                    }

                    else if (valeurNombre == 4){
                        ens.ajouteChaine(40, 15,"  ██╗██╗"+"\n"+" ██╔╝██║"+"\n"+"██╔╝ ██║"+"\n"+"███████║"+"\n"+"╚════██║"+"\n"+"    ╚═╝","cyan");
                    }

                    else if (valeurNombre == 5){
                        ens.ajouteChaine(40, 15, "███████╗"+"\n"+"██╔════╝"+"\n"+"██████╗ "+"\n"+"╚════██╗"+"\n"+"██████╔╝"+"\n"+"╚═════╝ ","cyan");
                    }
                    
                    else if (valeurNombre == 6){
                        ens.ajouteChaine(40, 15," █████╗ "+"\n"+"██╔═══╝ "+"\n"+"██████╗ "+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }
                    
                    else if (valeurNombre == 7){
                        ens.ajouteChaine(40, 15,"███████╗"+"\n"+"╚════██║"+"\n"+"   ██╔╝"+"\n"+"   ██╔╝ "+"\n"+"  ██╔╝  "+"\n"+"  ╚═╝   ","cyan");
                    }
                    
                    else if (valeurNombre == 8){
                        ens.ajouteChaine(40, 15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }

                    else if (valeurNombre == 9){
                        ens.ajouteChaine(40, 15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"╚██████║"+"\n"+" ╚═══██║"+"\n"+" █████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }

                    else if (valeurNombre == 0){
                        ens.ajouteChaine(40, 15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"██║  ██║"+"\n"+"██║  ██║"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }
                }
                if (i == 1){
                    if (valeurNombre == 1){
                        ens.ajouteChaine(50, 15,"  ███╗  "+"\n"+" ████║  "+"\n"+"██╔██║  "+"\n"+"╚═╝██║  "+"\n"+"███████╗"+"\n"+"╚══════╝","cyan");
                    }

                    else if (valeurNombre == 2){
                        ens.ajouteChaine(50, 15,"██████╗ "+"\n"+"╚════██╗"+"\n"+"  ███╔═╝"+"\n"+"██╔══╝  "+"\n"+"███████╗"+"\n"+"╚══════╝","cyan");
                    }

                    else if (valeurNombre == 3){
                        ens.ajouteChaine(50, 15,"██████╗ "+"\n"+"╚════██╗"+"\n"+" █████╔╝"+"\n"+" ╚═══██╗"+"\n"+"██████╔╝"+"\n"+"╚═════╝ ","cyan");
                    }

                    else if (valeurNombre == 4){
                        ens.ajouteChaine(50, 15,"  ██╗██╗"+"\n"+" ██╔╝██║"+"\n"+"██╔╝ ██║"+"\n"+"███████║"+"\n"+"╚════██║"+"\n"+"    ╚═╝","cyan");
                    }

                    else if (valeurNombre == 5){
                        ens.ajouteChaine(50, 15, "███████╗"+"\n"+"██╔════╝"+"\n"+"██████╗ "+"\n"+"╚════██╗"+"\n"+"██████╔╝"+"\n"+"╚═════╝ ","cyan");
                    }
                    
                    else if (valeurNombre == 6){
                        ens.ajouteChaine(50, 15," █████╗ "+"\n"+"██╔═══╝ "+"\n"+"██████╗ "+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }
                    
                    else if (valeurNombre == 7){
                        ens.ajouteChaine(50, 15,"███████╗"+"\n"+"╚════██║"+"\n"+"   ██╔╝"+"\n"+"   ██╔╝ "+"\n"+"  ██╔╝  "+"\n"+"  ╚═╝   ","cyan");
                    }
                    
                    else if (valeurNombre == 8){
                        ens.ajouteChaine(50, 15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }

                    else if (valeurNombre == 9){
                        ens.ajouteChaine(50, 15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"╚██████║"+"\n"+" ╚═══██║"+"\n"+" █████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }

                    else if (valeurNombre == 0){
                        ens.ajouteChaine(50, 15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"██║  ██║"+"\n"+"██║  ██║"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }
                }
            }
            else if (nombreString.length() == 3){

                if (i == 0){
                    if (valeurNombre == 1){
                        ens.ajouteChaine(35, 15,"  ███╗  "+"\n"+" ████║  "+"\n"+"██╔██║  "+"\n"+"╚═╝██║  "+"\n"+"███████╗"+"\n"+"╚══════╝","cyan");
                    }

                    else if (valeurNombre == 2){
                        ens.ajouteChaine(35, 15,"██████╗ "+"\n"+"╚════██╗"+"\n"+"  ███╔═╝"+"\n"+"██╔══╝  "+"\n"+"███████╗"+"\n"+"╚══════╝","cyan");
                    }

                    else if (valeurNombre == 3){
                        ens.ajouteChaine(35, 15,"██████╗ "+"\n"+"╚════██╗"+"\n"+" █████╔╝"+"\n"+" ╚═══██╗"+"\n"+"██████╔╝"+"\n"+"╚═════╝ ","cyan");
                    }

                    else if (valeurNombre == 4){
                        ens.ajouteChaine(35, 15,"  ██╗██╗"+"\n"+" ██╔╝██║"+"\n"+"██╔╝ ██║"+"\n"+"███████║"+"\n"+"╚════██║"+"\n"+"    ╚═╝","cyan");
                    }

                    else if (valeurNombre == 5){
                        ens.ajouteChaine(35, 15, "███████╗"+"\n"+"██╔════╝"+"\n"+"██████╗ "+"\n"+"╚════██╗"+"\n"+"██████╔╝"+"\n"+"╚═════╝ ","cyan");
                    }
                    
                    else if (valeurNombre == 6){
                        ens.ajouteChaine(35, 15," █████╗ "+"\n"+"██╔═══╝ "+"\n"+"██████╗ "+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }
                    
                    else if (valeurNombre == 7){
                        ens.ajouteChaine(35, 15,"███████╗"+"\n"+"╚════██║"+"\n"+"   ██╔╝"+"\n"+"   ██╔╝ "+"\n"+"  ██╔╝  "+"\n"+"  ╚═╝   ","cyan");
                    }
                    
                    else if (valeurNombre == 8){
                        ens.ajouteChaine(35, 15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }

                    else if (valeurNombre == 9){
                        ens.ajouteChaine(35, 15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"╚██████║"+"\n"+" ╚═══██║"+"\n"+" █████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }

                    else if (valeurNombre == 0){
                        ens.ajouteChaine(35, 15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"██║  ██║"+"\n"+"██║  ██║"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }
                }
                if (i == 1){
                    if (valeurNombre == 1){
                        ens.ajouteChaine(45, 15,"  ███╗  "+"\n"+" ████║  "+"\n"+"██╔██║  "+"\n"+"╚═╝██║  "+"\n"+"███████╗"+"\n"+"╚══════╝","cyan");
                    }

                    else if (valeurNombre == 2){
                        ens.ajouteChaine(45, 15,"██████╗ "+"\n"+"╚════██╗"+"\n"+"  ███╔═╝"+"\n"+"██╔══╝  "+"\n"+"███████╗"+"\n"+"╚══════╝","cyan");
                    }

                    else if (valeurNombre == 3){
                        ens.ajouteChaine(45, 15,"██████╗ "+"\n"+"╚════██╗"+"\n"+" █████╔╝"+"\n"+" ╚═══██╗"+"\n"+"██████╔╝"+"\n"+"╚═════╝ ","cyan");
                    }

                    else if (valeurNombre == 4){
                        ens.ajouteChaine(45, 15,"  ██╗██╗"+"\n"+" ██╔╝██║"+"\n"+"██╔╝ ██║"+"\n"+"███████║"+"\n"+"╚════██║"+"\n"+"    ╚═╝","cyan");
                    }

                    else if (valeurNombre == 5){
                        ens.ajouteChaine(45, 15, "███████╗"+"\n"+"██╔════╝"+"\n"+"██████╗ "+"\n"+"╚════██╗"+"\n"+"██████╔╝"+"\n"+"╚═════╝ ","cyan");
                    }
                    
                    else if (valeurNombre == 6){
                        ens.ajouteChaine(45, 15," █████╗ "+"\n"+"██╔═══╝ "+"\n"+"██████╗ "+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }
                    
                    else if (valeurNombre == 7){
                        ens.ajouteChaine(45, 15,"███████╗"+"\n"+"╚════██║"+"\n"+"   ██╔╝"+"\n"+"   ██╔╝ "+"\n"+"  ██╔╝  "+"\n"+"  ╚═╝   ","cyan");
                    }
                    
                    else if (valeurNombre == 8){
                        ens.ajouteChaine(45, 15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }

                    else if (valeurNombre == 9){
                        ens.ajouteChaine(45, 15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"╚██████║"+"\n"+" ╚═══██║"+"\n"+" █████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }

                    else if (valeurNombre == 0){
                        ens.ajouteChaine(45, 15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"██║  ██║"+"\n"+"██║  ██║"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }
                }
                if (i == 2){
                    if (valeurNombre == 1){
                        ens.ajouteChaine(55, 15,"  ███╗  "+"\n"+" ████║  "+"\n"+"██╔██║  "+"\n"+"╚═╝██║  "+"\n"+"███████╗"+"\n"+"╚══════╝","cyan");
                    }

                    else if (valeurNombre == 2){
                        ens.ajouteChaine(55, 15,"██████╗ "+"\n"+"╚════██╗"+"\n"+"  ███╔═╝"+"\n"+"██╔══╝  "+"\n"+"███████╗"+"\n"+"╚══════╝","cyan");
                    }

                    else if (valeurNombre == 3){
                        ens.ajouteChaine(55, 15,"██████╗ "+"\n"+"╚════██╗"+"\n"+" █████╔╝"+"\n"+" ╚═══██╗"+"\n"+"██████╔╝"+"\n"+"╚═════╝ ","cyan");
                    }

                    else if (valeurNombre == 4){
                        ens.ajouteChaine(55, 15,"  ██╗██╗"+"\n"+" ██╔╝██║"+"\n"+"██╔╝ ██║"+"\n"+"███████║"+"\n"+"╚════██║"+"\n"+"    ╚═╝","cyan");
                    }

                    else if (valeurNombre == 5){
                        ens.ajouteChaine(55, 15, "███████╗"+"\n"+"██╔════╝"+"\n"+"██████╗ "+"\n"+"╚════██╗"+"\n"+"██████╔╝"+"\n"+"╚═════╝ ","cyan");
                    }
                    
                    else if (valeurNombre == 6){
                        ens.ajouteChaine(55, 15," █████╗ "+"\n"+"██╔═══╝ "+"\n"+"██████╗ "+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }
                    
                    else if (valeurNombre == 7){
                        ens.ajouteChaine(55, 15,"███████╗"+"\n"+"╚════██║"+"\n"+"   ██╔╝"+"\n"+"   ██╔╝ "+"\n"+"  ██╔╝  "+"\n"+"  ╚═╝   ","cyan");
                    }
                    
                    else if (valeurNombre == 8){
                        ens.ajouteChaine(55, 15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }

                    else if (valeurNombre == 9){
                        ens.ajouteChaine(55, 15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"╚██████║"+"\n"+" ╚═══██║"+"\n"+" █████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }

                    else if (valeurNombre == 0){
                        ens.ajouteChaine(55, 15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"██║  ██║"+"\n"+"██║  ██║"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }
                }
            }
            else if (nombreString.length() == 4){

                if (i == 0){
                    if (valeurNombre == 1){
                        ens.ajouteChaine(30, 15,"  ███╗  "+"\n"+" ████║  "+"\n"+"██╔██║  "+"\n"+"╚═╝██║  "+"\n"+"███████╗"+"\n"+"╚══════╝","cyan");
                    }

                    else if (valeurNombre == 2){
                        ens.ajouteChaine(30, 15,"██████╗ "+"\n"+"╚════██╗"+"\n"+"  ███╔═╝"+"\n"+"██╔══╝  "+"\n"+"███████╗"+"\n"+"╚══════╝","cyan");
                    }

                    else if (valeurNombre == 3){
                        ens.ajouteChaine(30, 15,"██████╗ "+"\n"+"╚════██╗"+"\n"+" █████╔╝"+"\n"+" ╚═══██╗"+"\n"+"██████╔╝"+"\n"+"╚═════╝ ","cyan");
                    }

                    else if (valeurNombre == 4){
                        ens.ajouteChaine(30, 15,"  ██╗██╗"+"\n"+" ██╔╝██║"+"\n"+"██╔╝ ██║"+"\n"+"███████║"+"\n"+"╚════██║"+"\n"+"    ╚═╝","cyan");
                    }

                    else if (valeurNombre == 5){
                        ens.ajouteChaine(30, 15, "███████╗"+"\n"+"██╔════╝"+"\n"+"██████╗ "+"\n"+"╚════██╗"+"\n"+"██████╔╝"+"\n"+"╚═════╝ ","cyan");
                    }
                    
                    else if (valeurNombre == 6){
                        ens.ajouteChaine(30, 15," █████╗ "+"\n"+"██╔═══╝ "+"\n"+"██████╗ "+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }
                    
                    else if (valeurNombre == 7){
                        ens.ajouteChaine(30, 15,"███████╗"+"\n"+"╚════██║"+"\n"+"   ██╔╝"+"\n"+"   ██╔╝ "+"\n"+"  ██╔╝  "+"\n"+"  ╚═╝   ","cyan");
                    }
                    
                    else if (valeurNombre == 8){
                        ens.ajouteChaine(30, 15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }

                    else if (valeurNombre == 9){
                        ens.ajouteChaine(30, 15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"╚██████║"+"\n"+" ╚═══██║"+"\n"+" █████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }

                    else if (valeurNombre == 0){
                        ens.ajouteChaine(30, 15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"██║  ██║"+"\n"+"██║  ██║"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }
                }
                if (i == 1){
                    if (valeurNombre == 1){
                        ens.ajouteChaine(40, 15,"  ███╗  "+"\n"+" ████║  "+"\n"+"██╔██║  "+"\n"+"╚═╝██║  "+"\n"+"███████╗"+"\n"+"╚══════╝","cyan");
                    }

                    else if (valeurNombre == 2){
                        ens.ajouteChaine(40, 15,"██████╗ "+"\n"+"╚════██╗"+"\n"+"  ███╔═╝"+"\n"+"██╔══╝  "+"\n"+"███████╗"+"\n"+"╚══════╝","cyan");
                    }

                    else if (valeurNombre == 3){
                        ens.ajouteChaine(40, 15,"██████╗ "+"\n"+"╚════██╗"+"\n"+" █████╔╝"+"\n"+" ╚═══██╗"+"\n"+"██████╔╝"+"\n"+"╚═════╝ ","cyan");
                    }

                    else if (valeurNombre == 4){
                        ens.ajouteChaine(40, 15,"  ██╗██╗"+"\n"+" ██╔╝██║"+"\n"+"██╔╝ ██║"+"\n"+"███████║"+"\n"+"╚════██║"+"\n"+"    ╚═╝","cyan");
                    }

                    else if (valeurNombre == 5){
                        ens.ajouteChaine(40, 15, "███████╗"+"\n"+"██╔════╝"+"\n"+"██████╗ "+"\n"+"╚════██╗"+"\n"+"██████╔╝"+"\n"+"╚═════╝ ","cyan");
                    }
                    
                    else if (valeurNombre == 6){
                        ens.ajouteChaine(40, 15," █████╗ "+"\n"+"██╔═══╝ "+"\n"+"██████╗ "+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }
                    
                    else if (valeurNombre == 7){
                        ens.ajouteChaine(40, 15,"███████╗"+"\n"+"╚════██║"+"\n"+"   ██╔╝"+"\n"+"   ██╔╝ "+"\n"+"  ██╔╝  "+"\n"+"  ╚═╝   ","cyan");
                    }
                    
                    else if (valeurNombre == 8){
                        ens.ajouteChaine(40, 15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }

                    else if (valeurNombre == 9){
                        ens.ajouteChaine(40, 15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"╚██████║"+"\n"+" ╚═══██║"+"\n"+" █████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }

                    else if (valeurNombre == 0){
                        ens.ajouteChaine(40, 15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"██║  ██║"+"\n"+"██║  ██║"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }
                }
                if (i == 2){
                    if (valeurNombre == 1){
                        ens.ajouteChaine(50, 15,"  ███╗  "+"\n"+" ████║  "+"\n"+"██╔██║  "+"\n"+"╚═╝██║  "+"\n"+"███████╗"+"\n"+"╚══════╝","cyan");
                    }

                    else if (valeurNombre == 2){
                        ens.ajouteChaine(50, 15,"██████╗ "+"\n"+"╚════██╗"+"\n"+"  ███╔═╝"+"\n"+"██╔══╝  "+"\n"+"███████╗"+"\n"+"╚══════╝","cyan");
                    }

                    else if (valeurNombre == 3){
                        ens.ajouteChaine(50, 15,"██████╗ "+"\n"+"╚════██╗"+"\n"+" █████╔╝"+"\n"+" ╚═══██╗"+"\n"+"██████╔╝"+"\n"+"╚═════╝ ","cyan");
                    }

                    else if (valeurNombre == 4){
                        ens.ajouteChaine(50, 15,"  ██╗██╗"+"\n"+" ██╔╝██║"+"\n"+"██╔╝ ██║"+"\n"+"███████║"+"\n"+"╚════██║"+"\n"+"    ╚═╝","cyan");
                    }

                    else if (valeurNombre == 5){
                        ens.ajouteChaine(50, 15, "███████╗"+"\n"+"██╔════╝"+"\n"+"██████╗ "+"\n"+"╚════██╗"+"\n"+"██████╔╝"+"\n"+"╚═════╝ ","cyan");
                    }
                    
                    else if (valeurNombre == 6){
                        ens.ajouteChaine(50, 15," █████╗ "+"\n"+"██╔═══╝ "+"\n"+"██████╗ "+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }
                    
                    else if (valeurNombre == 7){
                        ens.ajouteChaine(50, 15,"███████╗"+"\n"+"╚════██║"+"\n"+"   ██╔╝"+"\n"+"   ██╔╝ "+"\n"+"  ██╔╝  "+"\n"+"  ╚═╝   ","cyan");
                    }
                    
                    else if (valeurNombre == 8){
                        ens.ajouteChaine(50, 15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }

                    else if (valeurNombre == 9){
                        ens.ajouteChaine(50, 15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"╚██████║"+"\n"+" ╚═══██║"+"\n"+" █████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }

                    else if (valeurNombre == 0){
                        ens.ajouteChaine(50, 15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"██║  ██║"+"\n"+"██║  ██║"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }
                }
                if (i == 3){
                    if (valeurNombre == 1){
                        ens.ajouteChaine(60, 15,"  ███╗  "+"\n"+" ████║  "+"\n"+"██╔██║  "+"\n"+"╚═╝██║  "+"\n"+"███████╗"+"\n"+"╚══════╝","cyan");
                    }

                    else if (valeurNombre == 2){
                        ens.ajouteChaine(60, 15,"██████╗ "+"\n"+"╚════██╗"+"\n"+"  ███╔═╝"+"\n"+"██╔══╝  "+"\n"+"███████╗"+"\n"+"╚══════╝","cyan");
                    }

                    else if (valeurNombre == 3){
                        ens.ajouteChaine(60, 15,"██████╗ "+"\n"+"╚════██╗"+"\n"+" █████╔╝"+"\n"+" ╚═══██╗"+"\n"+"██████╔╝"+"\n"+"╚═════╝ ","cyan");
                    }

                    else if (valeurNombre == 4){
                        ens.ajouteChaine(60, 15,"  ██╗██╗"+"\n"+" ██╔╝██║"+"\n"+"██╔╝ ██║"+"\n"+"███████║"+"\n"+"╚════██║"+"\n"+"    ╚═╝","cyan");
                    }

                    else if (valeurNombre == 5){
                        ens.ajouteChaine(60, 15, "███████╗"+"\n"+"██╔════╝"+"\n"+"██████╗ "+"\n"+"╚════██╗"+"\n"+"██████╔╝"+"\n"+"╚═════╝ ","cyan");
                    }
                    
                    else if (valeurNombre == 6){
                        ens.ajouteChaine(60, 15," █████╗ "+"\n"+"██╔═══╝ "+"\n"+"██████╗ "+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }
                    
                    else if (valeurNombre == 7){
                        ens.ajouteChaine(60, 15,"███████╗"+"\n"+"╚════██║"+"\n"+"   ██╔╝"+"\n"+"   ██╔╝ "+"\n"+"  ██╔╝  "+"\n"+"  ╚═╝   ","cyan");
                    }
                    
                    else if (valeurNombre == 8){
                        ens.ajouteChaine(60, 15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }

                    else if (valeurNombre == 9){
                        ens.ajouteChaine(60, 15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"╚██████║"+"\n"+" ╚═══██║"+"\n"+" █████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }

                    else if (valeurNombre == 0){
                        ens.ajouteChaine(60, 15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"██║  ██║"+"\n"+"██║  ██║"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }
                }
            }
            else if (nombreString.length() == 5){

                if (i == 0){
                    if (valeurNombre == 1){
                        ens.ajouteChaine(27, 15,"  ███╗  "+"\n"+" ████║  "+"\n"+"██╔██║  "+"\n"+"╚═╝██║  "+"\n"+"███████╗"+"\n"+"╚══════╝","cyan");
                    }

                    else if (valeurNombre == 2){
                        ens.ajouteChaine(27, 15,"██████╗ "+"\n"+"╚════██╗"+"\n"+"  ███╔═╝"+"\n"+"██╔══╝  "+"\n"+"███████╗"+"\n"+"╚══════╝","cyan");
                    }

                    else if (valeurNombre == 3){
                        ens.ajouteChaine(27, 15,"██████╗ "+"\n"+"╚════██╗"+"\n"+" █████╔╝"+"\n"+" ╚═══██╗"+"\n"+"██████╔╝"+"\n"+"╚═════╝ ","cyan");
                    }

                    else if (valeurNombre == 4){
                        ens.ajouteChaine(27, 15,"  ██╗██╗"+"\n"+" ██╔╝██║"+"\n"+"██╔╝ ██║"+"\n"+"███████║"+"\n"+"╚════██║"+"\n"+"    ╚═╝","cyan");
                    }

                    else if (valeurNombre == 5){
                        ens.ajouteChaine(27, 15, "███████╗"+"\n"+"██╔════╝"+"\n"+"██████╗ "+"\n"+"╚════██╗"+"\n"+"██████╔╝"+"\n"+"╚═════╝ ","cyan");
                    }
                    
                    else if (valeurNombre == 6){
                        ens.ajouteChaine(27, 15," █████╗ "+"\n"+"██╔═══╝ "+"\n"+"██████╗ "+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }
                    
                    else if (valeurNombre == 7){
                        ens.ajouteChaine(27, 15,"███████╗"+"\n"+"╚════██║"+"\n"+"   ██╔╝"+"\n"+"   ██╔╝ "+"\n"+"  ██╔╝  "+"\n"+"  ╚═╝   ","cyan");
                    }
                    
                    else if (valeurNombre == 8){
                        ens.ajouteChaine(27, 15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }

                    else if (valeurNombre == 9){
                        ens.ajouteChaine(27, 15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"╚██████║"+"\n"+" ╚═══██║"+"\n"+" █████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }

                    else if (valeurNombre == 0){
                        ens.ajouteChaine(27, 15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"██║  ██║"+"\n"+"██║  ██║"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }
                }
                if (i == 1){
                    if (valeurNombre == 1){
                        ens.ajouteChaine(37, 15,"  ███╗  "+"\n"+" ████║  "+"\n"+"██╔██║  "+"\n"+"╚═╝██║  "+"\n"+"███████╗"+"\n"+"╚══════╝","cyan");
                    }

                    else if (valeurNombre == 2){
                        ens.ajouteChaine(37, 15,"██████╗ "+"\n"+"╚════██╗"+"\n"+"  ███╔═╝"+"\n"+"██╔══╝  "+"\n"+"███████╗"+"\n"+"╚══════╝","cyan");
                    }

                    else if (valeurNombre == 3){
                        ens.ajouteChaine(37, 15,"██████╗ "+"\n"+"╚════██╗"+"\n"+" █████╔╝"+"\n"+" ╚═══██╗"+"\n"+"██████╔╝"+"\n"+"╚═════╝ ","cyan");
                    }

                    else if (valeurNombre == 4){
                        ens.ajouteChaine(37, 15,"  ██╗██╗"+"\n"+" ██╔╝██║"+"\n"+"██╔╝ ██║"+"\n"+"███████║"+"\n"+"╚════██║"+"\n"+"    ╚═╝","cyan");
                    }

                    else if (valeurNombre == 5){
                        ens.ajouteChaine(37, 15, "███████╗"+"\n"+"██╔════╝"+"\n"+"██████╗ "+"\n"+"╚════██╗"+"\n"+"██████╔╝"+"\n"+"╚═════╝ ","cyan");
                    }
                    
                    else if (valeurNombre == 6){
                        ens.ajouteChaine(37, 15," █████╗ "+"\n"+"██╔═══╝ "+"\n"+"██████╗ "+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }
                    
                    else if (valeurNombre == 7){
                        ens.ajouteChaine(37, 15,"███████╗"+"\n"+"╚════██║"+"\n"+"   ██╔╝"+"\n"+"   ██╔╝ "+"\n"+"  ██╔╝  "+"\n"+"  ╚═╝   ","cyan");
                    }
                    
                    else if (valeurNombre == 8){
                        ens.ajouteChaine(37, 15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }

                    else if (valeurNombre == 9){
                        ens.ajouteChaine(37, 15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"╚██████║"+"\n"+" ╚═══██║"+"\n"+" █████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }

                    else if (valeurNombre == 0){
                        ens.ajouteChaine(37,15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"██║  ██║"+"\n"+"██║  ██║"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }
                }
                if (i == 2){
                    if (valeurNombre == 1){
                        ens.ajouteChaine(47, 15,"  ███╗  "+"\n"+" ████║  "+"\n"+"██╔██║  "+"\n"+"╚═╝██║  "+"\n"+"███████╗"+"\n"+"╚══════╝","cyan");
                    }

                    else if (valeurNombre == 2){
                        ens.ajouteChaine(47, 15,"██████╗ "+"\n"+"╚════██╗"+"\n"+"  ███╔═╝"+"\n"+"██╔══╝  "+"\n"+"███████╗"+"\n"+"╚══════╝","cyan");
                    }

                    else if (valeurNombre == 3){
                        ens.ajouteChaine(47, 15,"██████╗ "+"\n"+"╚════██╗"+"\n"+" █████╔╝"+"\n"+" ╚═══██╗"+"\n"+"██████╔╝"+"\n"+"╚═════╝ ","cyan");
                    }

                    else if (valeurNombre == 4){
                        ens.ajouteChaine(47, 15,"  ██╗██╗"+"\n"+" ██╔╝██║"+"\n"+"██╔╝ ██║"+"\n"+"███████║"+"\n"+"╚════██║"+"\n"+"    ╚═╝","cyan");
                    }

                    else if (valeurNombre == 5){
                        ens.ajouteChaine(47, 15, "███████╗"+"\n"+"██╔════╝"+"\n"+"██████╗ "+"\n"+"╚════██╗"+"\n"+"██████╔╝"+"\n"+"╚═════╝ ","cyan");
                    }
                    
                    else if (valeurNombre == 6){
                        ens.ajouteChaine(47, 15," █████╗ "+"\n"+"██╔═══╝ "+"\n"+"██████╗ "+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }
                    
                    else if (valeurNombre == 7){
                        ens.ajouteChaine(47, 15,"███████╗"+"\n"+"╚════██║"+"\n"+"   ██╔╝"+"\n"+"   ██╔╝ "+"\n"+"  ██╔╝  "+"\n"+"  ╚═╝   ","cyan");
                    }
                    
                    else if (valeurNombre == 8){
                        ens.ajouteChaine(47, 15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }

                    else if (valeurNombre == 9){
                        ens.ajouteChaine(47, 15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"╚██████║"+"\n"+" ╚═══██║"+"\n"+" █████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }

                    else if (valeurNombre == 0){
                        ens.ajouteChaine(47, 15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"██║  ██║"+"\n"+"██║  ██║"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }
                }
                if (i == 3){
                    if (valeurNombre == 1){
                        ens.ajouteChaine(57, 15,"  ███╗  "+"\n"+" ████║  "+"\n"+"██╔██║  "+"\n"+"╚═╝██║  "+"\n"+"███████╗"+"\n"+"╚══════╝","cyan");
                    }

                    else if (valeurNombre == 2){
                        ens.ajouteChaine(57, 15,"██████╗ "+"\n"+"╚════██╗"+"\n"+"  ███╔═╝"+"\n"+"██╔══╝  "+"\n"+"███████╗"+"\n"+"╚══════╝","cyan");
                    }

                    else if (valeurNombre == 3){
                        ens.ajouteChaine(57, 15,"██████╗ "+"\n"+"╚════██╗"+"\n"+" █████╔╝"+"\n"+" ╚═══██╗"+"\n"+"██████╔╝"+"\n"+"╚═════╝ ","cyan");
                    }

                    else if (valeurNombre == 4){
                        ens.ajouteChaine(57, 15,"  ██╗██╗"+"\n"+" ██╔╝██║"+"\n"+"██╔╝ ██║"+"\n"+"███████║"+"\n"+"╚════██║"+"\n"+"    ╚═╝","cyan");
                    }

                    else if (valeurNombre == 5){
                        ens.ajouteChaine(57, 15, "███████╗"+"\n"+"██╔════╝"+"\n"+"██████╗ "+"\n"+"╚════██╗"+"\n"+"██████╔╝"+"\n"+"╚═════╝ ","cyan");
                    }
                    
                    else if (valeurNombre == 6){
                        ens.ajouteChaine(57, 15," █████╗ "+"\n"+"██╔═══╝ "+"\n"+"██████╗ "+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }
                    
                    else if (valeurNombre == 7){
                        ens.ajouteChaine(57, 15,"███████╗"+"\n"+"╚════██║"+"\n"+"   ██╔╝"+"\n"+"   ██╔╝ "+"\n"+"  ██╔╝  "+"\n"+"  ╚═╝   ","cyan");
                    }
                    
                    else if (valeurNombre == 8){
                        ens.ajouteChaine(57, 15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }

                    else if (valeurNombre == 9){
                        ens.ajouteChaine(57, 15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"╚██████║"+"\n"+" ╚═══██║"+"\n"+" █████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }

                    else if (valeurNombre == 0){
                        ens.ajouteChaine(57, 15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"██║  ██║"+"\n"+"██║  ██║"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }
                }
                if (i == 4){
                    if (valeurNombre == 1){
                        ens.ajouteChaine(67, 15,"  ███╗  "+"\n"+" ████║  "+"\n"+"██╔██║  "+"\n"+"╚═╝██║  "+"\n"+"███████╗"+"\n"+"╚══════╝","cyan");
                    }

                    else if (valeurNombre == 2){
                        ens.ajouteChaine(67, 15,"██████╗ "+"\n"+"╚════██╗"+"\n"+"  ███╔═╝"+"\n"+"██╔══╝  "+"\n"+"███████╗"+"\n"+"╚══════╝","cyan");
                    }

                    else if (valeurNombre == 3){
                        ens.ajouteChaine(67, 15,"██████╗ "+"\n"+"╚════██╗"+"\n"+" █████╔╝"+"\n"+" ╚═══██╗"+"\n"+"██████╔╝"+"\n"+"╚═════╝ ","cyan");
                    }

                    else if (valeurNombre == 4){
                        ens.ajouteChaine(67, 15,"  ██╗██╗"+"\n"+" ██╔╝██║"+"\n"+"██╔╝ ██║"+"\n"+"███████║"+"\n"+"╚════██║"+"\n"+"    ╚═╝","cyan");
                    }

                    else if (valeurNombre == 5){
                        ens.ajouteChaine(67, 15, "███████╗"+"\n"+"██╔════╝"+"\n"+"██████╗ "+"\n"+"╚════██╗"+"\n"+"██████╔╝"+"\n"+"╚═════╝ ","cyan");
                    }
                    
                    else if (valeurNombre == 6){
                        ens.ajouteChaine(67, 15," █████╗ "+"\n"+"██╔═══╝ "+"\n"+"██████╗ "+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }
                    
                    else if (valeurNombre == 7){
                        ens.ajouteChaine(67, 15,"███████╗"+"\n"+"╚════██║"+"\n"+"   ██╔╝"+"\n"+"   ██╔╝ "+"\n"+"  ██╔╝  "+"\n"+"  ╚═╝   ","cyan");
                    }
                    
                    else if (valeurNombre == 8){
                        ens.ajouteChaine(67, 15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+"██╔══██╗"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }

                    else if (valeurNombre == 9){
                        ens.ajouteChaine(67, 15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"╚██████║"+"\n"+" ╚═══██║"+"\n"+" █████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }

                    else if (valeurNombre == 0){
                        ens.ajouteChaine(67, 15," █████╗ "+"\n"+"██╔══██╗"+"\n"+"██║  ██║"+"\n"+"██║  ██║"+"\n"+"╚█████╔╝"+"\n"+" ╚════╝ ","cyan");
                    }
                }
            }
        }
        return ens;
    }
    

    public EnsembleChaines getEnsembleChainesAscii(){
        EnsembleChaines ens = new EnsembleChaines();        
        ens.ajouteChaine(30,25," ██████╗ █████╗  █████╗ ██████╗ ███████╗","cyan");
        ens.ajouteChaine(30,24,"██╔════╝██╔══██╗██╔══██╗██╔══██╗██╔════╝","cyan");
        ens.ajouteChaine(30,23,"╚█████╗ ██║  ╚═╝██║  ██║██████╔╝█████╗  ","cyan");
        ens.ajouteChaine(30,22," ╚═══██╗██║  ██╗██║  ██║██╔══██╗██╔══╝  ","cyan");
        ens.ajouteChaine(30,21,"██████╔╝╚█████╔╝╚█████╔╝██║  ██║███████╗","cyan");
        ens.ajouteChaine(30,20,"╚═════╝  ╚════╝  ╚════╝ ╚═╝  ╚═╝╚══════╝","cyan");
        return ens;
    }



    @Override
    public String toString(){
        return "score : " + this.score;
    }
}