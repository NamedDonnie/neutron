package pers.donnie.result;

import java.io.Serializable;
import java.util.List;

public class EasyUIDatagridResult<T> implements Serializable {
	//这个的作用是???private static final long serialVersionUID = -6997346647919864515L;
	//总条数
	private Long total;
	//结果集
	private List<T> rows;
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
}
