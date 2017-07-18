package com.egnaro.models;

import java.util.Date;

import com.github.jmkgreen.morphia.annotations.Entity;

@Entity
public class Expenses {
	
	private long closingBalance;
	private long openingBalance;
	private long cumulativeBalance;
	private Date currentDate;
	private Date modifiedDate;
	private Date purchaseDate;
	private TransactionTypes transactionType;
	private String transactionDescription;
	private long transactionAmount;
	private String transactionBillNo;
	private String transactionCategory;
	/**
	 * @return the closingBalance
	 */
	public long getClosingBalance() {
		return closingBalance;
	}
	/**
	 * @param closingBalance the closingBalance to set
	 */
	public void setClosingBalance(long closingBalance) {
		this.closingBalance = closingBalance;
	}
	/**
	 * @return the openingBalance
	 */
	public long getOpeningBalance() {
		return openingBalance;
	}
	/**
	 * @param openingBalance the openingBalance to set
	 */
	public void setOpeningBalance(long openingBalance) {
		this.openingBalance = openingBalance;
	}
	/**
	 * @return the cumulativeBalance
	 */
	public long getCumulativeBalance() {
		return cumulativeBalance;
	}
	/**
	 * @param cumulativeBalance the cumulativeBalance to set
	 */
	public void setCumulativeBalance(long cumulativeBalance) {
		this.cumulativeBalance = cumulativeBalance;
	}
	/**
	 * @return the currentDate
	 */
	public Date getCurrentDate() {
		return currentDate;
	}
	/**
	 * @param currentDate the currentDate to set
	 */
	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}
	/**
	 * @return the modifiedDate
	 */
	public Date getModifiedDate() {
		return modifiedDate;
	}
	/**
	 * @param modifiedDate the modifiedDate to set
	 */
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	/**
	 * @return the purchaseDate
	 */
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	/**
	 * @param purchaseDate the purchaseDate to set
	 */
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	/**
	 * @return the transactionType
	 */
	public TransactionTypes getTransactionType() {
		return transactionType;
	}
	/**
	 * @param transactionType the transactionType to set
	 */
	public void setTransactionType(TransactionTypes transactionType) {
		this.transactionType = transactionType;
	}
	/**
	 * @return the transactionDescription
	 */
	public String getTransactionDescription() {
		return transactionDescription;
	}
	/**
	 * @param transactionDescription the transactionDescription to set
	 */
	public void setTransactionDescription(String transactionDescription) {
		this.transactionDescription = transactionDescription;
	}
	/**
	 * @return the transactionAmount
	 */
	public long getTransactionAmount() {
		return transactionAmount;
	}
	/**
	 * @param transactionAmount the transactionAmount to set
	 */
	public void setTransactionAmount(long transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	/**
	 * @return the transactionBillNo
	 */
	public String getTransactionBillNo() {
		return transactionBillNo;
	}
	/**
	 * @param transactionBillNo the transactionBillNo to set
	 */
	public void setTransactionBillNo(String transactionBillNo) {
		this.transactionBillNo = transactionBillNo;
	}
	/**
	 * @return the transactionCategory
	 */
	public String getTransactionCategory() {
		return transactionCategory;
	}
	/**
	 * @param transactionCategory the transactionCategory to set
	 */
	public void setTransactionCategory(String transactionCategory) {
		this.transactionCategory = transactionCategory;
	}
	
 	
}
