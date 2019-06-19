package com.kdh.cafe.cart;

import java.util.HashMap;
import java.util.List;

public interface cartService {
	void insertCart(HashMap<String, Object> map);
	List<cartVO>getCartList(HashMap<String, Object> map);
	void deleteCart(HashMap<String, Object> map);
}
