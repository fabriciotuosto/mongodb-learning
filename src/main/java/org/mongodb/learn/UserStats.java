package org.mongodb.learn;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;

public class UserStats {
	
	@JsonProperty("_id")
	private String id;
	private long credit;
	private long coins;
	private int xp;
	private int freeCredits;
	private String bestHand;
	private int bestPot;
	private int handsPlayed;
	private int handsWon;
	private long totalChipsWon;
	private long totalChipsLost;
	private int dailyBonus;
	private Date dailyBonusUpdate;
	private int friends;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public long getCredit() {
		return credit;
	}
	public void setCredit(long credit) {
		this.credit = credit;
	}
	public long getCoins() {
		return coins;
	}
	public void setCoins(long coins) {
		this.coins = coins;
	}
	public int getXp() {
		return xp;
	}
	public void setXp(int xp) {
		this.xp = xp;
	}
	public int getFreeCredits() {
		return freeCredits;
	}
	public void setFreeCredits(int freeCredirts) {
		this.freeCredits = freeCredirts;
	}
	public String getBestHand() {
		return bestHand;
	}
	public void setBestHand(String bestHand) {
		this.bestHand = bestHand;
	}
	public int getBestPot() {
		return bestPot;
	}
	public void setBestPot(int bestPot) {
		this.bestPot = bestPot;
	}
	public int getHandsPlayed() {
		return handsPlayed;
	}
	public void setHandsPlayed(int handsPlayed) {
		this.handsPlayed = handsPlayed;
	}
	public int getHandsWon() {
		return handsWon;
	}
	public void setHandsWon(int handsWon) {
		this.handsWon = handsWon;
	}
	public long getTotalChipsWon() {
		return totalChipsWon;
	}
	public void setTotalChipsWon(long totalChipsWon) {
		this.totalChipsWon = totalChipsWon;
	}
	public long getTotalChipsLost() {
		return totalChipsLost;
	}
	public void setTotalChipsLost(long totalChipsLost) {
		this.totalChipsLost = totalChipsLost;
	}
	public int getDailyBonus() {
		return dailyBonus;
	}
	public void setDailyBonus(int dailyBonus) {
		this.dailyBonus = dailyBonus;
	}
	public Date getDailyBonusUpdate() {
		return dailyBonusUpdate;
	}
	public void setDailyBonusUpdate(Date dailyBonusUpdate) {
		this.dailyBonusUpdate = dailyBonusUpdate;
	}
	public int getFriends() {
		return friends;
	}
	public void setFriends(int friends) {
		this.friends = friends;
	}
}
