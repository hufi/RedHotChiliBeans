package com.team6.project.services;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;

import javax.ejb.Local;
import javax.inject.Inject;

import com.team6.project.dao.BaseDataDAO;
import com.team6.project.dao.FailureTypeDAO;
import com.team6.project.dao.UserDAO;
import com.team6.project.dao.UserEquipmentDAO;
import com.team6.project.entities.BaseData;
import com.team6.project.entities.EventCause;
import com.team6.project.entities.FailureType;
import com.team6.project.entities.User;
import com.team6.project.entities.UserEquipment;

/**
 * The QueryService EJB
 * 
 * @author Eoin Kernan
 * @author James Mc Ternan
 * @author Cristiana Conti
 */
@Local(QueryServiceLocal.class)
public class QueryService implements QueryServiceLocal {

	@Inject
	private UserEquipmentDAO userEquipment;

	@Inject
	private FailureTypeDAO failureType;
	/**
	 * 
	 */
	@Inject
	private UserDAO user;
	@Inject
	private BaseDataDAO baseData;

	public QueryService() {
	}

	@Override
	public Collection<UserEquipment> getAllUserEquipment() {
		return userEquipment.getAllUserEquipment();
	}

	@Override
	public Collection<EventCause> findByIMSI(BigInteger IMSI) {
		return baseData.findByImsi(IMSI);
	}

	@Override
	public User getUserByKey(String newUserId) {
		return user.getUserByKey(newUserId);
	}

	@Override
	public Collection<User> getAllUser() {
		return user.getAllUser();
	}

	@Override
	public Collection<Object[]> getDistinctEventByTac(Integer ue) {
		return baseData.getDistinctEventByTac(ue);
	}

	@Override
	public Collection<Object[]> getFailureCountAndDurationPerImsiByDate(
			Date startDate, Date endDate) {
		return baseData.getFailureCountAndDurationPerImsiByDate(startDate,
				endDate);
	}

//	@Override
//	public Collection<Object[]> findImsiByDate(Date firstDate, Date secondDate) {
//
//		return baseData.findImsiByDate(firstDate, secondDate);
//	}

	@Override

	public Collection<BaseData> countCallFailurePerImsiByDate(BigInteger imsi, Date startDate, Date endDate) {
		return baseData.countCallFailurePerImsiByDate(imsi, startDate, endDate);
	}

	public Collection<BigInteger> getAllImsi() {
		return baseData.getAllImsi();
	}

	@Override
	public Collection<Object[]> getUniqueEventCauseByImsi(BigInteger imsi) {
		return baseData.getUniqueEventCauseByImsi(imsi);
	}

	public Collection<Object[]> getTopTenFailuresByDate(Date start, Date end) {
		return baseData.getTopTenFailuresByDate(start, end);
	}

	@Override
	public long countCallFailureByTac(Integer tac, Date fromDate, Date toDate) {

		return baseData.countCallFailureByTac(tac, fromDate, toDate);
	}

	@Override
	public Collection<Object[]> getTOP10MarketOperatorCellByDate(Date fromDate,
			Date toDate) {

		return baseData.getTOP10MarketOperatorCellByDate(fromDate, toDate);
	}

	@Override
	public Collection<Object[]> getImsiByFailureCode(Integer fc) {

		return baseData.getImsiByFailureCode(fc);
	}
	
	
	public Collection<FailureType> getAllFailureTypes() {
		return failureType.getAllFailureTypes();
	}

	@Override
	public Collection<Object[]> findImsiByDate(Date firstDate, Date secondDate) {
		return baseData.findImsiByDate(firstDate, secondDate);
	}



}
