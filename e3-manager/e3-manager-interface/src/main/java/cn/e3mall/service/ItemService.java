package cn.e3mall.service;

import cn.e3mall.pojo.EasyUIDatagridResult;
import cn.e3mall.pojo.TbItem;

public interface ItemService {

	TbItem getItemById(Long itemId);
	public EasyUIDatagridResult getItemList(int page, int rows);
}
