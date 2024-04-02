package ext;

import dao.IDao;
public class DaoimplVWS implements IDao{
    @Override
    public double getData() {
        System.out.println("la version web service");
        return 90;
    }
}
