package com.it.ssm.utils;

import java.util.HashMap;
import java.util.Map;

public class PageUtil {

    /**
    * @Title: setPageParam
    * @Description: TODO(这里用一句话描述这个方法的作用)
    * @param @param pageNo 第几页
    * @param @param pageRow 页容量  每页大小 pageSize
    * @param @param totalRows 总行数
    * @param @param paramMap 其他查询参数
    * @param @return    参数
    * @return Map<String,Object>    返回类型
    * @throws
    */
    public static Map<String, Object> setPageParam(int pageNo, int pageRow, int totalRows, Map<String, Object> paramMap)
    {
    	Map<String, Object> pageMap = new HashMap<String, Object>(paramMap);
    	// 计算总页数
    	int total_page = (totalRows % pageRow == 0)
				? (totalRows / pageRow)
				: (totalRows / pageRow + 1);
		System.out.println("total_page:" + total_page);
		if (pageNo < 1) {
			pageNo = 1;
		}

		if (pageNo > total_page) {
			pageNo = total_page;
		}
		int startIndex = (pageNo - 1) * pageRow;
		pageMap.put("startIndex", startIndex);
		pageMap.put("pageRow", pageRow);
    	return pageMap;
    }
}
