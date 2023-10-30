Problème :
	
	À cause du gif du menu, on peut voir un problème de type : "java.lang.OutOfMemoryError: Java heap space."
	Pour régler ce problème, on doit remplacer un bout de code de la classe Executable a la ligne 210 :


    Image gifMenu = new Image("../image/menu.gif");
        BackgroundImage menuImg = new BackgroundImage(gifMenu,
                                               BackgroundRepeat.NO_REPEAT,
                                               BackgroundRepeat.NO_REPEAT,
                                               BackgroundPosition.DEFAULT,
                                               BackgroundSize.DEFAULT);
        Background menuGround = new Background(menuImg);
        menuRoot.setBackground(menuGround );

    ----Remplacer le code si-dessus par le code si-dessous.-----

    Image gifMenu = new Image("../image/menuRemplacement.gif");
        BackgroundImage menuImg = new BackgroundImage(gifMenu,
                                               BackgroundRepeat.NO_REPEAT,
                                               BackgroundRepeat.NO_REPEAT,
                                               BackgroundPosition.DEFAULT,
                                               BackgroundSize.DEFAULT);
        Background menuGround = new Background(menuImg);
        menuRoot.setBackground(menuGround );


	ATTENTION : Si vous faites ça vous n'aurai plus le gif personnaliser, mais un gif pixeliser pris sur Internet.
	

	