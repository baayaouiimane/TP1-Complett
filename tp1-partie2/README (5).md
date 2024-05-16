# TP1/partie2
Vocation principal : 
Dans cette partie on va faire l’injection des dépendances en utilisant les spring.
On a crée un nouveau projet maven et dans le dossier java on va copier tous les packagent crées dans le projet précédent.
![image](https://github.com/baayaouiimane/TP1-Complett/assets/167249908/0500e772-ae6f-4d51-928e-ec6750aeb754)
Puis on a ajouté toutes les dépendances nécessaires dans le fichier pom.xml à partir du site.
![image](https://github.com/baayaouiimane/TP1-Complett/assets/167249908/130b3675-1530-4cd3-b1e7-1e77a681ea8d)
Ensuite on a créé un fichier xml ou on a créé les beans.
![image](https://github.com/baayaouiimane/TP1-Complett/assets/167249908/efc80ce2-3f38-4319-8f29-eca8aa5f9fe8)
Et on a créé un nouveau fichier pour une nouvelle présentation qu’on a appelé PresSpringXML qui utilise le fichier xml précédent.
![image](https://github.com/baayaouiimane/TP1-Complett/assets/167249908/23aa6a53-e03e-4eab-854b-e9d4b0cc5ffe)
 l’affichage est comme suit :
![image](https://github.com/baayaouiimane/TP1-Complett/assets/167249908/1f1f52d7-4369-40b0-bc2f-a2f640b430f9)
Et cette fois ci on veut avoir une version capteurs faut apporter une petite modification a applicationContext:
![image](https://github.com/baayaouiimane/TP1-Complett/assets/167249908/fa5c8bde-59a0-4bc2-89bd-d9abe77eac58)
On obtiendra la sortie suivante:
![image](https://github.com/baayaouiimane/TP1-Complett/assets/167249908/0227a612-e233-4696-af13-0fa4fc90ce7a)
Et cette fois ci on veut avoir une version web service faut apporter une petite modification a applicationContext:
![image](https://github.com/baayaouiimane/TP1-Complett/assets/167249908/afcc64d8-54c2-4d92-9fb3-4e69ce34a487)
On obtiendra la sortie suivante:
![image](https://github.com/baayaouiimane/TP1-Complett/assets/167249908/11c5f318-ac20-440f-aa4c-5d80c238abf4)
Et une autre présentation :
![image](https://github.com/baayaouiimane/TP1-Complett/assets/167249908/f636f475-a87f-482b-a154-1239f62a713d)
On a fait l’injection avec l’annotation Autowired :
![image](https://github.com/baayaouiimane/TP1-Complett/assets/167249908/65b9b7e8-a1c5-4317-aff9-ca8dae879588)
Mais également on peut faire l’injection via le constructeur, alors on a créé un constructeur dans la classe metier qui recoit un objet de type IDao.
![image](https://github.com/baayaouiimane/TP1-Complett/assets/167249908/15be7fe6-fa7b-4f55-bcf8-60697d64c5ed)
-	La partie xml ne va plus fonctionner car on a plus le constructeur sans paramètres, mais par contre pour la version annotations ça va marcher.
Donc pour travailler avec la version xml il faut modifier dans le fichier
![image](https://github.com/baayaouiimane/TP1-Complett/assets/167249908/1c84cfae-b883-40c9-9b67-8c34662ec5f7)
Lorsqu’on a plusieurs beans, il faut donner a chaque bean un nom.
![image](https://github.com/baayaouiimane/TP1-Complett/assets/167249908/78d8bfe0-b391-4a8f-b572-78df64cd3b60)
![image](https://github.com/baayaouiimane/TP1-Complett/assets/167249908/62c2b4aa-d2da-4c07-ae4a-836948f353d3)
Puis on va utiliser la méthode Autowired et Qualifier(ici on va spécifier quel bean à utiliser).
![image](https://github.com/baayaouiimane/TP1-Complett/assets/167249908/cdbd3f79-b061-4075-9596-6a2ef615b4b2)
Mais si on travaillé avec le constructeur on n’aura pas ce genre de problème.
Et finalement on a créé un test :
![image](https://github.com/baayaouiimane/TP1-Complett/assets/167249908/1bc58d20-85d5-4e97-b8ec-2ba7bf9d0474)
En exécutant le code on aura donc:
![image](https://github.com/baayaouiimane/TP1-Complett/assets/167249908/c2e675e4-472b-4b64-9ea1-712d9ceb41d6)






















