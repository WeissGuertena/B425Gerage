package businessLogics_Stub;

import businessLogicsService.ShipmentBLService;
import vo.ShipmentVO;

public class ShipmentBLStub implements ShipmentBLService {
	ShipmentVO vo;


	public void add(String id) {
		// TODO Auto-generated method stub

	}


	public void end() {
		// TODO Auto-generated method stub

	}


	public boolean submit(ShipmentVO vo) {
		// TODO Auto-generated method stub
		System.out.println("出库单提交成功");
		return true;
	}

}
