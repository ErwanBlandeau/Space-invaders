import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.util.Duration;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;
import javafx.geometry.Pos;

import javafx.scene.layout.*;
import javafx.scene.image.Image;






public class Executable extends Application {
    
    private Pane jeuRoot;
    private Group caracteres;
    private GestionJeu gestionnaire;

    private int hauteurTexte;
    private int largeurCaractere;
    private int cptNiveau = 1;
    private int cptPause = 0;

    private boolean appuyerEspace = false;
    private boolean appuyerGauche = false;
    private boolean appuyerDroite = false;

    // Un moyen pour que le vausseau ne saccade plus lorse que l'on le bouge.
    private Thread threadespace = new Thread(){
        public void run(){
            if (appuyerEspace)
            gestionnaire.toucheEspace();
        }
    };

    private Thread threadGauche = new Thread(){
        public void run(){
            if (appuyerGauche)
            gestionnaire.toucheGauche();
        }
    };

    private Thread threadeDroite = new Thread(){
        public void run(){
            if (appuyerDroite)
            gestionnaire.toucheDroite();
        }
    };
    public static void main(String[] args) {
        launch(args);
    }

    private void afficherCaracteres(){
        caracteres.getChildren().clear();
        int hauteur = (int) jeuRoot.getHeight();
        for( ChainePositionnee c : gestionnaire.getChaines().chaines)
        {
            Text t = new Text (c.x*largeurCaractere,hauteur - c.y*hauteurTexte, c.c);
            t.setFont(Font.font ("Monospaced", 10));
            t.setFill(Color.web(c.getCouleur())); // ajout de la couleur pour changer la couleur des chaine de caractère.
            caracteres.getChildren().add(t);
        }
    }

    private void lancerAnimation() {
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(0),
                    new EventHandler<ActionEvent>() {
                        @Override public void handle(ActionEvent actionEvent) {
                            gestionnaire.jouerUnTour();
                            afficherCaracteres();
                            threadGauche.run(); // implementation de la methode run
                            threadeDroite.run(); // implementation de la methode run
                            threadespace.run(); // implementation de la methode run
                        }
                    }),
                new KeyFrame(Duration.seconds(0.025))
                );
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }


    @Override
    public void start(Stage primaryStage) {
    primaryStage.setTitle("IUTO Space Invader");
    VBox layout = new VBox(); // Création d'une vertical box pour aligner les bouton verticalement.
    VBox layout2 = new VBox();
    
    
    caracteres = new Group();
        jeuRoot = new AnchorPane(caracteres);
        Pane menuRoot = new AnchorPane();
        gestionnaire = new GestionJeu();
        gestionnaire.setNiveau(cptNiveau);
        Text t=new Text("█");
        t.setFont(Font.font("Monospaced",10));
        hauteurTexte =(int) t.getLayoutBounds().getHeight();
        largeurCaractere = (int) t.getLayoutBounds().getWidth();

        // création de deux scenne : jeu qui sert à jouer et menu qui sert de menu mais aussi de pause.
        Scene jeu = new Scene(jeuRoot,gestionnaire.getLargeur()*largeurCaractere,gestionnaire.getHauteur()*hauteurTexte);
        Scene menu = new Scene(menuRoot,gestionnaire.getLargeur()*largeurCaractere,gestionnaire.getHauteur()*hauteurTexte);

        // Permet de définir la taille préférée de la région.
        layout.setPrefSize(gestionnaire.getLargeur()*largeurCaractere,gestionnaire.getHauteur()*hauteurTexte);
        layout2.setPrefSize(gestionnaire.getLargeur()*largeurCaractere,gestionnaire.getHauteur()*hauteurTexte);

        
        // ajoute l'objet (layout,layout2) à la liste des enfants de l'objet "menuRoot" et de "jeuRoot".
        menuRoot.getChildren().add(layout);
        jeuRoot.getChildren().add(layout2);


        // Change le cursor de la souris en une croix.
        menuRoot.setCursor(Cursor.CROSSHAIR);
        jeuRoot.setCursor(Cursor.CROSSHAIR);

        //Création de bouton "Quitter". Quand on appuis sur le bouton le jeu ce ferme.
        Button quitterButton = new Button("Quitter");
        quitterButton.setOnAction((event) -> {
            Platform.exit();
        });

        // Création du bouton "Jouer". Quand on appuis sur ce bouton on lance une partie.
        Button jouerButton = new Button("Jouer");
        jouerButton.setOnAction((event) -> {            
            primaryStage.setScene(jeu);
            gestionnaire.finPause();
            primaryStage.setTitle("IUTO Space Invader");
            jeuRoot.setCursor(Cursor.DISAPPEAR);
        });

        // Création du bouton "Continuer". Quand on appuis sur ce bouton on remet en marche le jeu en reprenant ou l'on c'est arrêter.
        Button continuerButton = new Button("Continuer");
        continuerButton.setOnAction((event) -> {
            System.out.println('e');
            primaryStage.setScene(jeu);
            gestionnaire.finPause();
            primaryStage.setTitle("IUTO Space Invader");
            jeuRoot.setCursor(Cursor.DISAPPEAR);
        });

        // Création du bouton "Recommencer". Quand on appuis sur ce bouton on lance une nouvelle partie.
        Button recommencerButton = new Button("Recommencer");
        recommencerButton.setOnAction((event) -> {
            primaryStage.setScene(jeu);
            gestionnaire = new GestionJeu();
            jeuRoot.setCursor(Cursor.DISAPPEAR);
        });
        
        // Mes les boutons a la même taille en faisant en sorte que l'on puisse voir le texte. 
        quitterButton.setPrefSize(175,45);
        jouerButton.setPrefSize(175,45);
        recommencerButton.setPrefSize(175,45);
        continuerButton.setPrefSize(175,45);

        // Mes des espacement entre les différents boutons.
        layout.setSpacing(40);
        layout2.setSpacing(40);

        // Mes les texte dans la police Aerial et en gras et en taille 16.
        quitterButton.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        jouerButton.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        recommencerButton.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        continuerButton.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        
        // Mes les boutons au centre de la scene.
        layout.setAlignment(Pos.CENTER);
        layout2.setAlignment(Pos.CENTER);

        // Ajoute des boutons dans le label correspondant.
        layout.getChildren().addAll(jouerButton,quitterButton);

        // Affiche l'image avec l'extension .gif en arrière plans de la scene (jeu).
        Image gifJeu = new Image("../image/giphy.gif");
        BackgroundImage jeuImg = new BackgroundImage(gifJeu,
                                               BackgroundRepeat.NO_REPEAT,
                                               BackgroundRepeat.NO_REPEAT,
                                               BackgroundPosition.DEFAULT,
                                               BackgroundSize.DEFAULT);
        Background jeuGround = new Background(jeuImg);
        jeuRoot.setBackground(jeuGround );
        
        //Affiche l'image avec l'extension .gif en arrière plans de la scene (menu).
        Image gifMenu = new Image("../image/menu.gif");
        BackgroundImage menuImg = new BackgroundImage(gifMenu,
                                               BackgroundRepeat.NO_REPEAT,
                                               BackgroundRepeat.NO_REPEAT,
                                               BackgroundPosition.DEFAULT,
                                               BackgroundSize.DEFAULT);
        Background menuGround = new Background(menuImg);
        menuRoot.setBackground(menuGround );
        
        //Quand on presse les fleche directionnel et la touche espace (gauche;droite) mes les booleans correspondant à "true". 
        jeu.setOnKeyPressed((key) -> {
            if(key.getCode()==KeyCode.LEFT || key.getCode()==KeyCode.Q){
                this.appuyerGauche = true;}
            if(key.getCode()==KeyCode.RIGHT || key.getCode()==KeyCode.D){
                this.appuyerDroite=true;}
            if(key.getCode()== KeyCode.SPACE || key.getCode()==KeyCode.Z || key.getCode()==KeyCode.UP){
                this.appuyerEspace = true;}   
        });

        //Quand on relache les fleche directionnel et la touche espace (gauche;droite) mes les booleans correspondant à "false". 
        jeu.setOnKeyReleased((key) -> {
            if(key.getCode()==KeyCode.LEFT || key.getCode()==KeyCode.Q){
                this.appuyerGauche = false;}
            if(key.getCode()==KeyCode.RIGHT || key.getCode()==KeyCode.D){
                this.appuyerDroite = false;}
            if(key.getCode()== KeyCode.SPACE || key.getCode()==KeyCode.Z || key.getCode()==KeyCode.UP){
                this.appuyerEspace = false;}
        });
        
        jeu.addEventHandler(KeyEvent.KEY_PRESSED,(key) -> {

            //Quand on appuie sur echape/esc/escape le jeu se met en pause et change de scene pour aller dans la scene menu.
            if(key.getCode() == KeyCode.ESCAPE){
                if (gestionnaire.getPause() == false){
                    primaryStage.setScene(menu);
                    cptPause +=1;
                    // Quand l'utilisateur appuie une fois sur le bouton les bouton jouer et quitter se supprime pour ajouter les bouton continuer, recommencer et quitter
                    // J'ai supprimer quitter pour le visuel.
                    if (cptPause == 1){ 
                        layout.getChildren().remove(jouerButton);
                        layout.getChildren().remove(quitterButton);
                        layout.getChildren().addAll(continuerButton,recommencerButton,quitterButton);
                    }
                    
                    gestionnaire.pause();
                    jeuRoot.setCursor(Cursor.CROSSHAIR);
                    primaryStage.setTitle("PAUSE");}}
                    
                else{
                    primaryStage.setScene(jeu);
                    gestionnaire.finPause();
                    primaryStage.setTitle("IUTO Space Invaders");
                }
            // Quand le joueur appuie sur le boutonn "Enter/Entrée" du clavier alors qu'il a terminer un niveau alors il passe au suivant.
            if(key.getCode() == KeyCode.ENTER){
                if (gestionnaire.getFin() && !gestionnaire.getQuitter() && !gestionnaire.getPerdu()){

                    // sauvegarde le score du joueur.
                    int score = gestionnaire.getScore();

                    // Un compteur du niveau qui augmente de '1' lorsque le joueur appuie sur Entrée/Enter.
                    cptNiveau += 1;
                    gestionnaire = new GestionJeu();
                    
                    // Mise a jour du niveau.
                    gestionnaire.setNiveau(cptNiveau);

                    // Mise a jour du score.
                    gestionnaire.setScore(score);

                    // pour chaque niveau passer la vitesse de l'alien augmende de 0.05.
                    for(Alien ali : gestionnaire.getListAliens()){
                        ali.incrementeVitesse(cptNiveau*0.05);
                    }
                }
            }

            // Quand le joueur appuie sur le boutonn "Enter/Entrée" du clavier alors que la personne a voulu abandonner alors que elle avais passer le niveau
            // Alors elle reviens au menu principal pour soit demarer un nouveau jeu ou quitter.
            if (gestionnaire.getQuitter()  && key.getCode() == KeyCode.ENTER){
                gestionnaire = new GestionJeu();
                cptNiveau = 0;
                gestionnaire.setQuitter(false);
                primaryStage.setScene(menu);
            }

            // Quand le joueur appui sur "Del/Suppr" du clavier alors elle affiche le score renvoie sur l'instruction si dessus.
            if (key.getCode() == KeyCode.DELETE && gestionnaire.getFin() && !gestionnaire.getPerdu()){
                gestionnaire.setgagnerTrue();
                gestionnaire.setgagnerlevelFalse();
                gestionnaire.setQuitter(true);
            }

            // Quan le joueur appuie sur entrée alors qu'il a perdu alors il sera rediriger vers le menu.
            if (key.getCode() == KeyCode.ENTER && gestionnaire.getFin() && gestionnaire.getPerdu()){
                gestionnaire = new GestionJeu();
                cptNiveau = 0;
                gestionnaire.setQuitter(false);
                primaryStage.setScene(menu);
            }
            
        });
        primaryStage.setScene(menu);
        primaryStage.setResizable(false);
        primaryStage.show();
        lancerAnimation();
}
}
