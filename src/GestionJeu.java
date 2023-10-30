import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class GestionJeu {

    private boolean fin = false;
    private boolean gagner = false;
    private boolean inverse = false;
    private boolean perdu = false;
    private boolean gagnerlevel = false;
    private boolean quitter = false;
    private boolean pause = true;
    private boolean anime = false;


    private List<Alien> aliens;
    private List<Projectile> projectiles;
    private List<ProjectileAlien> projectileAliens;

    private Vaisseau vaisseau;
    private Score score;
    private Perdu perdu2;
    private Gagner gagner2;
    private Vie vie;
    private Level level;
    private Message message;
    private ContinuerPartie continuerPartie;

    private int cptAnime = 0;
    
    public GestionJeu(){
        this.score = new Score();
        this.vie = new Vie();
        this.vaisseau = new Vaisseau();
        this.gagner2 = new Gagner();
        this.perdu2 = new Perdu();
        this.level = new Level();
        this.message = new Message();
        this.continuerPartie = new ContinuerPartie();

        
        this.projectiles = new ArrayList<>();
        this.projectileAliens = new ArrayList<>();
        this.aliens = new ArrayList<>();
        
        //Ajout des aliens dans la liste.
        aliens.add(new Alien(0,45));
        aliens.add(new Alien(15,45));
        aliens.add(new Alien(30,45));
        aliens.add(new Alien(45,45));
        aliens.add(new Alien(60,45));
        aliens.add(new Alien(75,45));
        aliens.add(new Alien(0,40));
        aliens.add(new Alien(15,40));
        aliens.add(new Alien(30,40));
        aliens.add(new Alien(45,40));
        aliens.add(new Alien(60,40));
        aliens.add(new Alien(75,40));
        }
    
    /**
     * Cette methode renvoie la hauteur de l'écran.
     * @return retourne la hauteur de l'écran.
     */
    public int getHauteur(){
        return 60;
    }
    
    /**
     * Cette methode renvoie la largeur de l'écran.
     * @return retourne la largeur de l'écran.
     */
    public int getLargeur(){
        return 100;
    }
    
    /**
     * Renvoie true si le jeu est en pause false sinon.
     * @return true si le jeu est en pause false sinon.
     */
    public boolean getPause(){
        return this.pause;
    }

    /**
     * Renvoie true si le level est terminer et que le joueur à appuyer sur le bouton del/suppr, false sinon.
     * @return true si le level est terminer et que le joueur à appuyer sur le bouton del/suppr, false sinon.
     */
    public boolean getGagner(){
        return this.gagner;
    }

    /**
     * Renvoie true si le joueur n'a plus de vie, false sinon.
     * @return true si le joueur n'a plus de vie, false sinon.
     */
    public boolean getPerdu() {
        return this.perdu;
    }

    /**
     * Renvoie true si le boolean est "Gagner" est a true et que ensuite le joueur a appuyer sur "Entrée/Enter".
     * @return true si le boolean est "Gagner" est a true et que ensuite le joueur a appuyer sur "Entrée/Enter".
     */
    public boolean getQuitter(){
        return this.quitter;
    }

    /**
     * Renvoie la liste d'alien.
     * @return la liste d'alien.
     */
    public List<Alien> getListAliens(){
        return this.aliens;
    }

    /**
     * Renvoie la liste de projectile d'alien.
     * @return la liste de projectile d'alien.
     */
    public List<ProjectileAlien> getListProjectileAliens(){
        return this.projectileAliens;
    }

    /**
     * Renvoie le score du joueur.
     * @return le score du joueur.
     */
    public int getScore(){
        return this.score.getScore();
    }

    /**
     * Renvoie true si le joueur perd ou gagne false sinon.
     * @return true si le joueur perd ou gagne false sinon.
     */
    public boolean getFin(){
        return this.fin;
    }

    /**
     * Modifie le niveau de difficulté du jeu.
     * @param newNiveau le nouveau niveau de difficulté à appliquer.
     */
    public void setNiveau(int newNiveau){
        this.level.setNiveau(newNiveau);
    }

    /**
     * Modifie "quitter" pour que le joueur est rediriger vers le menu.
     * @param bool true si le joueur a passer le niveau et que qu'il a appuyer sur le bouton "Del/Suppr".
     */
    public void setQuitter(boolean bool){
        this.quitter = bool;
    }

    public void setgagnerlevelFalse(){
        this.gagnerlevel = false;
    }

    public void setgagnerTrue(){
        this.gagner = true;
    }
    
    /**
     * Modifie le score actuel du joueur avec le nouveau score spécifié.
     * @param newScore  Le nouveau score à définir.
     */
    public void setScore(int newScore){
        this.score.setScore(newScore);
    }

    public void pause(){
        this.pause = true;
    }
    
    public void finPause(){
        this.pause = false;
    }

    /**
     * Quand on appuie sur la "fleche gauche" le vaisseau se déplace à gauche.
     */
    public void toucheGauche(){
        if (!fin){
            System.out.println("Appui sur la touche gauche");
            if (this.vaisseau.getPosX() > 1){
                this.vaisseau.deplace(-1);
            }
        }
    
    }

    /**
     * Quand on appuie sur la "fleche droite" le vaisseau se déplace à droite.
     */
    public void toucheDroite(){
        if (!fin && !pause){
            System.out.println("Appui sur la touche droite");
            if (this.vaisseau.getPosX() < 86){
                this.vaisseau.deplace(1);
            }
        }
    }
    
    /**
     * Quand on appuie sur "espace" le vaisseau tire un projectile.
     */
    public void toucheEspace(){
        if (!fin && !pause){
            System.out.println("Appui sur la touche espace");
            if (this.projectiles.size() < 1){
                Projectile nouveau = new Projectile(vaisseau.positionCanon(), 5);
                this.projectiles.add(nouveau);
                this.score.incrementeScore(1);
                System.out.println(this.score);
            }
        }
    }
    
    public EnsembleChaines getChaines(){
        
        // Si la partie est toujour en cours
        if (!gagnerlevel  && !perdu && !fin && !gagner ){            
            EnsembleChaines ens = new EnsembleChaines();

            // Changement de vaisseau en fonction des vie.
            if (this.vie.getVie() == 3){
                ens.union(this.vaisseau.getEnsembleChainesTroisVie());
            }
            else if (this.vie.getVie() == 2){
                ens.union(this.vaisseau.getEnsembleChainesDeuxVie());
            }
            else if (this.vie.getVie() == 1){
                ens.union(this.vaisseau.getEnsembleChainesUneVie());
            }

            ens.union(this.vie.getEnsembleChaines()); // Affiche la vie
            ens.union(this.score.getEnsembleChaines()); // Affiche le score.
            ens.union(this.level.getEnsembleChaines()); // Affiche le niveau.

            for (ProjectileAlien projAlien : this.projectileAliens){
                ens.union(projAlien.getEnsembleChaines()); // Affiche le projectile d'alien.
            }

            // L'animation de l"alien
            for (Alien monstre : this.aliens){
                if (anime){
                    ens.union(monstre.getEnsembleChainesAnime()); // Affiche la première posture de l'alien.
                }
                else {ens.union(monstre.getEnsembleChaines()); // Affiche la seconde posture de l'alien.
                } 
            }

            for (Projectile p : this.projectiles){
                ens.union(p.getEnsembleChaines()); // Affiche le projectile du vaisseau.
            }
            return ens;
        }
        else if (gagnerlevel){
            fin = true;
            EnsembleChaines ens = new EnsembleChaines();
            ens.union(this.continuerPartie.getEnsembleChaines()); // Affiche si le joueur a envie de continuer ou non. 
            ens.union(this.score.getEnsembleChainesAscii()); // Affiche le score :  "Score" en ASCII.
            ens.union(this.score.convertStrAscii(this.score.convertIntStr())); // Affiche le score. exemple: "5621" en caractère ASCII.
            ens.union(this.message.getEnsembleChainesPasserLeNiveau()); // Affiche les commendes pour continuer ou quitter.
            return ens;
            
        }
        else if (gagner){
            fin = true;
            EnsembleChaines ens = new EnsembleChaines();
            ens.union(this.gagner2.getEnsembleChaines()); // Affiche "VOUS AVEZ GAGNER" en caractère ASCII.
            ens.union(this.score.getEnsembleChainesAscii()); // Affiche le score :  "Score" en ASCII.
            ens.union(this.message.getEnsembleChaines()); // Affiche les commendes pour retourner au menu.
            ens.union(this.score.convertStrAscii(this.score.convertIntStr())); // Affiche le score. exemple: "5621" en caractère ASCII.
            return ens;
        } 

        else if (perdu){
            fin = true;
            EnsembleChaines ens = new EnsembleChaines();
            ens.union(this.perdu2.getEnsembleChaines()); // Affiche "VOUS AVEZ PERDU" en caractère ASCII.
            ens.union(this.score.getEnsembleChainesAscii()); // Affiche le score :  "Score" en ASCII.
            ens.union(this.score.convertStrAscii(this.score.convertIntStr())); // Affiche le score. exemple: "5621" en caractère ASCII.
            ens.union(this.message.getEnsembleChaines()); // Affiche les commendes pour retourner au menu.
            return ens;
        }

        return null;
    }       
    
    /**
     * Renvoie l'alien le plus a gauche.
     * @return l'alien le plus a gauche.
     */
    public Alien getAlienPlusAGauche(){
        Alien resultat = null;
        for (Alien ali : this.aliens){
            if (resultat == null || ali.getPosX() < resultat.getPosX()){
                resultat = ali;
            } 
        }
        return resultat;
    }

    /**
     * Renvoie l'alien le plus a droite.
     * @return l'alien le plus a droite.
     */
    public Alien getAlienPlusAdroite(){
        Alien resultat = null;
        for (Alien ali : this.aliens){
            if (resultat == null || ali.getPosX() >= resultat.getPosX()){
                resultat = ali;
            } 
        }
        return resultat;
    }

    /**
     * Renvoie l'alien le plus en bas.
     * @return l'alien le plus en bas.
     */
    public Alien getAlienPlusBas(){
        Alien res = null;
        for (Alien ali : this.aliens){
            if (res == null || res.getPosY() > ali.getPosY()){
                res = ali;
            }
        }
        return res;
    }

    /**
     * Detecte si le projectile du vaisseau touche l'alien si oui alors le projectile et l'alien est supprimer.
     */
    public void detecteCollisionsAlien(){
        List<Projectile> ballesSuppr = new ArrayList<Projectile>();
        List<Alien> aliensSuppr = new ArrayList<Alien>();
        for (Projectile balle : this.projectiles){
            for (Alien alien : this.aliens){
                // regarde si le projectile touche l'alien
                if (balle.getPositionX() >= alien.getPosX() && balle.getPositionX() <= alien.getPosX() + alien.getLargeur() &&
                    balle.getPositionY() >= alien.getPosY() && balle.getPositionY() <= alien.getPosY() + alien.getHauteur()){
                    
                    //
                    ballesSuppr.add(balle);
                    aliensSuppr.add(alien);
                    this.score.incrementeScore(10);
                }
            }
        }
    
        
        // Suppression des balle touchés
        for (Projectile balle : ballesSuppr){
            this.projectiles.remove(balle);
        }
        // Suppression des aliens touchés
        for (Alien alien : aliensSuppr){
            this.aliens.remove(alien);
        }
    }
    

    /**
     * Detecte si le projectile du l'alien touche le vaisseau si oui alors le projectile est supprimer et le vaisseau pert une vie.
     */
    public void detecteCollisionsVaisseau(){
        List<ProjectileAlien> ballesSupprAlien = new ArrayList<ProjectileAlien>();
        for (ProjectileAlien balleAlien : this.projectileAliens){
                if (this.vaisseau.contient((int) balleAlien.getPositionX(),(int) balleAlien.getPositionY())){
                    this.score.incrementeScore(10);
                    ballesSupprAlien.add(balleAlien);
                }
            }
        
        // Suppression des balles touchées et enleve une vie.
        for (ProjectileAlien balleAlien : ballesSupprAlien){
            this.projectileAliens.remove(balleAlien);
            this.vie.decrementeVie();
            }
        }
  
    

    public void jouerUnTour(){ 
        
        // Regarde si le jeu n'est pas en pause et que le niveau n'est pas terminer.
        if (!pause && !gagner){
            cptAnime += 1;
            if (anime && this.cptAnime == 20){
                anime = !anime; // Anime les aliens.
                cptAnime = 0;
            }
            else if (!anime && this.cptAnime == 20){
                anime = !anime; // Anime les aliens.
                cptAnime = 0;
            }

            // Mouvement des l'aliens
            if (!this.aliens.isEmpty()){
                    Alien alienplusadroite = getAlienPlusAdroite(); 
                    Alien alienplusagauche = getAlienPlusAGauche();

                // regarde si l'alien le plus a gauche touche le mur de gauche. Si il le touche il descend et continue de l'autre sens.
                if (alienplusagauche.getPosX() >= -2 && inverse){
                    for(Alien ali : this.aliens){
                        ali.evolueInverse(0);
                        
                    }
                    
                }
                else if (alienplusagauche.getPosX() < -2 && inverse){
                    for(Alien ali : this.aliens){
                        ali.evolueInverse(-2);
                        inverse = false;
                    }
                   
                }

                // regarde si l'alien le plus à droite touche le mur de droite. Si il le touche il descend et continue de l'autre sens.
                if ((alienplusadroite.getPosX() <= 85 || alienplusadroite.getPosX() < 85.5) && !inverse ){
                    for(Alien ali : this.aliens){
                        ali.evolue(0);
                    }
                    
                }
                else if (alienplusadroite.getPosX() > 85  && !inverse){
                    for(Alien ali : this.aliens){
                        ali.evolue(-2);
                        inverse = true;
                        
                    }
                    
                }
            }  

            detecteCollisionsAlien(); // detecte si le projectile du vaisseaux touche l'alien. 
            detecteCollisionsVaisseau(); // detecte si le projectile de l'alien touche le vaisseaux.

            // Si le vaisseau n'a plus de vie alors le joueur à perdu.
            if (vie.getVie() <= 0){perdu = true;}
                
            if (!fin){
                this.score.incrementeScore(1); // Pour chaque tour le score augmente de 1.

                // Tir d'Alien.
                if (this.projectileAliens.size() < 1){
                    int random = new Random().nextInt(this.aliens.size()); // la variable rendom prend l'indice de l'alien qui se trouve dans la liste aleatoirement.
                    double posX = this.aliens.get(random).posCanonAlienX(); // La variable posX pend la pose X du canon de l'alien.
                    double posY = this.aliens.get(random).posCanonAlienY(); // La variable posY pend la pose Y du canon de l'alien.
                    this.projectileAliens.add(new ProjectileAlien(posX, posY)); // Si la liste de projectile d'alien est vide alors l'alien tirée au hasard lance un projectile.
                }
                
                // Si la liste "projectileAlien" n'est pas vide alors on fait evoluer le projectile de l'alien.
                else{ 
                    for (int iAlien = 0; iAlien < this.projectileAliens.size(); iAlien++) {
                        ProjectileAlien projAlien = this.projectileAliens.get(iAlien);
                        projAlien.evolue();
                        if (projAlien.getPositionY() < -2){
                            this.projectileAliens.remove(iAlien); // Si le projectile sort de l'écran alors, le projectile est supprimer.
                        }
                    }
                }
            }

          
            // Si la liste "projectileVaisseau" n'est pas vide alors on fait evoluer le projectile du vesseaux.
            for (int i = 0; i < this.projectiles.size(); i++) {
                Projectile p = this.projectiles.get(i);
                p.evolue();
                if (p.getPositionY() < 0 || p.getPositionY() >= getHauteur()){
                    this.projectiles.remove(i);
                    i--;
                }
            }

            if (this.aliens.isEmpty()){
                gagnerlevel = true; // Si il n'y a plus d'alien dans la liste d'alien alors le joueur a gagner le niveau.
                
            }

            if (!this.aliens.isEmpty()){
                Alien alienLePlusBas = getAlienPlusBas();
                if (alienLePlusBas.getPosY() < this.vaisseau.getPosY()){
                    perdu = true;  // Si l'alien l'alien le plus bas touche la limite du vaisseau alors le joueur a perdu.
                }
            }
        }
    }

    
}