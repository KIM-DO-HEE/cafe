package com.kdh.cafe.order;

import java.util.List;

public interface orderService {
	void insertOrder(orderVO vo);
	void updateOrder(orderVO vo);
	List<orderVO> getOrderList(orderVO vo);
	void deleteOrder(orderVO vo);
}
