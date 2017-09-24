package repository;

import model.Provider;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate4.HibernateCallback;

import java.util.List;

public class ProviderRepository extends HibernateGenericDAO<Provider> implements GenericRepository<Provider> {

    private static final long serialVersionUID = -4036535812105672110L;

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<Provider> filterPeople(final String pattern) {
        return (List<Provider>) this.getHibernateTemplate().execute(new HibernateCallback() {
            @Override
            public List<Provider> doInHibernate(final Session session) throws HibernateException {
                Criteria criteria = session.createCriteria(Provider.class);
                criteria.add(Restrictions.like("name", "%" + pattern + "%"));
                return criteria.list();
            }

        });
    }

    @Override
    protected Class<Provider> getDomainClass() {
        return Provider.class;
    }

}
