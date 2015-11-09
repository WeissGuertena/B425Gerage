package po;

import java.util.Date;

import enumSet.ReceiptsState;

/**
 * 派件单PO==到达单PO
 * @author 王栋
 *
 */
public class DeliveryPO extends ReceiptsPO{
	
	/**
	 *时间对象到达日期
	 */
	private Date d;
	/**
	 * 派件单所派送的货物的快递单号
	 */
	private String id;
	/**
	 * 派送员姓名
	 */
	private String name;
	
	
	
	
	/**
	 * 构造函数
	 * @param state
	 * @param user
	 * @param d
	 * @param id
	 * @param name
	 */
	public DeliveryPO(ReceiptsState state, UserPO user, Date d, String id,
			String name) {
		super(state, user);
		this.d = d;
		this.id = id;
		this.name = name;
	}
	
	
	public Date getD() {
		return d;
	}
	public void setD(Date d) {
		this.d = d;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	
}
