package metier;

import dao.IDao;
import ext.DaoImpl2;
import ext.DaoImplVWS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {


    @Autowired


    private IDao dao; // couplage faible
   public MetierImpl(IDao dao){
        this.dao=dao;
    }





    @Override
    public double calcul() {
        double tmp = dao.getData();
        double res = tmp*540/Math.cos(tmp*Math.PI) ;
        return res;
    }

    /*
    injecter dans la variable dao un objet d'une classe qui implimente l'interface IDao
     */

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}




