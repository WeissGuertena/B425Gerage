package po;

import java.util.Date;

import enumSet.ReceiptsState;

public class ReceivePO extends ReceiptsPO{
	
	//快递单号
	private String id;
	//收件人的姓名
	private String name;
	//日期
	private Date d;


	
	/**
	 * 构造函数
	 * @param state
	 * @param user
	 * @param id
	 * @param name
	 * @param d
	 */
	public ReceivePO(ReceiptsState state, UserPO user, String id, String name,
			Date d) {
		super(state, user);
		this.id = id;
		this.name = name;
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

	public Date getD() {
		return d;
	}

	public void setD(Date d) {
		this.d = d;
	}
}