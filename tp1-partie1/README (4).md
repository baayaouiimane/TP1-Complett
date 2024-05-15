# TP1/partie1
Vocation principale:
Dans cette partie on  va effectuer  l’injection des dépendances  par instanciation statique et instanciation dynamique.
D’abords on a créé un package dao et dans ce dernier on a une interface IDao qui contient une fonction getData () qu’elle doit être implémentée par toutes les classes qui implémentent cette interface.
![image](https://github.com/baayaouiimane/TP1-Complett/assets/167249908/2dbe974a-20b3-4078-a46f-2ac3e8865cba)
Puis on a créé la classe DaoImpl qui implémente l’interface IDao dont on s' est connecté à la base de données pour récupérer la température.
![image](https://github.com/baayaouiimane/TP1-Complett/assets/167249908/4401bfc7-5f72-4dce-b1b3-9ad3c2de48c5)
Ensuite on a créé un autre package metier et une interface IMetier qui contient la fonction calcul ().
![image](https://github.com/baayaouiimane/TP1-Complett/assets/167249908/c6b6e2f7-5b65-4fb7-8269-cad9c41533e6)
Et dans ce package on a une classe MetierImpl qui représente une partie de la logique métier de l'application qui dépend d'un objet qui implémente l'interface IDao. Cette dépendance est injectée dans la classe à l'aide d'une méthode setter, permettant ainsi de remplacer facilement l'implémentation de IDao sans modifier le code de MetierImpl:
![image](https://github.com/baayaouiimane/TP1-Complett/assets/167249908/5252ff0f-0984-4d36-b973-7af696aa926b)
Et pour présenter les résultats, dans le package pres on a créé une classe présentation :
![image](https://github.com/baayaouiimane/TP1-Complett/assets/167249908/722c2aca-1aaa-4c25-b507-eec8637c6a97)
Et pour la version capteurs on a créé dans un autre package une classe DaoImpl2 :
![image](https://github.com/baayaouiimane/TP1-Complett/assets/167249908/ad2f564c-f6a2-4ea4-a235-c8ae66220b66)
Maintenant on veut que notre application utilise cette version au lieu de l’autre. Donc on ne va rien changer dans la couche Dao et la couche metier, mais on va modifier dans la couche presentation.
![image](https://github.com/baayaouiimane/TP1-Complett/assets/167249908/5299a5db-687e-445e-9c0a-4741dc1e9930)
Alors si on exécute le code on aura bien la version capteurs.
![image](https://github.com/baayaouiimane/TP1-Complett/assets/167249908/24bb648f-f2f2-46da-8df1-4263c75114a9)
Maintenant on veut que notre application soit fermée à la modification sans utiliser les Framework, mais on va utiliser l’instanciation dynamique au lieu de l’instanciation statique.
D’abords on va créer un fichier config.txt dont on va écrire les classes qu’on a.
![image](https://github.com/baayaouiimane/TP1-Complett/assets/167249908/738a7b8a-1eb3-4433-bc3f-ad67358030c4)
 Puis dans le package pres on va créer une 2eme classe presentation. Et dans cette classe on veut faire l’instanciation des classes qu’on ne connait pas son nom.
Donc on doit lire le nom de la classe a partir du fichier config puis charger la classe au mémoire et en fin instancier la classe.
![image](https://github.com/baayaouiimane/TP1-Complett/assets/167249908/5a9b230f-8afb-4483-b848-885563d61c24)
En executant on a la sortie suivante:
![image](https://github.com/baayaouiimane/TP1-Complett/assets/167249908/583402c2-08b9-4463-9812-b6cfa43ad9db)
	Donc l’avantage de cette méthode est lorsqu on veut utiliser la version base de données ou la version capteurs, on ne va pas changer dans le code mais juste dans le fichier config.
On va faire la même chose avec la 2eme classe et on aura le code suivant avec la méthode dynamique:
![image](https://github.com/baayaouiimane/TP1-Complett/assets/167249908/f1a873f8-cfeb-4eac-b91a-6fad140caec4)
En executant on aura le resultat suivant pour la version base donnee:
![image](https://github.com/baayaouiimane/TP1-Complett/assets/167249908/3840fc68-7a14-42d2-9301-f8c209540424)
Et pour la version web service:




























 












