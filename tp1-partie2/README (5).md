# TP1/partie2
Vocation principal : 
Dans cette partie on va faire l’injection des dépendances en utilisant les spring.
On a créé un nouveau projet maven et dans le dossier java on va copier tous les packages crées dans le projet précédent.
![image](https://github.com/baayaouiimane/TP-Systeme-distribue/assets/167249908/99034e5a-45e5-40e2-8312-5fd005614437)
Par la suite on a ajouté toutes les dépendances nécessaires dans le fichier pom.xml à partir du site.
![image](https://github.com/baayaouiimane/TP-Systeme-distribue/assets/167249908/ebab3fba-a371-4c5d-af76-42d5f677155f)
Ensuite on a créé un fichier xml ou on a créé les beans.
![image](https://github.com/baayaouiimane/TP-Systeme-distribue/assets/167249908/be30a242-aa08-4edd-a123-d47ac1f57668)
Et on a créé un nouveau fichier pour une nouvelle présentation qu’on a appelé PresSpringXML qui utilise le fichier xml précédent.
![image](https://github.com/baayaouiimane/TP-Systeme-distribue/assets/167249908/fb19a6d8-fd34-4871-ba1e-58cf3e3a97a6)
En exécutant le code ci-dessus on aura le résultat suivant:
![image](https://github.com/baayaouiimane/TP-Systeme-distribue/assets/167249908/8985f8f4-7063-4045-bf67-8df6ca825987)
Et une autre présentation :
![image](https://github.com/baayaouiimane/TP-Systeme-distribue/assets/167249908/19a8bedd-4586-43d2-af9f-73ddcce4eccc)
On a fait l’injection avec l’annotation Autowired :
![image](https://github.com/baayaouiimane/TP-Systeme-distribue/assets/167249908/b121d25e-a934-420f-b18b-d386cece5a7c)
Mais également on peut faire l’injection via le constructeur, alors on a effectué une  création d’un constructeur dans la classe metier qui recoit un objet de type IDao.
![image](https://github.com/baayaouiimane/TP-Systeme-distribue/assets/167249908/a448dc5d-4bcf-4b4c-b08b-a1cc98b1efc0)
-	La partie xml ne va plus fonctionner car on a plus le constructeur sans paramètres, mais par contre pour la version annotations ça va marcher.Donc pour travailler avec la version xml il faut modifier dans le fichier : 
![image](https://github.com/baayaouiimane/TP-Systeme-distribue/assets/167249908/e5228a0b-cb65-4af0-ac94-fbd867932559)
Lorsqu’on a plusieurs beans, il faut donc attribuer à chaque bean un nom.
![image](https://github.com/baayaouiimane/TP-Systeme-distribue/assets/167249908/87bb8afb-84f5-4866-a56b-45cfbf593296)
![image](https://github.com/baayaouiimane/TP-Systeme-distribue/assets/167249908/dabe4d5c-9c2e-415d-96e5-aa698e280b0c)
Puis on va utiliser la méthode Autowired et Qualifier(ici on va spécifier quel bean à utiliser).
![image](https://github.com/baayaouiimane/TP-Systeme-distribue/assets/167249908/f61e2b11-d197-48e6-83c2-d14467d63470)
Mais si on travaille avec le constructeur on n’aura pas ce genre de problème.
Et au final on a créé un test :
![image](https://github.com/baayaouiimane/TP-Systeme-distribue/assets/167249908/ed01147c-cc52-469c-9698-f8f7f9373572)














