package com.kdh.cafe.order;

import java.util.HashMap;
import java.util.List;

public interface orderService {
	
	void insertOrder(HashMap<String, Object> map); 
	void insertOrderList(orderListVO vo);
	void updateOrder(orderVO vo);
	
	//�ֹ� ��ȸ
	List<orderVO> getOrder (orderVO vo); 
	//�ֹ� �� ��ȸ
	List<orderListVO> getOrderList(orderListVO vo);
	
	void deleteOrder(orderVO vo);
}
