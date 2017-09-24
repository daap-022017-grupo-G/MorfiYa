package repository;

import model.Client;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import java.util.List;

public class ClientRepository extends HibernateGenericDAO<Client> implements GenericRepository<Client> {

    private static final long serialVersionUID = -4036535812105672110L;

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<Client> filterPeople(final String pattern) {
        return (List<Client>) this.getHibernateTemplate().execute(new HibernateCallback() {
            @Override
            public List<Client> doInHibernate(final Session session) throws HibernateException {
                Criteria criteria = session.createCriteria(Client.class);
                criteria.add(Restrictions.like("name", "%" + pattern + "%"));
                return criteria.list();
            }

        });
    }

    @Override
    protected Class<Client> getDomainClass() {
        return Client.class;
    }

}
