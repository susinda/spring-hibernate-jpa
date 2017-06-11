
package org.susi.spring.hibernate.jpa.exersise.dao;

import org.springframework.stereotype.Repository;
import org.susi.spring.hibernate.jpa.exersise.model.ThrottleInfo;


@Repository("throttleInfoDao")
public class ThrottleInfoDaoImpl extends AbstractJpaDao<ThrottleInfo> implements ThrottleInfoDao {
	
	public ThrottleInfoDaoImpl() {
		System.out.println(" XXX ThrottleInfoDaoImpl cctor setClazz(ThrottleInfo.class); XXX " );
		setClazz(ThrottleInfo.class);
	}
	

	@Override
	public ThrottleInfo getByThrotleId(long l) {
         return getById(l);
	}
	
	
	@Override
	public ThrottleInfo getById(Long id) {
		// TODO Auto-generated method stub
		return super.getById(id);
	}
	
	@Override
	public void save(ThrottleInfo entity) {
		// TODO Auto-generated method stub
		super.save(entity);
	}
	
    @Override
    public void update(ThrottleInfo entity) {
    	// TODO Auto-generated method stub
    	super.update(entity);
    }
    
    @Override
    public void setClazz(Class<ThrottleInfo> clazzToSet) {
    	// TODO Auto-generated method stub
    	super.setClazz(clazzToSet);
    }


	@Override
	public void saveThrottleInfo(ThrottleInfo throttleInfo) {
		save(throttleInfo);
	}

}

