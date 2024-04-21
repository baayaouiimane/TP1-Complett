# TP1/partie1
Vocation principale:
Dans cette partie on va effectuer l’injection des dépendances par  une instanciation statique et  une instanciation dynamique.
D’abord on a effectué une création d’un package dao et dans ce dernier on a une interface IDao qui contient une fonction getData () qu’elle doit être implémentée par toutes les classes qui implémentent cette interface.
![image](https://github.com/baayaouiimane/TP1-Complet/assets/167249908/08c36ffa-54aa-41ce-8ad5-1fc1d9dfd139)
Puis on a créé la classe DaoImpl qui implémente l’interface IDao dont on a se connecter à la base de données pour récupérer la température.
![image](https://github.com/baayaouiimane/TP1-Complet/assets/167249908/c11331e8-0441-4606-aff3-4fb418e29446)
Ensuite on a créé un autre package metier et une interface IMetier qui contient la fonction calcul ().
![image](https://github.com/baayaouiimane/TP1-Complet/assets/167249908/4ab71809-1452-4f49-875f-a47fefd29c91)
Et dans ce package on a une classe MetierImpl qui représente une partie de la logique métier de l'application qui dépend d'un objet qui implémente l'interface IDao. Cette dépendance est injectée dans la classe à l'aide d'une méthode setter, permettant ainsi de remplacer facilement l'implémentation de IDao sans modifier le code de MetierImpl.
![image](https://github.com/baayaouiimane/TP1-Complet/assets/167249908/e374bad1-aa8d-479e-bcc0-2983c159f9da)
Et pour présenter les résultats, dans le package pres on a créé une classe présentation :
![image](https://github.com/baayaouiimane/TP1-Complet/assets/167249908/b1150cfe-1adc-48d2-8ac3-487b35b00b4a)
Et pour la version capteurs on a créé dans un autre package une classe DaoImpl2 :
![image](https://github.com/baayaouiimane/TP1-Complet/assets/167249908/86bf6e24-88b0-4c1b-8d2d-95e0861ebb7c)
Maintenant on veut que notre application utilise cette version au lieu de l’autre. Donc on ne va rien changer dans la couche Dao et la couche metier, mais on va modifier dans la couche presentation.
![image](https://github.com/baayaouiimane/TP1-Complet/assets/167249908/e632f277-0cb5-49e2-b864-8e825ed375f8)
Alors si on exécute le code on aura bien la version capteurs.
![image](https://github.com/baayaouiimane/TP1-Complet/assets/167249908/db0bf293-97ec-45ef-9b6d-be4e6e865ea1)
Maintenant on veut que notre application soit fermée à la modification sans utiliser les Framework, mais on va utiliser l’instanciation dynamique au lieu de l’instanciation statique.
D’abords on va créer un fichier config.txt dont on va écrire les classes qu’on a.
![image](https://github.com/baayaouiimane/TP1-Complet/assets/167249908/8049753e-6e90-4c2b-b803-7a4ac02c0da9)
 Puis dans le package pres on va créer une 2eme classe presentation. Et dans cette classe on veut faire l’instanciation des classes qu’on ne connait pas son nom.
Donc on doit lire le nom de la classe a partir du fichier config puis charger la classe au mémoire et en fin instancier la classe.
![image](https://github.com/baayaouiimane/TP1-Complet/assets/167249908/cbb672b7-e677-4675-a1be-f9a452f8b62d)
	Donc l’avantage de cette méthode est lorsque on veut utiliser la version base de données ou la version capteurs, on ne va pas changer dans le code mais juste dans le fichier config.
On va faire la même chose avec la 2eme classe et on aura le code suivant avec la méthode dynamique.
![image](https://github.com/baayaouiimane/TP1-Complet/assets/167249908/f5765938-fb98-4070-b43d-aec6dc62cdf8)













 












