package com.prs.logic;

import java.time.LocalDateTime;

import javax.persistence.ManyToOne;

public class PurchaseRequest {
	private int id;
	@ManyToOne
	private User user;
	private String descriptiton;
	private LocalDateTime date;
	private String deliveryMode;
	private String status;
	private double total;
	private LocalDateTime submittedDate;
	private String reasonForRejection;
	
	public PurchaseRequest() {
		super();
	}

	public PurchaseRequest(int id, User user, String descriptiton, LocalDateTime date, String deliveryMode,
			String status, double total, LocalDateTime submittedDate, String reasonForRejection) {
		super();
		this.id = id;
		this.user = user;
		this.descriptiton = descriptiton;
		this.date = date;
		this.deliveryMode = deliveryMode;
		this.status = status;
		this.total = total;
		this.submittedDate = submittedDate;
		this.reasonForRejection = reasonForRejection;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getDescriptiton() {
		return descriptiton;
	}

	public void setDescriptiton(String descriptiton) {
		this.descriptiton = descriptiton;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public String getDeliveryMode() {
		return deliveryMode;
	}

	public void setDeliveryMode(String deliveryMode) {
		this.deliveryMode = deliveryMode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public LocalDateTime getSubmittedDate() {
		return submittedDate;
	}

	public void setSubmittedDate(LocalDateTime submittedDate) {
		this.submittedDate = submittedDate;
	}

	public String getReasonForRejection() {
		return reasonForRejection;
	}

	public void setReasonForRejection(String reasonForRejection) {
		this.reasonForRejection = reasonForRejection;
	}

	@Override
	public String toString() {
		return "PurchaseRequest [id=" + id + ", user=" + user.getUserName() + ", descriptiton=" + descriptiton + ", date=" + date
				+ ", deliveryMode=" + deliveryMode + ", status=" + status + ", total=" + total + ", submittedDate="
				+ submittedDate + ", reasonForRejection=" + reasonForRejection + "]";
	}
	
	
}
