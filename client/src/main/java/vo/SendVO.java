package vo;

import java.util.Date;

import po.SendPO;
import enumSet.Express;
import enumSet.PackType;
import enumSet.ReceiptsState;

public class SendVO extends ReceiptsVO {

	// 寄件时间
	private Date d;
	// 寄件人的基本信息
	private CustomerVO sender;
	// 收件人的基本信息
	private CustomerVO receiver;
	// 寄件的个数
	private int goodsNum;
	// 快递物品的名称
	private String name;
	// 快递的重量
	private double weight;
	// 快递的体积
	private double volume;
	// 快递的种类
	private Express expressType;
	// 快递的包装的种类
	private PackType packType;
	// 快递费用 自动生成
	private double fare;
	// 预计到达时间 在没有历史数据的情况下是显示0
	private int arriveDate;

	public SendVO(SendPO po) {
		this(po.getState(), po.getUserID(), po.getD(), new CustomerVO(
				po.getSender()), new CustomerVO(po.getReceiver()), po
				.getGoodsNum(), po.getName(), po.getWeight(), po.getVolume(),
				po.getExpressType(), po.getPackType(), po.getFare(), po
						.getArriveDate());
	}

	public SendVO(ReceiptsState state, String userID, Date d,
			CustomerVO sender, CustomerVO receiver, int goodsNum, String name,
			double weight, double volume, Express expressType,
			PackType packType, double fare, int arriveDate) {
		super(state, userID);
		this.d = d;
		this.sender = sender;
		this.receiver = receiver;
		this.goodsNum = goodsNum;
		this.name = name;
		this.weight = weight;
		this.volume = volume;
		this.expressType = expressType;
		this.packType = packType;
		this.fare = fare;
		this.arriveDate = arriveDate;
	}

	/**
	 * vo转为po
	 * 
	 * @return
	 */
	public SendPO transToPO() {
		return new SendPO(state, name, d, sender.transToPO(),
				receiver.transToPO(), goodsNum, name, weight, volume,
				expressType, packType, fare, arriveDate);
	}

	public Date getD() {
		return d;
	}

	public CustomerVO getSender() {
		return sender;
	}

	public CustomerVO getReceiver() {
		return receiver;
	}

	public int getGoodsNum() {
		return goodsNum;
	}

	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}

	public double getVolume() {
		return volume;
	}

	public Express getExpressType() {
		return expressType;
	}

	public PackType getPackType() {
		return packType;
	}

	public double getFare() {
		return fare;
	}

	public int getArriveDate() {
		return arriveDate;
	}

}
