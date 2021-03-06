package po;

import java.io.Serializable;
import java.util.Date;

import enumSet.ArrivalState;
import enumSet.ReceiptsState;

/**
 * 到达单PO
 * 
 * @author 王栋
 *
 */
public class ArrivalPO extends ReceiptsPO implements Serializable{

	
	private static final long serialVersionUID = 1L;
	/**
	 * 到达日期
	 */
	private Date date;
	/**
	 * 中转单单号
	 */
	private String transferId;
	/**
	 * 出发地
	 */
	private String departure;
	/**
	 * 到达状态
	 */
	private ArrivalState condition;

	

	
/**
 * 
 * @param state 状态 ： 审批未审批
 * @param userID 操作的用户
 * @param date 时间
 * @param transferId 中转单单号
 * @param departure 出发地址
 * @param condition 到达状态
 */

	public String getTransferId() {
		return transferId;
	}

	public ArrivalPO(Date date, String transferId, String departure,
		ArrivalState condition) {
	super();
	this.date = date;
	this.transferId = transferId;
	this.departure = departure;
	this.condition = condition;
}

	public void setTransferId(String transferId) {
		this.transferId = transferId;
	}

	public ReceiptsState getState() {
		return state;
	}

	public void setState(ReceiptsState state) {
		this.state = state;
	}


	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}



	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public ArrivalState getCondition() {
		return condition;
	}

	public void setCondition(ArrivalState condition) {
		this.condition = condition;
	}

}
