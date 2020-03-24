Créer une classe `Monster` avec les attributs :

* name (String)
* damage (int)
* life (int)

Créer un constructeur permettant d’initialiser ses attributs, ainsi que les accesseurs et mutateurs.

Ajouter une méthode instanciée attack, qui prend une instance de monstre adverse en paramètre : l’attribut life du monstre adverse doit se voir soustrait la valeur de l'attribut damage de l'instance en cours.

De plus, la méthode doit afficher "{name} has {life} points remaining." si le nombre de point de vie est supérieur à zéro, ou "{name} is KO!" sinon.

Créer une classe `Arena` avec une méthode main(). Instancier deux objets de la classe Monster avec des valeurs au choix, puis les faire combattre jusqu’à ce qu’un des deux soit KO.

Compiler et tester la classe Arena.