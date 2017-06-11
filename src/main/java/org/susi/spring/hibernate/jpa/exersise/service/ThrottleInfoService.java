package org.susi.spring.hibernate.jpa.exersise.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.susi.spring.hibernate.jpa.exersise.dao.ThrottleInfoDao;
import org.susi.spring.hibernate.jpa.exersise.model.ThrottleInfo;

@Service("ThrottleInfoService")
public class ThrottleInfoService {

		@Autowired
		private ThrottleInfoDao throttleDao;

		@Transactional
		public void add(ThrottleInfo throttleInfo) {
			throttleDao.saveThrottleInfo(throttleInfo);
		}
}
