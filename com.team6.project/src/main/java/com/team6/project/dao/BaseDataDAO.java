package com.team6.project.dao;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;

import javax.ejb.Local;

import com.team6.project.entities.BaseData;
import com.team6.project.entities.EventCausePK;
import com.team6.project.entities.FailureType;
import com.team6.project.entities.OperatorCountryPK;
import com.team6.project.entities.UserEquipment;



@Local
public interface BaseDataDAO {

	public Collection<BaseData> findByImsi(BigInteger imsi);
	
	public Collection<BaseData> findByFailureType(FailureType failureType);
	
	public Collection<BaseData> findByUserEquipment(UserEquipment userEquipment);
	
	public Collection<BaseData> findByOperatorByMCC(Integer mcc);

	public Collection<BaseData> findByOperatorCountryPK(OperatorCountryPK operatorCountryPK);
	
	public Collection<BaseData> findByEventCause(EventCausePK eventCausePK);
	
	public Collection<BaseData> getAllBaseData();
	
	public Collection<BaseData> findImsiByDates(String neVersion); 

	public BaseData getBaseDataByKey(Integer id);

	public void addBaseData(BaseData baseData);

	public void deleteBaseData(BaseData baseData);
	
//	public void updateBaseData(BaseData baseData);

//	public void deleteAll();

}
