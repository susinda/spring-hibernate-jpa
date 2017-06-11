package org.susi.spring.hibernate.jpa.exersise.dao;

import org.susi.spring.hibernate.jpa.exersise.model.ThrottleInfo;

public interface ThrottleInfoDao {

	public ThrottleInfo getByThrotleId(long l);
	public void saveThrottleInfo(ThrottleInfo throttleInfo);

}
