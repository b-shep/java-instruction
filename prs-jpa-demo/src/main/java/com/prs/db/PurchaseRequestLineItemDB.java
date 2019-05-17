package com.prs.db;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.prs.logic.PurchaseRequest;
import com.prs.logic.PurchaseRequestLineItem;

public class PurchaseRequestLineItemDB {
	public List<PurchaseRequestLineItem> getAll(){
		List<PurchaseRequestLineItem> purchaseRequests = null;
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		
		try {
			Query q = em.createQuery("Select prli from PurchaseRequestLineItem prli");
			purchaseRequests = q.getResultList();
		} finally {
			em.close();
		}
		return purchaseRequests;
	}
	
	public static PurchaseRequestLineItem get(int id) {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		String queryString = "SELECT prli FROM PurchaseRequestLineItem prli " +
							 "WHERE prli.id = :id";
		TypedQuery<PurchaseRequestLineItem> q = em.createQuery(queryString, PurchaseRequestLineItem.class);
		q.setParameter("id", id);
		PurchaseRequestLineItem purchaseRequestLineItem = null;
		try {
			purchaseRequestLineItem = q.getSingleResult();
		}
		catch (NoResultException e) {
			System.err.println(e);
		}
		finally {
			em.close();
		}
		return purchaseRequestLineItem;
		
	}
	
	public boolean add(PurchaseRequestLineItem prli) {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		
		try {
			trans.begin();
			em.persist(prli);
			trans.commit();
			return true;
		} catch (Exception ex) {
			System.err.println(ex);
			trans.rollback();
			return false;
		} finally {
			em.close();
		}
	}
	
	public static boolean delete(PurchaseRequestLineItem prli) {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		
		try {
			trans.begin();
			em.remove(em.merge(prli));
			trans.commit();
			return true;
		} catch (Exception ex) {
			System.err.println(ex);
			trans.rollback();
			return false;
		} finally {
			em.close();
		}
	}
	
	public boolean update(PurchaseRequestLineItem prli) {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		
		try {
			trans.begin();
			em.merge(prli);
			trans.commit();
			return true;
		} catch (Exception ex) {
			System.err.println(ex);
			trans.rollback();
			return false;
		} finally {
			em.close();
		}
	} 
	

}
