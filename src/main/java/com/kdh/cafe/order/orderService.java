package com.kdh.cafe.order;

import java.util.HashMap;
import java.util.List;

public interface orderService {
	
	void insertOrder(HashMap<String, Object> map); 
	void insertOrderList(orderListVO vo);
	void updateOrder(orderVO vo);
	
	//주문 조회
	List<orderVO> getOrder (orderVO vo); 
	//주문 상세 조회
	List<orderListVO> getOrderList(orderListVO vo);
	
	void deleteOrder(orderVO vo);
}
